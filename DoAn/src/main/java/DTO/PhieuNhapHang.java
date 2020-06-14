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
public class PhieuNhapHang {
  public int maNh;
  public String ngayNh;
  public String nhaCc;
  public int maNv;
  public int tongTien;

  public PhieuNhapHang(int maNh, String ngayNh, String nhaCc, int maNv, int tongTien) {
    this.maNh = maNh;
    this.ngayNh = ngayNh;
    this.nhaCc = nhaCc;
    this.maNv = maNv;
    this.tongTien = tongTien;
  }
  public PhieuNhapHang(String ngayNh, String nhaCc, int maNv, int tongTien) {
    this.ngayNh = ngayNh;
    this.nhaCc = nhaCc;
    this.maNv = maNv;
    this.tongTien = tongTien;
  }
  
}
