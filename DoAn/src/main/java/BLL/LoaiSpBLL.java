/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiSpDAL;
import DTO.LoaiSP;
import java.util.List;

/**
 *
 * @author Cong
 */
public class LoaiSpBLL {

    LoaiSpDAL loaiSpDAL = new LoaiSpDAL();

    public List<LoaiSP> getAllLoaiSp() {
        return loaiSpDAL.getAllLoaiSp();
    }
    public int getIdLoaispByName(String tenLsp) {
      return loaiSpDAL.getIdLoaispByName(tenLsp);
    }
    public static boolean insertLoaisp(LoaiSP loaisp) {
      return LoaiSpDAL.insertLoaiSp(loaisp);
    }
}
