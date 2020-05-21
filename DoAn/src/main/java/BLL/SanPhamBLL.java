/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiSpDAL;
import DAL.SanPhamDAL;
import DTO.SanPham;
import java.util.List;

/**
 *
 * @author Cong
 */
public class SanPhamBLL {
  public boolean themSanPham(String tenSp, int giaBan, int tgbh, String hangSx, int slTon, String mota, int maLsp) {
    SanPham sanpham = new SanPham(tenSp, giaBan, tgbh, hangSx, slTon, mota, maLsp);
    return SanPhamDAL.themSanPham(sanpham);
  }
  public List<SanPham> getAllSanPham() {
    return SanPhamDAL.getAllSanPham();
  }
  public static boolean xoaSanPham(String idSanPham) {
    return SanPhamDAL.xoaSanPham(idSanPham);
  }
  public static boolean capnhatSanPham(int maSp, String tenSp, int giaBan, int tgbh, String hangSx, int slTon, String mota, String tenLsp) {
    int maLsp = LoaiSpDAL.getIdLoaispByName(tenLsp);
    if (maLsp != 0) {
      SanPham sanpham = new SanPham(maSp, tenSp, giaBan, tgbh, hangSx, slTon, mota, maLsp, tenLsp);
      return SanPhamDAL.capnhatSanPham(sanpham);
    }
    return false;
  }
  
}
