/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KiemKeDAL;
import DTO.KiemKe;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class KiemKeBLL {

    public KiemKeDAL KiemKeDAL = new KiemKeDAL();

    public static ArrayList<KiemKe> getAllKiemKe() {
        return DAL.KiemKeDAL.getAllKiemKe();
    }

    public boolean insertKiemKe(int maNV) {
        return KiemKeDAL.insertKiemKe(maNV);
    }

    public int getMaKK() {
        return KiemKeDAL.getMaKK();
    }
    public boolean deleteKiemKe(int maKK){
        return KiemKeDAL.deleteKiemKe(maKK);
    }
}
