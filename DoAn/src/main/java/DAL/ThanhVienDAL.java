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

/**
 *
 * @author USER
 */
public class ThanhVienDAL {
    
    // Hàm hiện danh sách thành viên
    public static ArrayList<ThanhVien> getAllThanhVien() {
        ArrayList<ThanhVien> result = new ArrayList<>();
        String query = "SELECT * FROM KHTHANHVIEN";
        ArrayList<Object> arr = new ArrayList<>();
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, arr);
            while (rs.next()) {
                int maTV = rs.getInt("MATV");
                String tenTV = rs.getString("TENTV");
                String loaiTV = rs.getString("LOAITV");
                String sdt = rs.getString("SDT");
                String email = rs.getString("EMAIL");
                int diemTV = rs.getInt("DIEMTV");
                ThanhVien tv = new ThanhVien(maTV, tenTV, loaiTV, sdt, email, diemTV);
                result.add(tv);
            }
            JdbcConnection.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    // Hàm insert thành viên
    public boolean insertThanhVien(ThanhVien tv){
        boolean result = false;
        try {
            String query = "INSERT INTO KHTHANHVIEN VALUES(id_matv.NEXTVAL,?,?,?,?,?)";
            ArrayList<Object> arr = new ArrayList<>();
            arr.add(tv.tenTV);
            arr.add(tv.loaiTV);
            arr.add(tv.sdt);
            arr.add(tv.email);
            arr.add(tv.diemTV);
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    // Hàm delete thành viên
    public boolean deleteThanhVien(String maTV){
        boolean result = false;
        try {
            String query = "DELETE FROM KHTHANHVIEN WHERE MATV = ?";
            ArrayList<Object> arr = new ArrayList<>();
            arr.add(maTV);
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
            JdbcConnection.closeConnection();
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    // Hàm update thành viên
    public boolean updateThanhVien(ThanhVien tv){
        boolean result = false;
        try {
            String query = "UPDATE KHTHANHVIEN SET TENTV = ?, LOAITV = ?, SDT = ?, EMAIL = ? WHERE MATV = ?";
            ArrayList<Object> arr = new ArrayList<>();
            arr.add(tv.tenTV);
            arr.add(tv.loaiTV);
            arr.add(tv.sdt);
            arr.add(tv.email);
            arr.add(tv.maTV);
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
            JdbcConnection.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    // Hàm get id thành viên
    public int getMaTV(){
//        int maTV = 0;
        String query = "SELECT id_matv.currval from dual";
//        ArrayList<Object> arr = new ArrayList<>();
//        try {
//            JdbcConnection.getConnection();
//            ResultSet rs = JdbcConnection.executeQuery(query, arr);
//            if (rs.next()){
//                maTV = rs.getInt("MATV");
//            }
//            JdbcConnection.closeConnection();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
        return JdbcConnection.getId(query);
    }
}
