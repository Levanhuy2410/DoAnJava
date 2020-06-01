/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CTKiemKeDAL;
import DTO.CTKiemKe;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CTKiemKeBLL {
    CTKiemKeDAL CTKiemKeDAL = new CTKiemKeDAL();
    public boolean insertCTKiemKe(int maSP, int maKK, int slHeThong, int slTon, String lyDo){
        CTKiemKe ctkk = new CTKiemKe(maSP, maKK, slHeThong, slTon, lyDo);
        return CTKiemKeDAL.insertCTKiemKe(ctkk);
    }
    public ArrayList<CTKiemKe> getAllCTKiemKe(int maKK){
        return CTKiemKeDAL.getAllCTKiemKe(maKK);
    }
//    public boolean deleteCTKiemKe(int maKK){
//        return CTKiemKeDAL.deleteCTKiemKe(maKK);
//    }
}
