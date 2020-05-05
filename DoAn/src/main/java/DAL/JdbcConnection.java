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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Cong
 */
public class JdbcConnection {
  public static Connection getConnection()  {
      final String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
      final String user = "doan";
      final String password = "123123";
      
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      return DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException | SQLException ex) {
      Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
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

