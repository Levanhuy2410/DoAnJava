/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Cong
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import io.github.cdimascio.dotenv.*;

/**
 *
 * @author Cong
 */
public class JdbcConnection {

    public static Connection connection;
    public static Dotenv dotenv;
    public static String url;
    public static String user;
    public static String password;
    
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        dotenv = Dotenv.load();
        url = dotenv.get("CONNECTION_STRING");
        user = dotenv.get("DB_USER");
        password = dotenv.get("DB_PASSWORD");
        connection = getConnection();
    }
   
    
    // Mở kết nối đến database
    public static Connection getConnection() {
        try {
            if (connection != null) {
                return connection;
            }
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // Truy xuất các dòng dữ liệu
    public static ResultSet executeQuery(String sql, ArrayList<Object> arr) { // Dành cho các câu lệnh SELECT
        ResultSet rs = null;
        try {
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            if (arr.size() > 0) {
                for (int i = 0; i < arr.size(); i++) {
                    stm.setObject(i + 1, arr.get(i));
                }
            }
            rs = stm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    // Ham get id
    public static int getId(String sql){
        int id = 0;
        try {
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }
    // Dành cho các câu lệnh Update, Insert
    public static boolean executeUpdate(String sql, ArrayList<Object> arr) {
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            if (arr.size() > 0) {
                for (int i = 0; i < arr.size(); i++) {
                    stm.setObject(i + 1, arr.get(i));
                }
            }
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                connection = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
