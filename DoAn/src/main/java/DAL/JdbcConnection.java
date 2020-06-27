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
        JdbcConnection.dotenv = Dotenv.load();
        JdbcConnection.url = dotenv.get("CONNECTION_STRING");
        JdbcConnection.user = dotenv.get("DB_USER");
        JdbcConnection.password = dotenv.get("DB_PASSWORD");
        connection = getConnection();
    }
   
    
    // Mở kết nối đến database
    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(JdbcConnection.url, JdbcConnection.user, 
                    JdbcConnection.password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // Truy xuất các dòng dữ liệu
    public static ResultSet executeQuery(String sql, ArrayList<Object> arr) { // Dành cho các câu lệnh SELECT
        ResultSet rs = null;
        try {
            PreparedStatement stm;
            stm = JdbcConnection.connection.prepareStatement(sql);
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
            PreparedStatement stm;
            stm = JdbcConnection.connection.prepareStatement(sql);
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

//    public static int insertAndGetId(String insertSql, ArrayList<Object> arr) {
//        ResultSet rs = null;
//        int id = 0;
//        try {
//            PreparedStatement stm = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
//            stm.executeUpdate();
//            rs = stm.getGeneratedKeys();
//            if (rs.next()) {;
//                id = rs.getInt(1);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
    
    public static void closeConnection() {
        try {
            if (JdbcConnection.getConnection() != null) {
                JdbcConnection.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//  public static void main(String[] args) throws SQLException {
//    Connection connection = getConnection();
//    if (connection != null) System.out.println("_________________________Connected______________________");
//    else System.out.println("That bai");
//    java.sql.Statement stmt = connection.createStatement();
//    
//    ResultSet rs = stmt.executeQuery("select * from TAIKHOAN");
//    while(rs.next()) {
//      System.out.println("*******************");
//      String username = rs.getString(1);
//      String password = rs.getString(2);
//      String role = rs.getString(3);
//      System.out.println("Username: " + username + "\nPassword: " + password + "\nRole: " + role);
//    }
//  }
}
