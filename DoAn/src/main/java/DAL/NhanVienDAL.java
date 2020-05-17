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
    // Hàm hiện danh sách nhân viên
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
            JdbcConnection.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    // Hàm tạo nhân viên
    public boolean insertNhanVien(String tenNV, String chucVu, String ngayVL, String ngaySinh, int mucLuong, String username){
        boolean result = false;
        try {   
            String query = "INSERT INTO NHANVIEN(MANV, TENNV, CHUCVU, NGAYVL, NGAYSINH, MUCLUONG, USERNAME) "
                    + "VALUES (id_manv.NEXTVAL,'" + tenNV + "','" + chucVu + "', TO_DATE('" + ngayVL + "','YYYY-MM-DD'), TO_DATE('" + ngaySinh + "','YYYY-MM-DD'),'" 
                    + mucLuong + "','" + username +"')";
            ArrayList<Object> arr = new ArrayList<>();
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
            JdbcConnection.closeConnection();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    // Ham` xoa' nhan vien
    public boolean deleteNhanVien(String MaNV){
        boolean result = false;
        try {
            String query = "DELETE FROM NHANVIEN WHERE MANV ='" + MaNV + "'";
            ArrayList<Object> arr = new ArrayList<>();
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
            JdbcConnection.closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    // Hàm update nhân viên
    public boolean updateNhanVien(String maNV, String tenNV, String chucVu, String ngayVL, String ngaySinh, int mucLuong){
        boolean result = false;
        try {
            String query = "UPDATE NHANVIEN SET TENNV = '" + tenNV + "'," 
                    + "CHUCVU = '" + chucVu + "', NGAYVL = TO_DATE('" + ngayVL + "','YYYY-MM-DD HH24:MI:SS'), NGAYSINH = TO_DATE('" + ngaySinh + "', 'YYYY-MM-DD HH24:MI:SS'), MUCLUONG = '" + mucLuong + "' WHERE MANV = '" + maNV + "'";
            ArrayList<Object> arr = new ArrayList<>();
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
            JdbcConnection.closeConnection();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
