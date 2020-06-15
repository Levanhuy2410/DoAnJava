/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.PhieuNhapHangDAL;
import DAL.TaiKhoanDAL;
import DTO.PhieuNhapHang;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Cong
 */
public class PhieuNhapHangBLL {
  public static int insertPhieuNhapHang(String nhaCc, String username, int tongTien) {
    int maNh = PhieuNhapHangDAL.getMaPhieuNhap();
    int maNv = TaiKhoanDAL.getManvByUsername(username);
    String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    PhieuNhapHang pn = new PhieuNhapHang(maNh, timeStamp, nhaCc, maNv, tongTien);
    if (PhieuNhapHangDAL.insertPhieuNhapHang(pn)) return maNh;
    else return -1;
  }
  public static boolean deletePhieuNhapHang(int maNh) {
    return PhieuNhapHangDAL.deletePhieuNhapHang(maNh);
  }
  public static List<PhieuNhapHang> getAllPhieuNhapHang() {
    return PhieuNhapHangDAL.getAllPhieuNhapHang();
  }
  public static void main(String[] args) {
    System.out.println(insertPhieuNhapHang("CongTranCo", "cong", 15000));
  }
}
