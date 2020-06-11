/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTKiemKe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CTKiemKeDAL {
    // Hàm thêm phiếu kk
    public boolean insertCTKiemKe(CTKiemKe ctkk){
        String query = "INSERT INTO CTPHIEUKK VALUES(?,?,?,?,?)";
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(ctkk.maSP);
        arr.add(ctkk.maKK);
        arr.add(ctkk.slHeThong);
        arr.add(ctkk.slTon);
        arr.add(ctkk.lyDo);
        return JdbcConnection.executeUpdate(query, arr);
    }
    // Hàm get all chi tiết kiểm kê
    public ArrayList<CTKiemKe> getAllCTKiemKe(int maKK){
        String query = "SELECT * FROM CTPHIEUKK CTKK JOIN SANPHAM SP ON CTKK.MASP = SP.MASP WHERE MAKK = ?";
        ArrayList<CTKiemKe> listCTKiemKe = new ArrayList<>();
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(maKK);
        ResultSet rs = JdbcConnection.executeQuery(query, arr);
        try {
            while (rs.next()) {
                CTKiemKe ctkk = new CTKiemKe(rs.getInt(1), rs.getString(7), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
                listCTKiemKe.add(ctkk);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listCTKiemKe;
    }
     //Hàm xóa chi tiết kiểm kê
    public boolean deleteCTKiemKe(int maKK){
        String query = "DELETE FROM CTPHIEUKK WHERE MAKK = ?";
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(maKK);
        return JdbcConnection.executeUpdate(query, arr);
    }    
}
