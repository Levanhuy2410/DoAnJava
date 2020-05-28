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
public class HoaDon {
  public int maHd;
  public String ngayHd;
  public int maKh;
  public int maNv;
  public int triGia;
  public String tenKh;
  public String tenNv;
  public HoaDon(int maHd, String ngayHd, int maKh, int maNv, int trigia) {
    this.maHd = maHd;
    this.ngayHd = ngayHd;
    this.maKh = maKh;
    this.maNv = maNv;
    this.triGia = trigia;
  }
  public HoaDon(int maHd, String ngayHd, int maKh, int maNv, int trigia, String tenkh, String tennv) {
    this.maHd = maHd;
    this.ngayHd = ngayHd;
    this.maKh = maKh;
    this.maNv = maNv;
    this.triGia = trigia;
    this.tenKh = tenkh;
    this.tenNv = tennv;
  }
  public HoaDon(String ngayHd, int maKh, int maNv, int trigia, String tennv, String tenkh) {
    this.ngayHd = ngayHd;
    this.maKh = maKh;
    this.maNv = maNv;
    this.triGia = trigia;
  }
}
