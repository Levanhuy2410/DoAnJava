/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USER
 */
public class NhanVienDAL {
    public static ArrayList<NhanVien> getListNhanVien(){
        ArrayList<NhanVien> result = new ArrayList<>();
        String query = "SELECT * FROM NHANVIEN";
        ArrayList<Object> arr = new ArrayList<>();
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, arr);
            while (rs.next()){
                String maNV = rs.getString("MANV");
                String tenNV = rs.getString("TENNV");
                String chucVu = rs.getString("CHUCVU");
                String ngayVL = rs.getString("NGAYVL");
                String ngaySinh = rs.getString("NGAYSINH");
                int mucLuong = rs.getInt("MUCLUONG");
                String username = rs.getString("USERNAME");
                result.add(new NhanVien(maNV, tenNV, chucVu, ngayVL, ngaySinh, mucLuong, username));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
