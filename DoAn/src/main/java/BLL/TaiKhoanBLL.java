/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.TaiKhoan;
import DAL.TaiKhoanDAL;
/**
 *
 * @author USER
 */
public class TaiKhoanBLL {
    
    public static boolean KiemTraLogin(String username, String password) {
        return TaiKhoanDAL.KiemTraLogin(username, password);
    }
}
