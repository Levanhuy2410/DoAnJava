/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.ThanhVien;
import DAL.ThanhVienDAL;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ThanhVienBLL {
    public static ArrayList<ThanhVien> ThanhVienALL(){
        return ThanhVienDAL.getListThanhVien();
    }
}
