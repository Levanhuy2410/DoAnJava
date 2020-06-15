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
    public static boolean insertSanPham(String tenSp, int giaBan, int tgbh, String hangSx, int slTon, String mota, int maLsp) {
        SanPham sanpham = new SanPham(tenSp, giaBan, tgbh, hangSx, slTon, mota, maLsp);
        return SanPhamDAL.insertSanPham(sanpham);
    }

    public static List<SanPham> getAllSanPham() {
        return SanPhamDAL.getAllSanPham();
    }

    public static boolean deleteSanPham(int idSanPham) {
        return SanPhamDAL.deleteSanPham(idSanPham);
    }

    public static boolean updateSanPham(int maSp, String tenSp, int giaBan, int tgbh, String hangSx, String mota, int maLsp) {
        if (maLsp != 0) {
            SanPham sanpham = new SanPham(maSp, tenSp, giaBan, tgbh, hangSx, mota, maLsp);
            return SanPhamDAL.updateSanPham(sanpham);
        }
        return false;
    }
    public static boolean updateSoLuongTon(int slTon, int maSP){
        return SanPhamDAL.updateSoLuongTon(slTon, maSP);
    } 
}
