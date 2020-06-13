/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTHD;
import DTO.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
                System.out.println(rs.getString(5));
                listHoadon.add(new HoaDon(rs.getInt(1), df.format(rs.getDate(2)), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(7), rs.getString(13)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listHoadon;
    }

    public static boolean insertHoaDon(HoaDon hoadon) {
        String query = "INSERT INTO HOADON VALUES(?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?)";
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(hoadon.maHd);
        arr.add(hoadon.ngayHd);
        arr.add(hoadon.maKh);
        arr.add(hoadon.maNv);
        arr.add(hoadon.triGia);
        return JdbcConnection.executeUpdate(query, arr);
    }

    public static int getMaHd() {
        String query = "select id_mahd.nextval from dual";
        return JdbcConnection.getId(query);
    }
    public static boolean deleteHoaDon(String maHd) {
      String query = "DELETE FROM HOADON WHERE MAHD = ?";
      ArrayList<Object> arr = new ArrayList<>();
      arr.add(maHd);
      return JdbcConnection.executeUpdate(query, arr);
    }

//    public static void main(String[] args) {
//        System.out.println(HoaDonDAL.xoaHoaDon("19"));
//    }
}
