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
public class KiemKe {
    public int maKK;
    public String ngayTao;
    public int maNV;
    public String tenNV;

    public KiemKe(int maKK, String ngayTao, int maNV) {
        this.maKK = maKK;
        this.ngayTao = ngayTao;
        this.maNV = maNV;
    }

    public KiemKe(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public KiemKe(String ngayTao, int maNV) {
        this.ngayTao = ngayTao;
        this.maNV = maNV;
    }

    public KiemKe(int maKK, String ngayTao, String tenNV) {
        this.maKK = maKK;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
    }
    
    public KiemKe() {
    }
    
}
