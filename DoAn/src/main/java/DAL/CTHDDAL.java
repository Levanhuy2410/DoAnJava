/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTHD;
import java.util.ArrayList;

/**
 *
 * @author Cong
 */
public class CTHDDAL {
  public static boolean insertCTHD(CTHD ct) {
        String query = "INSERT INTO CTHOADON VALUES (?, ?, ?, ?)";
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(ct.maSp);
        arr.add(ct.maHd);
        arr.add(ct.soLuong);
        arr.add(ct.triGia);
        return JdbcConnection.executeUpdate(query, arr);
    }
}
