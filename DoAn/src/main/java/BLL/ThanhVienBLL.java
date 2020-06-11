/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.ThanhVien;
import DAL.ThanhVienDAL;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ThanhVienBLL {

    ThanhVienDAL ThanhVienDAL = new ThanhVienDAL();

    public static ArrayList<ThanhVien> ThanhVienALL() {
        return DAL.ThanhVienDAL.getAllThanhVien();
    }

    public boolean insertThanhVien(String tenTV, String loaiTV, String sdt, String email, int diemTV) {
        ThanhVien tv = new ThanhVien(tenTV, loaiTV, sdt, email, diemTV);
        if (tv.tenTV.isEmpty() || tv.loaiTV.isEmpty() || tv.email.isEmpty() || tv.sdt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống các ô dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return ThanhVienDAL.insertThanhVien(tv);
    }

    public int getMaTV() {
        return ThanhVienDAL.getMaTV();
    }

    public boolean deleteThanhVien(String maTV) {
        return ThanhVienDAL.deleteThanhVien(maTV);
    }
    
    public boolean updateThanhVien(int maTV, String tenTV, String loaiTV, String sdt, String email, int diemTV){
        ThanhVien tv = new ThanhVien(maTV, tenTV, loaiTV, sdt, email, diemTV);
        return ThanhVienDAL.updateThanhVien(tv);
    }
}
