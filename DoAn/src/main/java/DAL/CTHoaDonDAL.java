/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTHoaDon;
import java.util.ArrayList;

/**
 *
 * @author Cong
 */
public class CTHoaDonDAL {

    public static boolean insertCTHD(CTHoaDon ct) {
        String query = "INSERT INTO CTHOADON VALUES (?, ?, ?, ?)";
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(ct.maSp);
        arr.add(ct.maHd);
        arr.add(ct.soLuong);
        arr.add(ct.triGia);
        return JdbcConnection.executeUpdate(query, arr);
    }
}
