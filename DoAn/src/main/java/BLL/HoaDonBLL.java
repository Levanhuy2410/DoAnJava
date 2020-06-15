/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.HoaDonDAL;
import DAL.TaiKhoanDAL;
import DTO.HoaDon;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Cong
 */
public class HoaDonBLL {
  public static int insertHoaDon(int maKh, String username, int triGia) {
    int maHd = HoaDonDAL.getMaHd();
    int maNv = TaiKhoanDAL.getManvByUsername(username);
    String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    HoaDon hoadon = new HoaDon(maHd, timeStamp, maKh, maNv, triGia);
    if (HoaDonDAL.insertHoaDon(hoadon)) return maHd;
    else return -1;
  }
  public static List<HoaDon> getAllHoaDon() {
    return HoaDonDAL.getAllHoaDon();
  }
  public static boolean deleteHoaDon(int maHd) {
    return HoaDonDAL.deleteHoaDon(maHd);
  }
}
