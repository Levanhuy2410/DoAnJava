/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author USER
 */
public class NhanVien {
    public String maNV;
    public String tenNV;
    public String chucVu;
    public String ngayVL;
    public String ngaySinh;
    public String sdt;
    public String email;
    public int mucLuong;
    public String username;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String chucVu, String ngayVL, String ngaySinh, String sdt, String email, int mucLuong, String username) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.ngayVL = ngayVL;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.email = email;
        this.mucLuong = mucLuong;
        this.username = username;
    }
    
}
