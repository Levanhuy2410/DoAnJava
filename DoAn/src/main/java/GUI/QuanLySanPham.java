/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.SanPhamBLL;
import DTO.SanPham;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cong
 */
public class QuanLySanPham extends javax.swing.JFrame {

    /**
     * Creates new form QuanLySanPham
     */
    public QuanLySanPham() {
        initComponents();
        loadAllSanpham();
    }

    public static void loadAllSanpham() {
        tableSanPham.setSelectionBackground(Color.darkGray);
        DefaultTableModel model = (DefaultTableModel) tableSanPham.getModel();
        while (tableSanPham.getRowCount() > 0) {
            model.removeRow(0);
        }
        List<SanPham> listSanPham = SanPhamBLL.getAllSanPham();
        for (SanPham sp : listSanPham) {
            Object[] row = {sp.maSp, sp.tenSp, sp.giaBan, sp.tgbh, sp.hangSx, sp.slTon, sp.mota, sp.tenLsp};
            model.addRow(row);
        }
        tableSanPham.setModel(model);
    }

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
        btnXoa = new javax.swing.JButton();
        BTCapNhat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTReturn = new javax.swing.JButton();
        BTThemLoaiSP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 168, 232));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <center>QUẢN LÝ THÔNG TIN SẢN PHẨM</center></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 120));

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

        btnXoa.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-35.png"))); // NOI18N
        btnXoa.setText("  XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
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

        tableSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableSanPham.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá Bán", "Thời Gian Bảo Hành", "Hãng Sản Xuất", "Số Lượng Tồn", "Mô Tả", "Loại Sản Phẩm"
            }
        ));
        tableSanPham.setSelectionBackground(new java.awt.Color(0, 168, 232));
        tableSanPham.setSelectionForeground(new java.awt.Color(0, 168, 232));
        jScrollPane1.setViewportView(tableSanPham);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-35.png"))); // NOI18N

        BTReturn.setBackground(new java.awt.Color(255, 255, 255));
        BTReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-return-57.png"))); // NOI18N
        BTReturn.setContentAreaFilled(false);
        BTReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTReturnActionPerformed(evt);
            }
        });

        BTThemLoaiSP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTThemLoaiSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-35.png"))); // NOI18N
        BTThemLoaiSP.setText(" THÊM LOẠI SẢN PHẨM");
        BTThemLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTThemLoaiSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BTReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BTThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(BTCapNhat)
                                .addGap(50, 50, 50)
                                .addComponent(BTThemLoaiSP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTThem)
                        .addComponent(btnXoa)
                        .addComponent(BTCapNhat)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTThemLoaiSP)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTReturn)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1140, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThemActionPerformed
        // TODO add your handling code here:
        SanPhamThem themsp = new SanPhamThem();
        themsp.setVisible(true);
    }//GEN-LAST:event_BTThemActionPerformed

    private void BTReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTReturnActionPerformed
        // TODO add your handling code here:
        ManHinhChinh mhchinh = new ManHinhChinh();
        mhchinh.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTReturnActionPerformed

    private void BTCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCapNhatActionPerformed
        // TODO add your handling code here:
        int selected = tableSanPham.getSelectedRow();
        if (selected < 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn 1 dòng để cập nhật");
            return;
        }
        int selectedRow = tableSanPham.getSelectedRow();
        String idSanPham = tableSanPham.getValueAt(selectedRow, 0).toString();
        String tenSp = tableSanPham.getValueAt(selectedRow, 1).toString();
        String giaBan = tableSanPham.getValueAt(selectedRow, 2).toString();
        String tgbh = tableSanPham.getValueAt(selectedRow, 3).toString();
        String hangSx = tableSanPham.getValueAt(selectedRow, 4).toString();
        
        String mota = tableSanPham.getValueAt(selectedRow, 6).toString();
        String loaiSp = tableSanPham.getValueAt(selectedRow, 7).toString();
        
        //
        SanPhamCapNhat capnhat = new SanPhamCapNhat();
        capnhat.maSp = Integer.parseInt(idSanPham);
        capnhat.tenSpTxt.setText(tenSp);
        capnhat.giaBanTxt.setText(giaBan);
        capnhat.tgbhTxt.setText(tgbh);
        capnhat.hangSxTxt.setText(hangSx);
        
        capnhat.motaTxt.setText(mota);
        capnhat.tenLoaiTxt.setSelectedItem(loaiSp);

        capnhat.setVisible(true);
    }//GEN-LAST:event_BTCapNhatActionPerformed

  private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
      // TODO add your handling code here:
      int selectedRow = tableSanPham.getSelectedRow();
      if (selectedRow < 0) {
          JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn 1 dòng", "Lỗi", JOptionPane.ERROR_MESSAGE);
          return;
      }
      int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa dòng này không", "Xóa", JOptionPane.YES_NO_OPTION);
      if (reply == JOptionPane.YES_OPTION) {
          String idSanPham = tableSanPham.getValueAt(tableSanPham.getSelectedRow(), 0).toString();
          if (SanPhamBLL.deleteSanPham(idSanPham)) {
              QuanLySanPham.loadAllSanpham();
              JOptionPane.showMessageDialog(rootPane, "Xóa thành công", "Thành công", JOptionPane.PLAIN_MESSAGE);
              return;
          }
          JOptionPane.showMessageDialog(rootPane, "Xóa thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
      }

  }//GEN-LAST:event_btnXoaActionPerformed

    private void BTThemLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThemLoaiSPActionPerformed
        // TODO add your handling code here:
        LoaiSanPhamThem lspthem = new LoaiSanPhamThem();
        lspthem.setVisible(true);
    }//GEN-LAST:event_BTThemLoaiSPActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCapNhat;
    private javax.swing.JButton BTReturn;
    private javax.swing.JButton BTThem;
    private javax.swing.JButton BTThemLoaiSP;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTable tableSanPham;
    // End of variables declaration//GEN-END:variables
}
