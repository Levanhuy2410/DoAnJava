/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.PhieuNhapHangBLL;
import DAL.JdbcConnection;
import DTO.PhieuNhapHang;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USER
 */
public class QuanLyPhieuNhap extends javax.swing.JFrame {
    public Connection conn = JdbcConnection.getConnection();
  /**
   * Creates new form QuanLySanPham
   */
  public QuanLyPhieuNhap() {
    initComponents();
    loadAllPhieuNhapHang();
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
    jScrollPane1 = new javax.swing.JScrollPane();
    tablePhieuNhapHang = new javax.swing.JTable();
    Filter = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    BTReturn = new javax.swing.JButton();
    BTInPhieu = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(0, 168, 232));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("<html> <center>QUẢN LÝ PHIẾU NHẬP</center></html>");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(118, 118, 118)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        .addGap(117, 117, 117))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 120));

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

    tablePhieuNhapHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    tablePhieuNhapHang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    tablePhieuNhapHang.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Mã Phiếu Nhập", "Ngày Nhập", "Nhà Cung Cấp"
      }
    ));
    tablePhieuNhapHang.setSelectionForeground(new java.awt.Color(0, 0, 0));
    jScrollPane1.setViewportView(tablePhieuNhapHang);
    tablePhieuNhapHang.getAccessibleContext().setAccessibleName("");

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

    BTInPhieu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    BTInPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-print-35.png"))); // NOI18N
    BTInPhieu.setText(" XEM VÀ IN PHIẾU NHẬP");
    BTInPhieu.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BTInPhieuActionPerformed(evt);
      }
    });

    btnDelete.setBackground(new java.awt.Color(255, 0, 0));
    btnDelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-35.png"))); // NOI18N
    btnDelete.setText("  XÓA");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(66, 66, 66)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 52, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BTReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BTThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BTInPhieu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
            .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BTInPhieu)
            .addComponent(btnDelete)))
        .addGap(39, 39, 39)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(BTReturn)
        .addContainerGap(22, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1010, 460));

    pack();
  }// </editor-fold>//GEN-END:initComponents
    public static void loadAllPhieuNhapHang() {
    DefaultTableModel model = (DefaultTableModel) tablePhieuNhapHang.getModel();
    while (tablePhieuNhapHang.getRowCount() > 0) {
      model.removeRow(0);
    }
    List<PhieuNhapHang> listPhieuNhapHang = PhieuNhapHangBLL.getAllPhieuNhapHang();
    for (PhieuNhapHang phieunhap : listPhieuNhapHang) {
      Object[] row = { phieunhap.maNh, phieunhap.ngayNh, phieunhap.nhaCc };
      model.addRow(row);
    }
  }
    private void BTThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThemActionPerformed
      // TODO add your handling code here:
      PhieuNhapThem pnthem = new PhieuNhapThem();
      pnthem.setVisible(true);
    }//GEN-LAST:event_BTThemActionPerformed

    private void BTReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTReturnActionPerformed
      // TODO add your handling code here:
      ManHinhChinh mhchinh = new ManHinhChinh();
      mhchinh.setVisible(true);
      dispose();
    }//GEN-LAST:event_BTReturnActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    // TODO add your handling code here:
    int selectedRow = tablePhieuNhapHang.getSelectedRow();
    if (selectedRow < 0) {
      JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn 1 dòng", "Lỗi", JOptionPane.ERROR_MESSAGE);
      return;
    }
    int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa dòng này không", "Xóa", JOptionPane.YES_NO_OPTION);
    if (reply == JOptionPane.YES_OPTION) {
      int maHd = (int) tablePhieuNhapHang.getValueAt(selectedRow, 0);
      boolean result = PhieuNhapHangBLL.deletePhieuNhapHang(maHd);
      if (result) {
        QuanLyPhieuNhap.loadAllPhieuNhapHang();
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công !");
      }
      else JOptionPane.showMessageDialog(rootPane, "Xóa lỗi, thử lại sau", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

    private void BTInPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInPhieuActionPerformed
        // TODO add your handling code here:
        
        try {
            int selected = tablePhieuNhapHang.getSelectedRow();
            if (selected != -1){
                int manh = Integer.parseInt(tablePhieuNhapHang.getValueAt(selected, 0).toString());
                Map<String, Object> parameters = new HashMap<String, Object>();
                JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\USER\\Desktop\\DoAnJava\\DoAn\\src\\main\\java\\Report\\PhieuNhapHang.jrxml");
                parameters.put("MANH", manh);

                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                JasperPrint jprint = JasperFillManager.fillReport(jreport, parameters, JdbcConnection.getConnection());

                JasperViewer.viewReport(jprint, false);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_BTInPhieuActionPerformed

  private void FilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterKeyReleased
    // TODO add your handling code here:
    tablePhieuNhapHang.getSelectionModel().clearSelection();
    DefaultTableModel model = (DefaultTableModel) tablePhieuNhapHang.getModel();
    String query = Filter.getText();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
    tablePhieuNhapHang.setRowSorter(tr);
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
      java.util.logging.Logger.getLogger(QuanLyPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(QuanLyPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(QuanLyPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(QuanLyPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new QuanLyPhieuNhap().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BTInPhieu;
  private javax.swing.JButton BTReturn;
  private javax.swing.JButton BTThem;
  private javax.swing.JTextField Filter;
  private javax.swing.JButton btnDelete;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  public static javax.swing.JTable tablePhieuNhapHang;
  // End of variables declaration//GEN-END:variables
}
