/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TaiKhoan;

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

    // Hàm lấy thông tin nhân viên từ username
    public ArrayList<String> getThongTinNhanVien(String username) {
        ArrayList<String> result = new ArrayList<>();
        String query = "SELECT nv.MANV, TENNV, CHUCVU, SDT, EMAIL FROM NHANVIEN nv JOIN"
                    + " TAIKHOAN tk ON nv.manv = tk.manv WHERE tk.USERNAME = '" + username + "'";
        ArrayList<Object> nv = new ArrayList<>();
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, nv);
            if (rs.next()) {
                result.add(rs.getString("MANV"));
                result.add(rs.getString("TENNV"));
                result.add(rs.getString("CHUCVU"));
                result.add(rs.getString("SDT"));
                result.add(rs.getString("EMAIL"));
            } else {
                result = null;
            }
            JdbcConnection.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    // Hàm tạo tài khoản
    public boolean insertTaiKhoan(TaiKhoan tk) {
        boolean result = false;
        try {
            String query = "INSERT INTO TAIKHOAN(USERNAME, PASSWORD, LOAITK, MANV) "
                    + "VALUES ('" + tk.username + "','" + tk.password + "','" + tk.loaiTK + "','" + tk.maNV + "')";
            ArrayList<Object> arr = new ArrayList<>();
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    // Hàm xóa tài khoản từ mã nhân viên
    public boolean deleteTaiKhoan(String maNV) {
        boolean result = false;
        try {
            String query = "DELETE FROM TAIKHOAN WHERE EXISTS("
                    + " SELECT NHANVIEN.manv FROM NHANVIEN"
                    + " WHERE NHANVIEN.username = TAIKHOAN.username"
                    + " AND MANV = " + maNV + ")";
            ArrayList<Object> tk = new ArrayList<>();
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, tk);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public static int getManvByUsername(String username) {
        try {
            String query = "SELECT MANV FROM TAIKHOAN WHERE USERNAME = ?";
            ArrayList<Object> arr = new ArrayList<>();
            arr.add(username);
            ResultSet rs = JdbcConnection.executeQuery(query, arr);
            while (rs.next()) {
                return rs.getInt("MANV");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
//    public static void main(String args[]){
//        
//    }
}
