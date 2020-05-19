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

/**
 *
 * @author Cong
 */
public class JdbcConnection {

    // Mở kết nối đến database
    public static Connection getConnection() {
        final String url = "jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain";
        final String user = "doan";
        final String password = "doan";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // Truy xuất các dòng dữ liệu
    public static ResultSet executeQuery(String sql, ArrayList<Object> arr) { // Dành cho các câu lệnh SELECT
        ResultSet rs = null;
        try {
            PreparedStatement stm;
            stm = JdbcConnection.getConnection().prepareStatement(sql);
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
    // Dành cho các câu lệnh Update, Insert
    public static boolean executeUpdate(String sql, ArrayList<Object> arr){
        try {
            PreparedStatement stm;
            stm = JdbcConnection.getConnection().prepareStatement(sql);
            if (arr.size() > 0) {
                for (int i = 0; i < arr.size(); i++) {
                    stm.setObject(i + 1, arr.get(i));
                }
            }
            stm.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static void closeConnection(){
        try {
            if (JdbcConnection.getConnection()!=null){
                JdbcConnection.getConnection().close();
            }
        }
        catch (SQLException e){
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
