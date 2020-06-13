/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CTHDDAL;
import DTO.CTHD;

/**
 *
 * @author Cong
 */
public class CTHDBLL {
  public static boolean insertCTHD(int maSp, int maHd, int soLuong, int triGia) {
    CTHD ct = new CTHD(maSp, maHd, soLuong, triGia);
    return CTHDDAL.insertCTHD(ct);
  }
}
