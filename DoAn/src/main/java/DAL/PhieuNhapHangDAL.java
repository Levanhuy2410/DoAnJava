/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.PhieuNhapHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cong
 */
public class PhieuNhapHangDAL {

  public static List<PhieuNhapHang> getAllPhieuNhapHang() {
    String query = "SELECT * FROM PHIEUNH";
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    List<PhieuNhapHang> listPhieuNhapHang = new ArrayList<>();
    ArrayList<Object> arr = new ArrayList<>();
    ResultSet rs = JdbcConnection.executeQuery(query, arr);
    try {
      while (rs.next()) {
        listPhieuNhapHang.add(new PhieuNhapHang(rs.getInt(1), df.format(rs.getDate(2)), rs.getString(3), rs.getInt(4), rs.getInt(5)));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return listPhieuNhapHang;
  }

  public static boolean insertPhieuNhapHang(PhieuNhapHang phieunhap) {
    String query = "INSERT INTO PHIEUNH VALUES (?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?)";
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(phieunhap.maNh);
    arr.add(phieunhap.ngayNh);
    arr.add(phieunhap.nhaCc);
    arr.add(phieunhap.maNv);
    arr.add(phieunhap.tongTien);
    return JdbcConnection.executeUpdate(query, arr);
  }
  public static boolean deletePhieuNhapHang(int maNh) {
    String query = "DELETE FROM PHIEUNH WHERE MANH = ?";
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(maNh);
    return JdbcConnection.executeUpdate(query, arr);
  }
  public static int getMaPhieuNhap() {
    String query = "select id_phieunhap.nextval from dual";
    return JdbcConnection.getId(query);
  }

  public static void main(String[] args) {
    int maNh = getMaPhieuNhap();
    PhieuNhapHang pn = new PhieuNhapHang(maNh, "2020/06/14", "PhongVu", 1, 2000000);
    System.out.println(getAllPhieuNhapHang());
  }
}
