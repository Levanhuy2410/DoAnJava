/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVienDAL;
import DTO.NhanVien;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NhanVienBLL {

    public NhanVienDAL NhanVienDAL = new NhanVienDAL();
    public TaiKhoanBLL TaiKhoanBLL = new TaiKhoanBLL();

    public static ArrayList<NhanVien> NhanVienAll() {
        return DAL.NhanVienDAL.getListNhanVien();
    }
    private Component rootPane;
    public boolean insertNhanVien(String tenNV, String chucVu, String ngayVL, String ngaySinh, String sdt, String email, int mucLuong){
        NhanVien nv = new NhanVien(tenNV, chucVu, ngayVL, ngaySinh, sdt, email, mucLuong);
        return NhanVienDAL.insertNhanVien(nv);
    }
    public int getMaNV(){
       return NhanVienDAL.getMaNV();
    }
//    public boolean insertNhanVien(String tenNV, String chucVu, String ngayVL, String ngaySinh, String sdt, String email, String mucLuong, String username, String password, String repass) {
//        if (tenNV.isEmpty() || chucVu.isEmpty() || ngayVL.isEmpty() || ngaySinh.isEmpty() || mucLuong.isEmpty() || username.isEmpty()) {
//            JOptionPane.showMessageDialog(rootPane, "Dữ liệu không được để trống", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
//            return false;
//        } else if (!password.equals(repass)) {
//            JOptionPane.showMessageDialog(rootPane, "Password nhập lại không trùng", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
//            return false;
//        } else if (TaiKhoanBLL.kiemTraTrungUsername(username)) {
//            JOptionPane.showMessageDialog(rootPane, "Tên username bị trùng", "Lỗi", JOptionPane.ERROR_MESSAGE);
//            return false;
//        } else {
//            return NhanVienDAL.insertNhanVien(tenNV, chucVu, ngayVL, ngaySinh, sdt, email, mucLuong, username);
//        }
//    }
//
    public boolean deleteNhanVien(String MaNV) {
        
        return NhanVienDAL.deleteNhanVien(MaNV);
    }
//
    public boolean updateNhanVien(int maNV, String tenNV, String chucVu, String ngayVL, String ngaySinh, String sdt, String email, int mucLuong) {
        NhanVien nv = new NhanVien(maNV, tenNV, chucVu, ngayVL, ngaySinh, sdt, email, mucLuong);
        if (nv.tenNV.isEmpty() || nv.chucVu.isEmpty() || nv.ngayVL.isEmpty() || nv.ngaySinh.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Dữ liệu không được để trống", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return NhanVienDAL.updateNhanVien(nv);
        }
    }
//    public int getMaNV(String username){
//        return NhanVienDAL.getMaNV(username);
//    }
}
