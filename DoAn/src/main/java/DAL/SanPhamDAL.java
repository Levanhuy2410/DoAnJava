/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cong
 */
public class SanPhamDAL {
  private final Connection connection = JdbcConnection.getConnection();
  public List<SanPham> getAllSanPham() {
    String query = "SELECT * FROM SANPHAM";
    List<SanPham> listSanPham = new ArrayList<>();
    try {
      PreparedStatement ps = connection.prepareStatement(query);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        SanPham sanpham = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8));
        listSanPham.add(sanpham);
      }   
    } catch (SQLException ex) {
      Logger.getLogger(SanPhamDAL.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listSanPham;
  }
  public boolean themSanPham(SanPham sanpham) {
    String query = "INSERT INTO SANPHAM VALUES(ID_MASP.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
    try {
      PreparedStatement ps = connection.prepareStatement(query);
      ps.setString(1, sanpham.getTenSp());
      ps.setInt(2, sanpham.getGiaBan());
      ps.setInt(3, sanpham.getTgbh());
      ps.setString(4, sanpham.getHangSx());
      ps.setInt(5, sanpham.getSlTon());
      ps.setString(6, sanpham.getMota());
      ps.setInt(7, sanpham.getMaLsp());
      int status = ps.executeUpdate();
      if (status > 0) {
        return true;
      }
    } catch (SQLException ex) {
      Logger.getLogger(SanPhamDAL.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    }
    return false;
  }
//  public static void main(String[] args) {
//    SanPhamDAL test = new SanPhamDAL();
//    System.out.println(test.getAllSanPham());
//  }
}
