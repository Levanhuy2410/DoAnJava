/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.NhanVien;
import BLL.NhanVienBLL;
import BLL.TaiKhoanBLL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class QuanLyNhanVien extends javax.swing.JFrame {

    public NhanVienCapNhat capnhat = new NhanVienCapNhat();
    public NhanVienBLL NhanVienBLL = new NhanVienBLL();
    public TaiKhoanBLL TaiKhoanBLL = new TaiKhoanBLL();

    /**
     * Creates new form QuanLySanPham
     */
    public QuanLyNhanVien() {
        initComponents();
        this.TableThongTinNhanVien();
    }

    public void TableThongTinNhanVien() {
        DefaultTableModel model = (DefaultTableModel) JTableNhanVien.getModel();
        while (JTableNhanVien.getRowCount() > 0) {
            model.removeRow(0);
        }
        NhanVien nv = new NhanVien();
        ArrayList<NhanVien> nvarr = BLL.NhanVienBLL.NhanVienAll();
        for (int i = 0; i < nvarr.size(); i++) {
            nv = nvarr.get(i);
            int maNV = nv.maNV;
            String tenNV = nv.tenNV;
            String chucVu = nv.chucVu;
            String ngaySinh = nv.ngaySinh;
            String ngayVL = nv.ngayVL;
            int mucLuong = nv.mucLuong;
            String sdt = nv.sdt;
            String email = nv.email;
            Object[] row = {maNV, tenNV, chucVu, ngayVL, ngaySinh, sdt, email, mucLuong};
            model.addRow(row);
        }
        JTableNhanVien.setModel(model);
    }

    // Add 1 dòng lên table
    public static void AddRowToTable(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel) JTableNhanVien.getModel();
        model.addRow(dataRow);
        JOptionPane.showMessageDialog(JTableNhanVien, "Thêm nhân viên thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
    }

    // Update 1 row trên table
    public static void UpdateRow(Object[] row) {
        int indexTB = JTableNhanVien.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) JTableNhanVien.getModel();
        model.setValueAt(row[0], indexTB, 1);
        model.setValueAt(row[1], indexTB, 2);
        model.setValueAt(row[2], indexTB, 3);
        model.setValueAt(row[3], indexTB, 4);
        model.setValueAt(row[4], indexTB, 5);
        model.setValueAt(row[5], indexTB, 6);
        model.setValueAt(row[6], indexTB, 7);
        // Xuất hiện thông báo thành công
        JOptionPane.showMessageDialog(JTableNhanVien, "Cập nhật thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
    }

    // Filter theo tên
//    public void Filter(String query){
//       DefaultTableModel model = (DefaultTableModel) JTableNhanVien.getModel();
//       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
//       JTableNhanVien.setRowSorter(tr);
//       
//       tr.setRowFilter(RowFilter.regexFilter(query));
//       JTableNhanVien.setRowSorter(tr);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTThem = new javax.swing.JButton();
        BTXoa = new javax.swing.JButton();
        BTCapNhat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableNhanVien = new javax.swing.JTable();
        Filter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 168, 232));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <center>QUẢN LÝ THÔNG TIN NHÂN VIÊN</center></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BTThem.setBackground(new java.awt.Color(0, 168, 232));
        BTThem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-35.png"))); // NOI18N
        BTThem.setText(" THÊM");
        BTThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTThemActionPerformed(evt);
            }
        });

        BTXoa.setBackground(new java.awt.Color(255, 0, 0));
        BTXoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-35.png"))); // NOI18N
        BTXoa.setText("  XÓA");
        BTXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTXoaActionPerformed(evt);
            }
        });

        BTCapNhat.setBackground(new java.awt.Color(51, 255, 51));
        BTCapNhat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-replace-35.png"))); // NOI18N
        BTCapNhat.setText("  CẬP NHẬT");
        BTCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCapNhatActionPerformed(evt);
            }
        });

        JTableNhanVien.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JTableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ", "Ngày Vào Làm", "Ngày Sinh", "SĐT", "Email", "Mức Lương"
            }
        ));
        JTableNhanVien.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(JTableNhanVien);

        Filter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-35.png"))); // NOI18N

        BTReturn.setBackground(new java.awt.Color(255, 255, 255));
        BTReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-return-57.png"))); // NOI18N
        BTReturn.setContentAreaFilled(false);
        BTReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BTReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BTThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(BTXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(BTCapNhat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTThem)
                        .addComponent(BTXoa)
                        .addComponent(BTCapNhat)
                        .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTReturn)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1160, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThemActionPerformed
        // TODO add your handling code here:
        NhanVienThem nvthem = new NhanVienThem();
        nvthem.setVisible(true);
    }//GEN-LAST:event_BTThemActionPerformed

    private void BTReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTReturnActionPerformed
        // TODO add your handling code here:
        ManHinhChinh mhchinh = new ManHinhChinh();
        mhchinh.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTReturnActionPerformed

    private void BTCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCapNhatActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) JTableNhanVien.getModel();
        // Lấy vị trí đang chọn trên JTable
        int selected = JTableNhanVien.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn 1 dòng để cập nhật");
        } else {
            // Lấy dữ liệu dòng đang chọn hiện lên 
            int MANV = Integer.parseInt(JTableNhanVien.getModel().getValueAt(selected, 0).toString());
            String TENNV = JTableNhanVien.getModel().getValueAt(selected, 1).toString();
            String CHUCVU = JTableNhanVien.getModel().getValueAt(selected, 2).toString();
            String NGAYVL = JTableNhanVien.getModel().getValueAt(selected, 3).toString();
            String NGAYSINH = JTableNhanVien.getModel().getValueAt(selected, 4).toString();
            String SDT = JTableNhanVien.getModel().getValueAt(selected, 5).toString();
            String EMAIL = JTableNhanVien.getModel().getValueAt(selected, 6).toString();
            int MUCLUONG = Integer.parseInt(JTableNhanVien.getModel().getValueAt(selected, 7).toString());
            // Hiện lên JFrame cập nhật
            capnhat.maNV.setText(String.valueOf(MANV));
            capnhat.tenNV.setText(TENNV);
            capnhat.chucVu.setSelectedItem(CHUCVU);
            capnhat.ngayVL.setText(NGAYVL);
            capnhat.ngaySinh.setText(NGAYSINH);
            capnhat.mucLuong.setText(String.valueOf(MUCLUONG));
            capnhat.sdt.setText(SDT);
            capnhat.email.setText(EMAIL);
            capnhat.setVisible(true);
        }
    }//GEN-LAST:event_BTCapNhatActionPerformed

    private void BTXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTXoaActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa dòng này không", "Xóa", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) JTableNhanVien.getModel();
            // Lay vi tri dang chon tren JTable
            int indexTB = JTableNhanVien.getSelectedRow();
            // Lay du lieu tu dong dang chon.
            String maNV = JTableNhanVien.getModel().getValueAt(indexTB, 0).toString();
            // Delete dong du lieu
            if (NhanVienBLL.deleteNhanVien(maNV)) {
                model.removeRow(indexTB);
                // Thông báo thành công
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Xóa không thành công", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BTXoaActionPerformed

    private void FilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) JTableNhanVien.getModel();
        String query = Filter.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        JTableNhanVien.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_FilterKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCapNhat;
    private javax.swing.JButton BTReturn;
    private javax.swing.JButton BTThem;
    private javax.swing.JButton BTXoa;
    private javax.swing.JTextField Filter;
    public static javax.swing.JTable JTableNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
