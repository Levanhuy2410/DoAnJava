-- PROCEDURE NÂNG C?P THÀNH VIÊN T? STANDARD LÊN VIP N?U ?I?M TV > 100
SELECT DIEMTV, LOAITV FROM KHTHANHVIEN WHERE MATV = '6';
CREATE OR REPLACE PROCEDURE UPGRADE_LOAITV
AS 
    V_MATV      KHTHANHVIEN.MATV%TYPE;
    V_TENTV     KHTHANHVIEN.TENTV%TYPE;
    V_LOAITV    KHTHANHVIEN.LOAITV%TYPE;
    V_DIEMTV    KHTHANHVIEN.DIEMTV%TYPE;
    CURSOR cur IS SELECT MATV, TENTV, LOAITV, DIEMTV
                FROM KHTHANHVIEN;
BEGIN
    OPEN cur;
    LOOP
        FETCH cur INTO V_MATV, V_TENTV, V_LOAITV, V_DIEMTV;
        EXIT WHEN cur%FOUND = FALSE;
        IF V_DIEMTV > 100 THEN
            UPDATE KHTHANHVIEN
            SET LOAITV = 'Vip'
            WHERE V_MATV = MATV;
            DBMS_OUTPUT.PUT_LINE(V_MATV||' '||V_TENTV);
        END IF;
    END LOOP;
    CLOSE cur;
    commit;
END;
EXEC UPGRADE_LOAITV;

-- PROCEDURE SLEEP
CREATE OR REPLACE PROCEDURE sleep (in_time number)
AS
    v_now date;
    BEGIN
        SELECT SYSDATE
        INTO v_now
        FROM DUAL;
    LOOP
    EXIT WHEN v_now + (in_time * (1/86400)) <= SYSDATE;
    END LOOP;
end;


-- PROCEDURE L?Y RA T?NG S? TI?N MÀ KHTHANHVIEN ?Ã CHI VÀO CÁC HÓA ??N
CREATE OR REPLACE function TOTAL_COST_FOR_MEMBER (V_MATV KHTHANHVIEN.MATV%TYPE)
return CTHOADON.TRIGIA%TYPE
AS
    V_TOTAL_COST CTHOADON.TRIGIA%TYPE;
BEGIN
    SELECT  SUM(CTHD.TRIGIA) INTO V_TOTAL_COST
    FROM    (KHTHANHVIEN TV JOIN HOADON HD ON HD.MAKH = TV.MATV)
            JOIN CTHOADON CTHD ON CTHD.MAHD = HD.MAHD
    WHERE   TV.MATV = V_MATV;
    RETURN V_TOTAL_COST;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN RETURN NULL;       
END;

BEGIN
    dbms_output.PUT_LINE('T?ng s? ti?n thành viên này ?ã chi cho c?a hàng '||total_cost_for_member(99));
END;

-- Procedure in ra các hóa ??n mà nhân viên ?ã l?p
CREATE OR REPLACE PROCEDURE NHANVIEN_HOADON
IS
    V_MANV  NHANVIEN.MANV%TYPE;
    V_TENNV NHANVIEN.TENNV%TYPE;
    
    CURSOR C_1 IS SELECT MANV, TENNV
                FROM NHANVIEN;
BEGIN
    OPEN C_1;
    LOOP 
        FETCH C_1 INTO V_MANV, V_TENNV;
        EXIT WHEN C_1%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(V_MANV||' '||V_TENNV);
        DECLARE
            CURSOR C_2 IS   SELECT HD.MAHD, SUM(CTHD.TRIGIA) as tong
            FROM            HOADON HD JOIN CTHOADON CTHD ON HD.MAHD = CTHD.MAHD
            WHERE           HD.MANV = V_MANV
            GROUP BY        HD.MAHD;
            
            V_MAHD          HOADON.MAHD%TYPE;
            TONG_TIEN       NUMBER;
        BEGIN
            OPEN C_2;
            LOOP
                FETCH C_2 INTO V_MAHD, TONG_TIEN;
                EXIT WHEN C_2%NOTFOUND;
                IF C_2%FOUND THEN
                    DBMS_OUTPUT.PUT_LINE('Hóa ??n: '||V_MAHD||' có t?ng ti?n là: '||TONG_TIEN);
                END IF;
            END LOOP;
            CLOSE C_2;
        END;
    END LOOP;
    CLOSE C_1;
END;
EXEC NHANVIEN_HOADON();
-- insert cthd
--CREATE OR REPLACE PROCEDURE INSERT_CTHD(v_masp IN CTHOADON.MASP%TYPE,
--                                        v_mahd IN CTHOADON.MAHD%TYPE,
--                                        v_sl   IN CTHOADON.SL%TYPE)
--AS           
--    v_trigia CTHOADON.TRIGIA%TYPE;
--    v_giaban SANPHAM.GIABAN%TYPE;
--BEGIN
--    SELECT GIABAN into v_giaban FROM SANPHAM WHERE MASP = v_masp;
--    v_trigia := v_giaban*v_sl;
--    INSERT INTO CTHOADON VALUES(v_masp, v_mahd, v_sl, v_trigia);
--    COMMIT;
--END;
-- 
create or replace type table_REPORT AS TABLE OF ROW_REPORT;
create or replace type ROW_REPORT AS OBJECT
(
    mahd      NUMBER,
    ngayhd    DATE,
    tentv     VARCHAR2(50),
    tennv     VARCHAR2(50),
    tongtien  NUMBER
);
-- Function l?y ra các hóa ??n trong tháng
CREATE OR REPLACE FUNCTION CREATE_REPORT(v_month IN NUMBER, v_year IN NUMBER)
RETURN
    table_REPORT
AS
    v_tableTemp table_REPORT;
BEGIN
    SELECT ROW_REPORT(HD.MAHD, HD.NGAYHD, TV.TENTV, NV.TENNV, TONGTIEN)
    BULK COLLECT INTO v_tableTemp
    FROM HOADON HD JOIN KHTHANHVIEN TV ON HD.MAKH = TV.MATV
        JOIN NHANVIEN NV ON HD.MANV = NV.MANV
    WHERE EXTRACT (MONTH FROM HD.NGAYHD) = v_month AND EXTRACT (YEAR FROM HD.NGAYHD) = v_year;
    RETURN v_tableTemp;
END;


select * from table(create_report(6, 2020));
-- Procedure insert hoadon
SET TRANSACTION ISOLATION LEVEL READ COMMITTED;   
CREATE OR REPLACE TYPE MASP_ARRAY is VARRAY(100) OF number;
CREATE OR REPLACE TYPE SL_ARRAY is VARRAY(100) OF number;
CREATE OR REPLACE PROCEDURE INSERT_HOADON(v_mahd HOADON.MAHD%TYPE, v_masp_array MASP_ARRAY, v_sl_array SL_ARRAY,
                                            v_makh HOADON.MAKH%TYPE, v_manv HOADON.MANV%TYPE, v_ngayhd HOADON.NGAYHD%TYPE)
AS
    v_giaban SANPHAM.GIABAN%TYPE;
    v_trigia CTHOADON.TRIGIA%TYPE;
BEGIN
    
    FOR i IN v_sl_array.first .. v_sl_array.last LOOP
        IF (v_sl_array (i) <= 0) THEN
            raise_application_error(-20010,'So luong khong hop le');
        END IF;
    END LOOP; 
    INSERT INTO HOADON VALUES (v_mahd, v_ngayhd, v_makh, v_manv, 0);
    FOR i IN v_masp_array.first .. v_masp_array.last LOOP
        SELECT GIABAN into v_giaban FROM SANPHAM WHERE MASP = v_masp_array(i);
        v_trigia:=v_sl_array(i)*v_giaban;
        INSERT INTO CTHOADON VALUES (v_masp_array(i), v_mahd, v_sl_array(i), v_trigia);
        sleep(6);
    END LOOP;
    commit;
END;

DECLARE
    v_masp_array MASP_ARRAY;
    v_sl_array   SL_ARRAY;
BEGIN
    v_masp_array := MASP_ARRAY(20,23);
    v_sl_array := SL_ARRAY(1,1);
    INSERT_HOADON(61, v_masp_array, v_sl_array, 1, 1, to_date('15/06/2020', 'dd/MM/yyyy'));
END;

update sanpham set slton = slton - 1 where masp = 20;
exec sleep(7);
update sanpham set slton = slton - 1 where masp = 23;
