/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTPhieuNhap;
import java.util.ArrayList;

/**
 *
 * @author Cong
 */
public class CTPhieuNhapDAL {

  public static boolean insertCTPhieuNhap(CTPhieuNhap ctpn) {
    String query = "INSERT INTO CTPHIEUNHAP VALUES (?, ?, ?, ?)";
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(ctpn.maSp);
    arr.add(ctpn.maNh);
    arr.add(ctpn.slNhap);
    arr.add(ctpn.giaNhap);
    return JdbcConnection.executeUpdate(query, arr);
  }
  public static void main(String[] args) {
    System.out.println(insertCTPhieuNhap(new CTPhieuNhap(18, 60, 2, 800000)));
    
  }
}
