--START TRANSACTION;
--SET TRANSACTION ISOLATION LEVEL READ COMMITTED;
--INSERT INTO HOADON VALUES(id_mahd.nextval, TO_DATE('2020-05-05', 'yyyy-MM-dd'), 6, 64);
--
--update khthanhvien set diemtv = diemtv-10 where matv = 6;
--
--update khthanhvien set loaitv = 'VIP' where matv = 6;
--SET AUTOCOMMIT OFF
--select matv, diemtv from khthanhvien where matv = 6;



-- LOST UPDATE
SELECT slton from sanpham where masp = 15;

--update sanpham set slton=slton+5 where masp = 15;
--commit;

INSERT INTO CTHOADON VALUES(15,7,3,150000);

declare
    v_slton SANPHAM.SLTON%TYPE;
begin
    select slton into v_slton from sanpham where masp = 15;
    v_slton:=v_slton-3;
    sleep(7);
    update sanpham set slton=v_slton where masp = 15;
    commit;
end;