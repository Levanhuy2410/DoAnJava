/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVien;
import DTO.ThanhVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ThanhVienDAL {

    // Hàm hiện danh sách thành viên
    public static ArrayList<ThanhVien> getListThanhVien() {
        ArrayList<ThanhVien> result = new ArrayList<>();
        String query = "SELECT * FROM KHTHANHVIEN";
        ArrayList<Object> arr = new ArrayList<>();
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, arr);
            while (rs.next()) {
                String maTV = rs.getString("MATV");
                String tenTV = rs.getString("TENTV");
                String loaiTV = rs.getString("LOAITV");
                String sdt = rs.getString("SDT");
                String email = rs.getString("EMAIL");
                int diemTV = rs.getInt("DIEMTV");
                ThanhVien tv = new ThanhVien(maTV, tenTV, loaiTV, sdt, email, diemTV);
                result.add(tv);
            }
            JdbcConnection.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
