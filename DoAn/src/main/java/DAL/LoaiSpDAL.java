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
  
  public List<LoaiSP> getAllLoaiSp() {
    List<LoaiSP> listLoaiSp = new ArrayList<>();
    try {
      String query = "SELECT * FROM LOAISP";
      PreparedStatement ps = connection.prepareStatement(query);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        LoaiSP loaiSp = new LoaiSP(rs.getString(1), rs.getString(2));
        listLoaiSp.add(loaiSp);
      }
    } catch (SQLException ex) {
      Logger.getLogger(LoaiSpDAL.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listLoaiSp;
  }
}
