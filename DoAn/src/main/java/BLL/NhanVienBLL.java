/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.NhanVienDAL;
import DTO.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class NhanVienBLL {
    public NhanVienDAL NhanVienDAL = new NhanVienDAL();
    
    public static ArrayList<NhanVien> NhanVienAll(){
        return DAL.NhanVienDAL.getListNhanVien();
    }
    
    public boolean insertNhanVien(String tenNV, String chucVu, String ngayVL, String ngaySinh, int mucLuong, String username){
        return NhanVienDAL.insertNhanVien(tenNV, chucVu, ngayVL, ngaySinh, mucLuong, username);
    }
    
    public boolean deleteNhanVien(String MaNV){
        return NhanVienDAL.deleteNhanVien(MaNV);
    }
    
    public boolean updateNhanVien(String maNV, String tenNV, String chucVu, String ngayVL, String ngaySinh, int mucLuong){
        return NhanVienDAL.updateNhanVien(maNV, tenNV, chucVu, ngayVL, ngaySinh, mucLuong);
    }
}
