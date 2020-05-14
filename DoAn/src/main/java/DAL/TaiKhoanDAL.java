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

/**
 *
 * @author USER
 */
public class TaiKhoanDAL {
    public TaiKhoanDAL(){}
    
    public static boolean KiemTraLogin(String username, String password){
        ArrayList<Object> TKarr = new ArrayList<>();
        String query = "SELECT * FROM TAIKHOAN WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password + "'"; 
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, TKarr);
            if (rs.next()) {
                return true;
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public static TaiKhoan getTaiKhoan(String username, String password){
        TaiKhoan result = null;
        String query = "SELECT * FROM TAIKHOAN WHERE USERNAME = " + username + "AND PASSWORD = " + password;
        ArrayList<Object> TKarr = new ArrayList<>();
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, TKarr);
            if (rs.next()){
                result = new TaiKhoan(rs.getString("username"),
                                        rs.getString("password"),
                                        rs.getString("loaiTK"));
            }
            else {
                result = null;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}
