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
public class ThanhVien {
    public int maTV;
    public String tenTV;
    public String loaiTV;
    public String sdt;
    public String email;
    public int diemTV;

    public ThanhVien() {
    }

    public ThanhVien(int maTV, String tenTV, String loaiTV, String sdt, String email, int diemTV) {
        this.maTV = maTV;
        this.tenTV = tenTV;
        this.loaiTV = loaiTV;
        this.sdt = sdt;
        this.email = email;
        this.diemTV = diemTV;
    }

    public ThanhVien(String tenTV, String loaiTV, String sdt, String email, int diemTV) {
        this.tenTV = tenTV;
        this.loaiTV = loaiTV;
        this.sdt = sdt;
        this.email = email;
        this.diemTV = diemTV;
    }

    public ThanhVien(int maTV, String tenTV, String loaiTV, String sdt, String email) {
        this.maTV = maTV;
        this.tenTV = tenTV;
        this.loaiTV = loaiTV;
        this.sdt = sdt;
        this.email = email;
    }
    
}
