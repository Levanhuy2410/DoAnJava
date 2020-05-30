/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Cong
 */
public class SanPham {
  public int maSp;
  public String tenSp;
  public int giaBan;
  public int tgbh;
  public String hangSx;
  public int slTon;
  public String mota;
  public int maLsp;
  public String tenLsp;

  public SanPham() {
    tenSp = hangSx = mota = "";
    maSp = giaBan = tgbh = slTon = maLsp = 0;
  }

  public SanPham(int maSp, String tenSp, int giaBan, int tgbh, String hangSx, int slTon, String mota, int maLsp, String tenLsp) {
    this.maSp = maSp;
    this.tenSp = tenSp;
    this.giaBan = giaBan;
    this.tgbh = tgbh;
    this.hangSx = hangSx;
    this.slTon = slTon;
    this.mota = mota;
    this.maLsp = maLsp;
    this.tenLsp = tenLsp;
  }
  public SanPham(String tenSp, int giaBan, int tgbh, String hangSx, int slTon, String mota, int maLsp) {
    this.tenSp = tenSp;
    this.giaBan = giaBan;
    this.tgbh = tgbh;
    this.hangSx = hangSx;
    this.slTon = slTon;
    this.mota = mota;
    this.maLsp = maLsp;
  }
  
}
