/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.TaiKhoan;
import DAL.TaiKhoanDAL;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class TaiKhoanBLL {
    public TaiKhoanDAL TaiKhoanDAL = new TaiKhoanDAL();
    public boolean KiemTraLogin(String username, String password) {
        return TaiKhoanDAL.KiemTraLogin(username, password);
    }
    public ArrayList<String> getThongTinNhanVien(String username){
        return TaiKhoanDAL.getThongTinNhanVien(username);
    }
    public boolean insertTaiKhoan(String username, String password, String loaiTK){
        return TaiKhoanDAL.insertTaiKhoan(username, password, loaiTK);
    }
    public boolean kiemTraTrungUsername(String username){
        return TaiKhoanDAL.kiemTraTrungUsername(username);
    }
//    public boolean deleteTaiKhoan(String maNV){
//        return TaiKhoanDAL.deleteTaiKhoan(maNV);
//    }
}
