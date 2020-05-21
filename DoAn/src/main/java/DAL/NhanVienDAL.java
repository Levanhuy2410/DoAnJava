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
                int maNV = rs.getInt("MANV");
                String tenNV = rs.getString("TENNV");
                String chucVu = rs.getString("CHUCVU");
                String ngayVL = rs.getString("NGAYVL");
                String ngaySinh = rs.getString("NGAYSINH");
                String sdt = rs.getString("SDT");
                String email = rs.getString("EMAIL");
                int mucLuong = rs.getInt("MUCLUONG");
//                String username = rs.getString("USERNAME");
                result.add(new NhanVien(maNV, tenNV, chucVu, ngayVL, ngaySinh, sdt, email, mucLuong));
            }
            JdbcConnection.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
//    // Hàm tạo nhân viên
    public boolean insertNhanVien(NhanVien nv){
        boolean result = false;
        
        try {
            String query = "INSERT INTO NHANVIEN(MANV, TENNV, CHUCVU, NGAYVL, NGAYSINH, SDT, EMAIL, MUCLUONG) "
                    + "VALUES (id_manv.NEXTVAL,'" + nv.tenNV + "','" + nv.chucVu + "', TO_DATE('" + nv.ngayVL + "','YYYY-MM-DD'), TO_DATE('" + nv.ngaySinh + "','YYYY-MM-DD'),'" 
                    + nv.sdt + "','" + nv.email + "','" + nv.mucLuong  +"')";
            ArrayList<Object> arr = new ArrayList<>();
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
            JdbcConnection.closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    // Hàm lấy mã nhân viên
    public int getMaNV(String tenNV, String chucVu){
        int maNV = 0;
        String query = "SELECT MANV FROM NHANVIEN WHERE TENNV = '" + tenNV + "' AND CHUCVU = '" + chucVu + "'";
        ArrayList<Object> arr = new ArrayList<>();
        try {
            JdbcConnection.getConnection();
            ResultSet rs = JdbcConnection.executeQuery(query, arr);
            if (rs.next()){
                maNV = rs.getInt("MANV");
            }
            JdbcConnection.closeConnection();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return maNV;
    }
//    public boolean insertNhanVien(String tenNV, String chucVu, String ngayVL, String ngaySinh, String sdt, String email, String mucLuong, String username){
//        boolean result = false;
//        try {   
//            String query = "INSERT INTO NHANVIEN(MANV, TENNV, CHUCVU, NGAYVL, NGAYSINH, SDT, EMAIL, MUCLUONG, USERNAME) "
//                    + "VALUES (id_manv.NEXTVAL,'" + tenNV + "','" + chucVu + "', TO_DATE('" + ngayVL + "','YYYY-MM-DD'), TO_DATE('" + ngaySinh + "','YYYY-MM-DD'),'" 
//                    + sdt + "','" + email + "','" + mucLuong + "','" + username +"')";
//            ArrayList<Object> arr = new ArrayList<>();
//            JdbcConnection.getConnection();
//            result = JdbcConnection.executeUpdate(query, arr);
//            JdbcConnection.closeConnection();
//        } catch (Exception ex){
//            ex.printStackTrace();
//        }
//        return result;
//    }
    // Ham` xoa' nhan vien
    public boolean deleteNhanVien(String MaNV){
        boolean result = false;
        try {
            String query = "DELETE FROM NHANVIEN WHERE MANV ='" + MaNV + "'";
            ArrayList<Object> arr = new ArrayList<>();
            JdbcConnection.getConnection();
            // Xóa tài khoản của nhân viên
            result = JdbcConnection.executeUpdate(query, arr);
            JdbcConnection.closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    // Hàm update nhân viên
    public boolean updateNhanVien(NhanVien nv){
        boolean result = false;
        try {
            String query = "UPDATE NHANVIEN SET TENNV = '" + nv.tenNV + "'," 
                    + "CHUCVU = '" + nv.chucVu + "', NGAYVL = TO_DATE('" + nv.ngayVL + "','YYYY-MM-DD HH24:MI:SS'), NGAYSINH = TO_DATE('" + nv.ngaySinh + 
                    "', 'YYYY-MM-DD HH24:MI:SS'), SDT = '" + nv.sdt + "', EMAIL = '" + nv.email + "'," + "MUCLUONG = '" + nv.mucLuong + "' WHERE MANV = '" + nv.maNV + "'";
            ArrayList<Object> arr = new ArrayList<>();
            JdbcConnection.getConnection();
            result = JdbcConnection.executeUpdate(query, arr);
            JdbcConnection.closeConnection();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
//    // Ham get ma nhan vien
//    public int getMaNV(String username){
//        int maNV = 0;
//        String query = "SELECT MANV FROM NHANVIEN WHERE USERNAME = '" + username + "'";
//        ArrayList<Object> arr = new ArrayList<>();
//        try {
//            JdbcConnection.getConnection();
//            ResultSet rs = JdbcConnection.executeQuery(query, arr);
//            if (rs.next()){
//                maNV = rs.getInt("MANV");
//            }
//            JdbcConnection.closeConnection();
//        } catch (Exception ex){
//            ex.printStackTrace();
//        }
//        return maNV;
//    }
}
