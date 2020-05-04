/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.Login;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Main {
    static Connection connect;
    public static void statement(){
        try{
            Statement s;
            String query = "Select * from TAIKHOAN";
            s = connect.createStatement();
            ResultSet rs = s.executeQuery(query);
            while(rs.next()){
                JOptionPane.showMessageDialog(null, rs.getString(1)+ " " + rs.getString(2));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "DoAn", "doan");
            statement();
            Login loginFrame = new Login();
            loginFrame.setVisible(true);
            System.out.println("Connected to database");
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
