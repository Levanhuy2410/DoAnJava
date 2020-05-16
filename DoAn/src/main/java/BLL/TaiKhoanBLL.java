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
    public static TaiKhoanDAL TaiKhoanDAL = new TaiKhoanDAL();
    public static boolean KiemTraLogin(String username, String password) {
        return TaiKhoanDAL.KiemTraLogin(username, password);
    }
    public static ArrayList<String> getThongTinNhanVien(String username){
        return TaiKhoanDAL.getThongTinNhanVien(username);
    }
    public static boolean insertTaiKhoan(String username, String password, String loaiTK){
        return TaiKhoanDAL.insertTaiKhoan(username, password, loaiTK);
    }
    public static boolean kiemTraTrungUsername(String username){
        return TaiKhoanDAL.kiemTraTrungUsername(username);
    }
}
