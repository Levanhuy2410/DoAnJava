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
  public static List<SanPham> getAllSanPham() {
    String query = "SELECT * FROM SANPHAM";
    List<SanPham> listSanPham = new ArrayList<>();
    ArrayList<Object> arr = new ArrayList<>();
    ResultSet rs = JdbcConnection.executeQuery(query, arr);
    try {
      while (rs.next()) {
        SanPham sanpham = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8));
        listSanPham.add(sanpham);
      }
    } catch (SQLException ex) {
      Logger.getLogger(SanPhamDAL.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listSanPham;
  }
  public static boolean themSanPham(SanPham sanpham) {
    String query = "INSERT INTO SANPHAM VALUES(ID_MASP.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(sanpham.getTenSp());
    arr.add(sanpham.getGiaBan());
    arr.add(sanpham.getTgbh());
    arr.add(sanpham.getHangSx());
    arr.add(sanpham.getSlTon());
    arr.add(sanpham.getMota());
    arr.add(sanpham.getMaLsp());
    return JdbcConnection.executeUpdate(query, arr);
  }
  public static boolean xoaSanPham(String idSanPham) {
    String query = "DELETE FROM SANPHAM WHERE masp = ?";
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(idSanPham);
    return JdbcConnection.executeUpdate(query, arr);
  }
//  public static void main(String[] args) {
//    System.out.println(SanPhamDAL.xoaSanPham(15));
//  }
}
