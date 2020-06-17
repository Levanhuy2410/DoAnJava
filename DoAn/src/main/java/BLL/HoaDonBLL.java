/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.HoaDonDAL;
import DTO.CTHoaDon;
import DTO.HoaDon;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Cong
 */
public class HoaDonBLL {
  public static boolean insertHoaDon(int maKh, int maNv, List<CTHoaDon> cthoadon) {
    int slSanPham = cthoadon.size();
    
    int[] masp = new int[slSanPham];
    int[] sl = new int[slSanPham];
    
    for (int i = 0; i < slSanPham; i++) {
      masp[i] = cthoadon.get(i).maSp;
      sl[i] = cthoadon.get(i).soLuong;
    }
    
    String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
    return HoaDonDAL.insertHoaDon(masp, sl, timeStamp);
  }
  public static List<HoaDon> getAllHoaDon() {
    return HoaDonDAL.getAllHoaDon();
  }
  public static boolean deleteHoaDon(int maHd) {
    return HoaDonDAL.deleteHoaDon(maHd);
  }
//  public static void main(String[] args) {
//    List<CTHoaDon> cthoadon = new ArrayList<>();
//    CTHoaDon sp1 = new CTHoaDon(18, 1);
//    CTHoaDon sp2 = new CTHoaDon(19, 1);
//    cthoadon.add(sp1);
//    cthoadon.add(sp2);
//    
//    System.out.println(insertHoaDon(1, "cong", cthoadon));
//  }
}
