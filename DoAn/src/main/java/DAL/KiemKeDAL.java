/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KiemKe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author USER
 */
public class KiemKeDAL {

    public static ArrayList<KiemKe> getAllKiemKe() {
        String query = "SELECT * FROM PHIEUKK";
        ArrayList<KiemKe> listKiemKe = new ArrayList<>();
        ArrayList<Object> arr = new ArrayList<>();
        ResultSet rs = JdbcConnection.executeQuery(query, arr);
        try {
            while (rs.next()) {
                KiemKe kiemke = new KiemKe(rs.getInt(1), rs.getString(2));
                listKiemKe.add(kiemke);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listKiemKe;
    }

    // Hàm thêm phiếu kiểm kê
    public boolean insertKiemKe() {
        String query = "INSERT INTO PHIEUKK VALUES(id_phieukk.nextval, TO_DATE(?, 'YYYY-MM-DD'))";
        ArrayList<Object> arr = new ArrayList<>();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        arr.add(timeStamp);
        return JdbcConnection.executeUpdate(query, arr);
    }

    // Hàm get mã kiểm kê
    public int getMaKK() {
        String query = "SELECT id_phieukk.CURRVAL FROM DUAL";
        return JdbcConnection.getId(query);
    }
    // Hàm xóa kiếm kê
    public boolean deleteKiemKe(int maKK){
        String query = "DELETE FROM PHIEUKK WHERE MAKK = ?";
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(maKK);
        return JdbcConnection.executeUpdate(query, arr);
    }
}
