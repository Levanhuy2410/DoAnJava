-- Generated by Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   at:        2020-05-05 09:29:49 ICT
--   site:      Oracle Database 11g
--   type:      Oracle Database 11g



CREATE TABLE cthoadon (
    masp    NUMBER NOT NULL,
    mahd    NUMBER NOT NULL,
    sl      INTEGER,
    trigia  NUMBER(8)
);
alter table cthoadon modify mahd number;
alter table cthoadon modify masp number;
ALTER TABLE cthoadon ADD CONSTRAINT cthoadon_pk PRIMARY KEY ( mahd,
                                                              masp );

CREATE TABLE ctphieukk (
    masp       NUMBER NOT NULL,
    makk       NUMBER NOT NULL,
    slhethong  INTEGER,
    slt        INTEGER,
    lydo       VARCHAR2(50)
);
alter table ctphieukk modify masp number;
alter table ctphieukk modify makk number;

ALTER TABLE ctphieukk ADD CONSTRAINT ctphieunhapv1_pk PRIMARY KEY ( masp,
                                                                    makk );

CREATE TABLE ctphieunhap (
    masp     NUMBER NOT NULL,
    manh     NUMBER NOT NULL,
    slnhap   INTEGER,
    gianhap  NUMBER(8)
);
alter table ctphieunhap modify manh number;
alter table ctphieunhap modify masp number;

ALTER TABLE ctphieunhap ADD CONSTRAINT ctphieunhap_pk PRIMARY KEY ( masp,
                                                                    manh );

CREATE TABLE ctphieuxuat (
    masp    NUMBER NOT NULL,
    maxh    NUMBER NOT NULL,
    slxuat  INTEGER
);
alter table ctphieuxuat modify maxh number;
alter table ctphieuxuat modify masp number;
ALTER TABLE ctphieuxuat ADD CONSTRAINT ctphieuxuat_pk PRIMARY KEY ( masp,
                                                                    maxh );

CREATE TABLE hoadon (
    mahd    NUMBER NOT NULL,
    ngayhd  DATE,
    makh    NUMBER NOT NULL,
    manv    NUMBER NOT NULL
);

alter table hoadon modify mahd number;
alter table hoadon modify makh number;
alter table hoadon modify manv number;
ALTER TABLE hoadon ADD CONSTRAINT hoadon_pk PRIMARY KEY ( mahd );

CREATE TABLE khthanhvien (
    matv    NUMBER NOT NULL,
    tentv   VARCHAR2(50),
    loaitv  VARCHAR2(50),
    sdt     VARCHAR2(50),
    email   VARCHAR2(50),
    diemtv  INTEGER
);
alter table khthanhvien modify matv number;

ALTER TABLE khthanhvien ADD CONSTRAINT khthanhvien_pk PRIMARY KEY ( matv );

CREATE TABLE loaisp (
    malsp   NUMBER NOT NULL,
    tenlsp  VARCHAR2(50)
);
alter table loaisp modify malsp number;

ALTER TABLE loaisp ADD CONSTRAINT loaisp_pk PRIMARY KEY ( malsp );

CREATE TABLE nhanvien (
    manv      NUMBER
        CONSTRAINT nnc_nhanvien_manv NOT NULL,
    tennv     VARCHAR2(50),
    chucvu    VARCHAR2(50),
    ngayvl    DATE,
    ngaysinh  DATE,
    sdt       VARCHAR2(50),
    email     VARCHAR2(50),
    mucluong  NUMBER(10)
);
ALTER Table nhanvien drop column username;

ALTER Table nhanvien add username varchar2(50);
ALTER TABLE nhanvien ADD CONSTRAINT nhanvien_pk PRIMARY KEY ( manv );
ALTER TABLE nhanvien DROP CONSTRAINT nhanvien_pk;
CREATE TABLE phieukk (
    makk     NUMBER NOT NULL,
    ngaytao  DATE
);
alter table phieukk modify makk number;

ALTER TABLE phieukk ADD CONSTRAINT phieuxhv1_pk PRIMARY KEY ( makk );

CREATE TABLE phieunh (
    manh    NUMBER NOT NULL,
    ngaynh  DATE,
    nhacc   VARCHAR2(50)
);
alter table phieunh modify manh number;

ALTER TABLE phieunh ADD CONSTRAINT phieunh_pk PRIMARY KEY ( manh );

CREATE TABLE phieuxh (
    maxh    NUMBER NOT NULL,
    ngayxh  DATE
);

alter table phieuxh modify maxh number;
ALTER TABLE phieuxh ADD CONSTRAINT phieuxh_pk PRIMARY KEY ( maxh );

CREATE TABLE sanpham (
    masp    NUMBER NOT NULL,
    tensp   VARCHAR2(50),
    giaban  NUMBER(8),
    tgbh    NUMBER,
    hangsx  VARCHAR2(50),
    slton   INTEGER,
    mota    VARCHAR2(50),
    malsp   VARCHAR2(50) NOT NULL
);
alter table sanpham modify masp number;

ALTER TABLE sanpham ADD CONSTRAINT sanpham_pk PRIMARY KEY ( masp );

CREATE TABLE taikhoan (
    username  VARCHAR2(50) NOT NULL,
    password  VARCHAR2(50),
    loaitk    VARCHAR2(50)
);
alter table taikhoan modify manv number;

ALTER TABLE taikhoan ADD CONSTRAINT taikhoan_pk PRIMARY KEY ( username );

ALTER TABLE cthoadon
    ADD CONSTRAINT cthoadon_hoadon_fk FOREIGN KEY ( mahd )
        REFERENCES hoadon ( mahd );

ALTER TABLE cthoadon
    ADD CONSTRAINT cthoadon_sanpham_fk FOREIGN KEY ( masp )
        REFERENCES sanpham ( masp );

ALTER TABLE ctphieukk
    ADD CONSTRAINT ctphieukk_phieukk_fk FOREIGN KEY ( makk )
        REFERENCES phieukk ( makk );

ALTER TABLE ctphieukk
    ADD CONSTRAINT ctphieukk_sanpham_fk FOREIGN KEY ( masp )
        REFERENCES sanpham ( masp );

ALTER TABLE ctphieunhap
    ADD CONSTRAINT ctphieunhap_phieunh_fk FOREIGN KEY ( manh )
        REFERENCES phieunh ( manh );

ALTER TABLE ctphieunhap
    ADD CONSTRAINT ctphieunhap_sanpham_fk FOREIGN KEY ( masp )
        REFERENCES sanpham ( masp );

ALTER TABLE ctphieuxuat
    ADD CONSTRAINT ctphieuxuat_phieuxh_fk FOREIGN KEY ( maxh )
        REFERENCES phieuxh ( maxh );

ALTER TABLE ctphieuxuat
    ADD CONSTRAINT ctphieuxuat_sanpham_fk FOREIGN KEY ( masp )
        REFERENCES sanpham ( masp );

ALTER TABLE hoadon
    ADD CONSTRAINT hoadon_khthanhvien_fk FOREIGN KEY ( makh )
        REFERENCES khthanhvien ( matv );

ALTER TABLE hoadon
    ADD CONSTRAINT hoadon_nhanvien_fk FOREIGN KEY ( manv )
        REFERENCES nhanvien ( manv );

ALTER TABLE taikhoan
    ADD CONSTRAINT taikhoan_nhanvien_fk FOREIGN KEY ( manv )
        REFERENCES nhanvien ( manv ) ON DELETE CASCADE;
        
alter table nhanvien drop CONSTRAINT nhanvien_taikhoan_fk;
ALTER TABLE sanpham
    ADD CONSTRAINT sanpham_loaisp_fk FOREIGN KEY ( malsp )
        REFERENCES loaisp ( malsp );
alter table sanpham drop constraint sanpham_loaisp_fk;
ALTER TABLE SANPHAM MODIFY MALSP NUMBER;      
drop sequence id_manv;
drop sequence id_mahd;
drop sequence id_malsp;
drop sequence id_matv;
drop sequence id_phieukk;
drop sequence id_phieunhap;
drop sequence id_phieuxuat;
drop sequence id_masp;

drop table CTHOADON;
drop table CTPHIEUKK;
drop table CTPHIEUNHAP;
drop table CTPHIEUXUAT;
drop table HOADON;
drop table KHTHANHVIEN;
drop table LOAISP;
drop table NHANVIEN;
drop table PHIEUKK;
drop table PHIEUNH;
drop table PHIEUXH;
drop table SANPHAM;
drop table TAIKHOAN;
-- MANV SEQUENCE
CREATE SEQUENCE id_manv
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 10000
    NOCYCLE
    NOCACHE;
-- MAHD SEQUENCE
CREATE SEQUENCE id_mahd
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 10000
    NOCYCLE
    NOCACHE;
-- MAPN SEQUENCE
CREATE SEQUENCE id_phieunhap
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 10000
    NOCYCLE
    NOCACHE;
-- MAPX SEQUENCE
CREATE SEQUENCE id_phieuxuat
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 10000
    NOCYCLE
    NOCACHE;
-- MAKK SEQUENCE
CREATE SEQUENCE id_phieukk
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 10000
    NOCYCLE
    NOCACHE;
-- MASP SEQUENCE
CREATE SEQUENCE id_masp
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 10000
    NOCYCLE
    NOCACHE;
-- MATV SEQUENCE
CREATE SEQUENCE id_matv
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 10000
    NOCYCLE
    NOCACHE;
-- MALSP SEQUENCE
CREATE SEQUENCE id_malsp
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 10000
    NOCYCLE
    NOCACHE;
    
INSERT INTO NHANVIEN (MANV, TENNV, CHUCVU, NGAYVL, NGAYSINH, MUCLUONG) VALUES(id_manv.NEXTVAL, 'H�ng', 'Qu?n l�',
            TO_DATE('2020-10-10','YYYY-MM-DD'), TO_DATE('2000-10-02','YYYY-MM-DD'), '1500000');
-- Oracle SQL Developer Data Modeler Summary Report: 
alter table taikhoan add manv number not null;

SELECT TENNV, CHUCVU, EMAIL, SDT
FROM NHANVIEN nv JOIN TAIKHOAN tk
ON nv.manv = tk.manv
where tk.username = 'Huy';
-- 
-- CREATE TABLE                            13
-- CREATE INDEX                             0
-- ALTER TABLE                             25
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
