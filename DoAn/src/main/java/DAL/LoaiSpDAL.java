/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiSP;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cong
 */
public class LoaiSpDAL {
  private final Connection connection = JdbcConnection.getConnection();
  
  public static List<LoaiSP> getAllLoaiSp() {
    List<LoaiSP> listLoaiSp = new ArrayList<>();
    try {
      String query = "SELECT * FROM LOAISP";
      ArrayList<Object> arr = new ArrayList<>();
      ResultSet rs = JdbcConnection.executeQuery(query, arr);
      while (rs.next()) {
        LoaiSP loaiSp = new LoaiSP(rs.getString(1), rs.getString(2));
        listLoaiSp.add(loaiSp);
      }
    } catch (SQLException ex) {
      Logger.getLogger(LoaiSpDAL.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listLoaiSp;
  }
  public static int getIdLoaispByName(String name) {
    String query = "SELECT MALSP FROM LOAISP WHERE TENLSP = ?";
    try {
      ArrayList<Object> arr = new ArrayList<>();
      arr.add(name);
      ResultSet rs = JdbcConnection.executeQuery(query, arr);
      while (rs.next()) {
        return rs.getInt(1);
      }
    } catch (SQLException ex) {
      Logger.getLogger(LoaiSpDAL.class.getName()).log(Level.SEVERE, null, ex);
    }
    return 0;
  }
  public static void main(String[] args) {
    System.out.println(LoaiSpDAL.getIdLoaispByName("RAM DDR4"));
  }
}
