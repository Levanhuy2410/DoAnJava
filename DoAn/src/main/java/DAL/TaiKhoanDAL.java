/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TaiKhoan;
import DTO.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class TaiKhoanDAL {

    public TaiKhoanDAL() {
    }

    // Hàm kiểm tra login 
    public boolean KiemTraLogin(String username, String password) {
        ArrayList<Object> TKarr = new ArrayList<>();
        String query = "SELECT * FROM TAIKHOAN WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password + "'";
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, TKarr);
            if (rs.next()) {
                return true;
            }
            JdbcConnection.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Hàm kiểm tra username có bị trùng khi tạo 
    public boolean kiemTraTrungUsername(String username) {
        ArrayList<Object> userArr = new ArrayList<>();
        String query = "SELECT * FROM TAIKHOAN WHERE USERNAME = '" + username + "'";
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, userArr);
            if (rs.next()) {
                return true;
            }
            JdbcConnection.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Hàm lấy tài khoản từ username, password
    public TaiKhoan getTaiKhoan(String username, String password) {
        TaiKhoan result = null;
        String query = "SELECT * FROM TAIKHOAN WHERE USERNAME = " + username + "AND PASSWORD = " + password;
        ArrayList<Object> TKarr = new ArrayList<>();
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, TKarr);
            if (rs.next()) {
                result = new TaiKhoan(rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("loaiTK"));
            } else {
                result = null;
            }
            JdbcConnection.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    //  Hàm lấy thông tin nhân viên từ username
    public ArrayList<String> getThongTinNhanVien(String username) {
        ArrayList<String> result = new ArrayList<>();
        String query = "SELECT TENNV, CHUCVU FROM NHANVIEN WHERE USERNAME = '" + username + "'";
        ArrayList<Object> nv = new ArrayList<>();
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, nv);
            if (rs.next()) {
                result.add(rs.getString("TENNV"));
                result.add(rs.getString("CHUCVU"));
            } else {
                result = null;
            }
            JdbcConnection.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    // Hàm tạo tài khoản
    public boolean insertTaiKhoan(String username, String password, String loaiTK) {
        boolean result = false;
        try {
            String query = "INSERT INTO TAIKHOAN(USERNAME, PASSWORD, LOAITK) "
                    + "VALUES ('" + username + "','" + password + "','" + loaiTK + "')";
            ArrayList<Object> tk = new ArrayList<>();
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, tk);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
