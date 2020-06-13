/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CTHoaDonDAL;
import DTO.CTHoaDon;

/**
 *
 * @author Cong
 */
public class CTHoaDonBLL {
  public static boolean insertCTHD(int maSp, int maHd, int soLuong, int triGia) {
    CTHoaDon ct = new CTHoaDon(maSp, maHd, soLuong, triGia);
    return CTHoaDonDAL.insertCTHD(ct);
  }
}
