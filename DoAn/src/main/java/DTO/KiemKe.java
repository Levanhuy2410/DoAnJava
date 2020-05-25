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

    public KiemKe(int maKK, String ngayTao) {
        this.maKK = maKK;
        this.ngayTao = ngayTao;
    }

    public KiemKe(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public KiemKe() {
    }
    
}
