-- Trigger set loai thanh vien
CREATE OR REPLACE TRIGGER SET_LOAITV
BEFORE UPDATE OR INSERT
ON KHTHANHVIEN
FOR EACH ROW
DECLARE 
    V_LOAITV KHTHANHVIEN.LOAITV%TYPE;
BEGIN
    IF :NEW.DIEMTV >= 10000 THEN
        :NEW.LOAITV := 'Vip';
    ELSE 
        :NEW.LOAITV := 'Standard';
    END IF;
END;
-- TRIGGER UPDATE SANPHAM KHI THEM CTHD (cai nay cho lost update)
CREATE OR REPLACE TRIGGER UPDATE_QUANTITY_SP
BEFORE INSERT ON CTHOADON
FOR EACH ROW
DECLARE
    v_slton SANPHAM.SLTON%TYPE;
BEGIN
    lock table sanpham in exclusive mode;
    SELECT SLTON INTO v_slton FROM SANPHAM WHERE MASP = :NEW.MASP;
    IF INSERTING THEN
        IF (:NEW.SL <= v_slton)
        then
            UPDATE sanpham
            SET SLTON = v_slton-:new.SL
            WHERE MASP = :NEW.MASP;
        else 
            raise_application_error(-20010,'S? l??ng quá l?n');
        end if;
    END IF;
    sleep(13);
END;
COMMIT;
-- Thêm tr? giá vào t?ng ti?n khi thêm cthd
CREATE OR REPLACE TRIGGER ADD_COST_HOADON
BEFORE INSERT ON CTHOADON
FOR EACH ROW
DECLARE 
    v_diemtv    KHTHANHVIEN.DIEMTV%TYPE;
BEGIN
    SELECT TV.DIEMTV INTO v_diemtv FROM KHTHANHVIEN TV JOIN HOADON HD ON TV.MATV = HD.MAKH WHERE MAHD = :NEW.MAHD;
    IF v_diemtv >=5000 THEN
        :NEW.TRIGIA := :NEW.TRIGIA * 0.95;
    ELSIF v_diemtv >= 10000 THEN
        :NEW.TRIGIA := :NEW.TRIGIA * 0.9;
    END IF;
    IF INSERTING THEN
        UPDATE hoadon
        SET TONGTIEN=TONGTIEN+:NEW.TRIGIA
        WHERE MAHD = :NEW.MAHD;
    END IF;
END;
-- Thêm ?i?m thành viên khi thêm cth?
CREATE OR REPLACE TRIGGER BONUS_POINT
BEFORE INSERT ON CTHOADON
FOR EACH ROW
DECLARE
    v_makh  KHTHANHVIEN.MATV%TYPE;
BEGIN
    SELECT MAKH into v_makh FROM HOADON HD WHERE HD.MAHD = :NEW.MAHD;
    IF INSERTING THEN
        IF (v_makh != 0)
        THEN
                UPDATE KHTHANHVIEN
                SET DIEMTV=DIEMTV+(:NEW.TRIGIA/10000)
                WHERE MATV = v_makh;
        END IF;
    END IF;
END;
-- Kiem tra tu?i nhân viên
CREATE OR REPLACE TRIGGER CHECK_AGE
BEFORE INSERT OR UPDATE ON NHANVIEN
FOR EACH ROW
DECLARE
    v_age   NUMBER;
BEGIN
    v_age :=  trunc((to_number(to_char(:NEW.NGAYVL,'YYYYMMDD'))- to_number(to_char(:NEW.NGAYSINH,'YYYYMMDD')))/10000);
    IF (v_age >= 18) then
        DBMS_OUTPUT.PUT_LINE('Thông tin hop le');
    ELSE 
        RAISE_APPLICATION_ERROR(-20001,'Tuoi nhan vien phai lon hon 18');
    END IF;
END;
-- Trigger them so luong ton khi them chi tiet phieu nhap
CREATE OR REPLACE TRIGGER ADD_QUANTITY_SANPHAM
BEFORE INSERT ON CTPHIEUNHAP
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        UPDATE SANPHAM
        SET SLTON=SLTON+:NEW.SLNHAP
        WHERE MASP = :NEW.MASP;
    END IF;
END;
-- Trigger add t?ng ti?n khi thêm chi ti?t phi?u nh?p
CREATE OR REPLACE TRIGGER ADD_COST_PHIEUNHAP
BEFORE INSERT ON CTPHIEUNHAP
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        UPDATE PHIEUNH
        SET TONGTIEN=TONGTIEN+:NEW.GIANHAP
        WHERE MANH = :NEW.MANH;
    END IF;
END;
-- Trigger update s? l??ng s?n ph?m khi thêm chi ti?t ki?m kê
CREATE OR REPLACE TRIGGER UPDATE_QUANTITY_SP_KK
BEFORE INSERT ON CTPHIEUKK
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        UPDATE SANPHAM
        SET SLTON=:NEW.SLT
        WHERE MASP = :NEW.MASP;
    END IF;
END;
