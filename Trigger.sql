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
BEGIN
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
-- Kiem tra so luong ton 
--Create or replace trigger KiemTraSoLuongTon
--Before insert on CTPHIEUKK 
--Begin
--    If(:NEW.SLT > 0) then
--        DBMS_OUTPUT.PUT_LINE('S? l??ng s?n ph?m trong kho ??');
--    RAISE_APPLICATION_ERROR(-20001,'S? l??ng s?n ph?m trong kho không ?? ?? ph?c v?');
--    End if;
--End;