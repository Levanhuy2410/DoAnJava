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
public class CTKiemKe {
    public int maSP;
    public int maKK;
    public int slHeThong;
    public int slTon;
    public String lyDo;
    public String tenSp;

    public CTKiemKe(int maSP, String tenSp, int maKK, int slHeThong, int slTon, String lyDo) {
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.maKK = maKK;
        this.slHeThong = slHeThong;
        this.slTon = slTon;
        this.lyDo = lyDo;
    }
    public CTKiemKe(int maSP, int maKK, int slHeThong, int slTon, String lyDo) {
        this.maSP = maSP;
        this.maKK = maKK;
        this.slHeThong = slHeThong;
        this.slTon = slTon;
        this.lyDo = lyDo;
    }
    public CTKiemKe(int slHeThong, int slTon, String lyDo) {
        this.slHeThong = slHeThong;
        this.slTon = slTon;
        this.lyDo = lyDo;
    }

    public CTKiemKe() {
    }
}
