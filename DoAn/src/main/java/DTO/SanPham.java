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
  private int maSp;
  private String tenSp;
  private int giaBan;
  private int tgbh;
  private String hangSx;
  private int slTon;
  private String mota;
  private int maLsp;

  public SanPham() {
    tenSp = hangSx = mota = "";
    maSp = giaBan = tgbh = slTon = maLsp = 0;
  }

  public SanPham(int maSp, String tenSp, int giaBan, int tgbh, String hangSx, int slTon, String mota, int maLsp) {
    this.maSp = maSp;
    this.tenSp = tenSp;
    this.giaBan = giaBan;
    this.tgbh = tgbh;
    this.hangSx = hangSx;
    this.slTon = slTon;
    this.mota = mota;
    this.maLsp = maLsp;
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

  /**
   * @return the maSp
   */
  public int getMaSp() {
    return maSp;
  }


  /**
   * @return the tenSp
   */
  public String getTenSp() {
    return tenSp;
  }

  /**
   * @param tenSp the tenSp to set
   */
  public void setTenSp(String tenSp) {
    this.tenSp = tenSp;
  }

  /**
   * @return the giaBan
   */
  public int getGiaBan() {
    return giaBan;
  }

  /**
   * @param giaBan the giaBan to set
   */
  public void setGiaBan(int giaBan) {
    this.giaBan = giaBan;
  }

  /**
   * @return the tgbh
   */
  public int getTgbh() {
    return tgbh;
  }

  /**
   * @param tgbh the tgbh to set
   */
  public void setTgbh(int tgbh) {
    this.tgbh = tgbh;
  }

  /**
   * @return the hangSx
   */
  public String getHangSx() {
    return hangSx;
  }

  /**
   * @param hangSx the hangSx to set
   */
  public void setHangSx(String hangSx) {
    this.hangSx = hangSx;
  }

  /**
   * @return the slTon
   */
  public int getSlTon() {
    return slTon;
  }

  /**
   * @param slTon the slTon to set
   */
  public void setSlTon(int slTon) {
    this.slTon = slTon;
  }

  /**
   * @return the mota
   */
  public String getMota() {
    return mota;
  }

  /**
   * @param mota the mota to set
   */
  public void setMota(String mota) {
    this.mota = mota;
  }

  /**
   * @return the maLsp
   */
  public int getMaLsp() {
    return maLsp;
  }

  /**
   * @param maLsp the maLsp to set
   */
  public void setMaLsp(int maLsp) {
    this.maLsp = maLsp;
  }
  
}
