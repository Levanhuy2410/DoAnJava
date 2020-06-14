/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CTPhieuNhapDAL;
import DTO.CTPhieuNhap;

/**
 *
 * @author Cong
 */
public class CTPhieuNhapBLL {
  public static boolean insertCTPhieuNhap(int maSp, int maNh, int slNhap, int giaNhap) {
    CTPhieuNhap ctpn = new CTPhieuNhap(maSp, maNh, slNhap, giaNhap);
    return CTPhieuNhapDAL.insertCTPhieuNhap(ctpn);
  }
  public static void main(String[] args) {
    System.out.println(insertCTPhieuNhap(19, 60, 1, 100000));
  }
}
