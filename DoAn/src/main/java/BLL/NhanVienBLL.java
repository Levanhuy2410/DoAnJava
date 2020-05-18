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

    public boolean insertNhanVien(String tenNV, String chucVu, String ngayVL, String ngaySinh, String mucLuong, String username, String password, String repass) {
        if (tenNV.isEmpty() || chucVu.isEmpty() || ngayVL.isEmpty() || ngaySinh.isEmpty() || mucLuong.isEmpty() || username.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Dữ liệu không được để trống", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!password.equals(repass)) {
            JOptionPane.showMessageDialog(rootPane, "Password nhập lại không trùng", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (TaiKhoanBLL.kiemTraTrungUsername(username)) {
            JOptionPane.showMessageDialog(rootPane, "Tên username bị trùng", "Lỗi trùng username", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return NhanVienDAL.insertNhanVien(tenNV, chucVu, ngayVL, ngaySinh, mucLuong, username);
        }
    }

    public boolean deleteNhanVien(String MaNV) {
        return NhanVienDAL.deleteNhanVien(MaNV);
    }

    public boolean updateNhanVien(String maNV, String tenNV, String chucVu, String ngayVL, String ngaySinh, String mucLuong) {
        if (tenNV.isEmpty() || chucVu.isEmpty() || ngayVL.isEmpty() || ngaySinh.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Dữ liệu không được để trống", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return NhanVienDAL.updateNhanVien(maNV, tenNV, chucVu, ngayVL, ngaySinh, mucLuong);
        }
    }
}
