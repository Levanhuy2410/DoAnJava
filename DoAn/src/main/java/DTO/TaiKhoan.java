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
public class TaiKhoan {
    public String username;
    public String password;
    public String loaiTK;
    public int maNV;

    public TaiKhoan(String username, String password, String loaiTK, int maNV) {
        this.username = username;
        this.password = password;
        this.loaiTK = loaiTK;
        this.maNV = maNV;
    }

    public TaiKhoan(String username, String password, String loaiTK) {
        this.username = username;
        this.password = password;
        this.loaiTK = loaiTK;
    }
    
    public TaiKhoan() {
    }
    
}
