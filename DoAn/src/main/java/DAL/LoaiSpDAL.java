/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiSpDTO;
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
  
  public List<LoaiSpDTO> getAllLoaiSp() {
    List<LoaiSpDTO> listLoaiSp = new ArrayList<>();
    try {
      String query = "SELECT * FROM LOAISP";
      PreparedStatement ps = connection.prepareStatement(query);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        LoaiSpDTO loaiSp = new LoaiSpDTO(rs.getString(1), rs.getString(2));
        listLoaiSp.add(loaiSp);
      }
    } catch (SQLException ex) {
      Logger.getLogger(LoaiSpDAL.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listLoaiSp;
  }
}
