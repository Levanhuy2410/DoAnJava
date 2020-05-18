/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.SanPhamDAL;
import DTO.SanPham;

/**
 *
 * @author Cong
 */
public class SanPhamBLL {
  SanPhamDAL sanphamDAL = new SanPhamDAL();
  public boolean themSanPham(String tenSp, int giaBan, int tgbh, String hangSx, int slTon, String mota, int maLsp) {
    SanPham sanpham = new SanPham(tenSp, giaBan, tgbh, hangSx, slTon, mota, maLsp);
    return sanphamDAL.themSanPham(sanpham);
  }
  
}
