--exec insert_cthd(23, 56, 3);
--insert into hoadon values (69, TO_DATE('11/06/2020', 'dd/MM/yyyy'), 1, 1, 0);
--commit;

select slton from sanpham where masp = 23;
set transaction isolation level serializable;
DECLARE 
    v_masp_array MASP_ARRAY;
    v_sl_array   SL_ARRAY;
BEGIN
    v_masp_array := MASP_ARRAY(23);
    v_sl_array := SL_ARRAY(3);
    INSERT_HOADON(58, v_masp_array, v_sl_array, 1, 1, to_date('15/06/2020', 'dd/MM/yyyy'));
END;
commit;

create or replace type table_REPORT AS TABLE OF ROW_REPORT;
create or replace type ROW_REPORT AS OBJECT
(
    mahd      NUMBER,
    ngayhd    DATE,
    tentv     VARCHAR2(50),
    tennv     VARCHAR2(50),
    tongtien  NUMBER
);
-- tao report 
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









