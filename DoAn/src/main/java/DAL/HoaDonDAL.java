/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTHoaDon;
import DTO.HoaDon;
import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;

/**
 *
 * @author Cong
 */
public class HoaDonDAL {

  public static List<HoaDon> getAllHoaDon() {
    String query = "SELECT * FROM HOADON H JOIN khthanhvien K ON h.makh = k.matv JOIN nhanvien N ON n.manv = h.manv";
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    List<HoaDon> listHoadon = new ArrayList<>();
    ArrayList<Object> arr = new ArrayList<>();
    ResultSet rs = JdbcConnection.executeQuery(query, arr);
    try {
      while (rs.next()) {
        listHoadon.add(new HoaDon(rs.getInt(1), df.format(rs.getDate(2)), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(7), rs.getString(13)));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return listHoadon;
  }

  public static boolean insertHoaDon(int[] masp, int[] sl, String ngayHd, int maKh, int maNv) {
    try {
      CallableStatement stmt = JdbcConnection.connection.prepareCall("BEGIN INSERT_HOADON(ID_MAHD.NEXTVAL, ?, ?, ?, ?, to_date(?, 'dd/MM/yyyy')); END;");
      ArrayDescriptor arraySpDesc = ArrayDescriptor.createDescriptor("MASP_ARRAY", JdbcConnection.connection);
      ArrayDescriptor arraySlSpDesc = ArrayDescriptor.createDescriptor("SL_ARRAY", JdbcConnection.connection);
      Array arraySp = new ARRAY(arraySpDesc, JdbcConnection.connection, masp);
      Array arraySl = new ARRAY(arraySlSpDesc, JdbcConnection.connection, sl);
      stmt.setArray(1, arraySp);
      stmt.setArray(2, arraySl);
      
      stmt.setObject(3, maKh);
      stmt.setObject(4, maNv);
      
      stmt.setString(5, ngayHd);
      return stmt.execute();

    } catch (SQLException ex) {
      Logger.getLogger(HoaDonDAL.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  public static int getMaHd() {
    String query = "select id_mahd.nextval from dual";
    return JdbcConnection.getId(query);
  }

  public static boolean deleteHoaDon(int maHd) {
    String query = "DELETE FROM HOADON WHERE MAHD = ?";
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(maHd);
    return JdbcConnection.executeUpdate(query, arr);
  }

//  public static void main(String[] args) {
//
//    List<CTHoaDon> cthoadon = new ArrayList<>();
//    CTHoaDon sp1 = new CTHoaDon(18, 1);
//    CTHoaDon sp2 = new CTHoaDon(19, 1);
//    cthoadon.add(sp1);
//    cthoadon.add(sp2);
//    int slSanPham = cthoadon.size();
//    
//    int[] masp = new int[slSanPham];
//    int[] sl = new int[slSanPham];
//    for (int i = 0; i < slSanPham; i++) {
//      masp[i] = cthoadon.get(i).maSp;
//      sl[i] = cthoadon.get(i).soLuong;
//    }
//
//    System.out.println(insertHoaDon(masp, sl));
//  }
}
