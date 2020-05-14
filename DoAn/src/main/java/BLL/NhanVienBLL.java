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
    public static ArrayList<NhanVien> NhanVienAll(){
        return NhanVienDAL.getListNhanVien();
    }
}
