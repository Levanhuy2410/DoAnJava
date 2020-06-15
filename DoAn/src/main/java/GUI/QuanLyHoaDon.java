/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.HoaDonBLL;
import DAL.JdbcConnection;
import DTO.HoaDon;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
public class QuanLyHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form QuanLySanPham
     */
    public QuanLyHoaDon() {
        initComponents();
        loadAllHoaDon();
    }
    public static void loadAllHoaDon() {
      DefaultTableModel model = (DefaultTableModel) tableHoaDon.getModel();
        while (tableHoaDon.getRowCount() > 0) {
            model.removeRow(0);
        }
        List<HoaDon> listHoaDon = HoaDonBLL.getAllHoaDon();
        for (HoaDon hd : listHoaDon) {
          Object[] row = { hd.maHd, hd.ngayHd, hd.triGia, hd.tenKh, hd.tenNv };
          model.addRow(row);
        }
        tableHoaDon.setModel(model);
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
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoaDon = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTReturn = new javax.swing.JButton();
        BTInHoaDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 168, 232));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <center>QUẢN LÝ THÔNG TIN HÓA ĐƠN</center></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 120));

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

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-35.png"))); // NOI18N
        btnDelete.setText("  XÓA");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tableHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableHoaDon.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Hóa Đơn", "Thành Tiền", "Tên Thành Viên ( Nếu Có )", "Tên Nhân Viên Lập HĐ"
            }
        ));
        jScrollPane1.setViewportView(tableHoaDon);
        if (tableHoaDon.getColumnModel().getColumnCount() > 0) {
            tableHoaDon.getColumnModel().getColumn(3).setPreferredWidth(130);
        }
        tableHoaDon.getAccessibleContext().setAccessibleName("");

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

        BTInHoaDon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-print-35.png"))); // NOI18N
        BTInHoaDon.setText(" XEM VÀ IN HÓA ĐƠN");
        BTInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInHoaDonActionPerformed(evt);
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
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(BTInHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTThem)
                        .addComponent(btnDelete)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTInHoaDon)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1080, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThemActionPerformed
        // TODO add your handling code here:
        HoaDonThem themhd = new HoaDonThem();
        themhd.setVisible(true);
    }//GEN-LAST:event_BTThemActionPerformed

    private void BTReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTReturnActionPerformed
        // TODO add your handling code here:
        ManHinhChinh mhchinh = new ManHinhChinh();
        mhchinh.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTReturnActionPerformed

    private void BTInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInHoaDonActionPerformed
        // TODO add your handling code here
        try {
            int selected = tableHoaDon.getSelectedRow();
            if (selected != -1){
                int mahd = Integer.parseInt(tableHoaDon.getValueAt(selected, 0).toString());

                Map<String, Object> parameters = new HashMap<String, Object>();
                JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\USER\\Desktop\\DoAnJava\\DoAn\\src\\main\\java\\Report\\HoaDon.jrxml");
                parameters.put("MAHD", mahd);

                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                JasperPrint jprint = JasperFillManager.fillReport(jreport, parameters, JdbcConnection.getConnection());

                JasperViewer.viewReport(jprint, false);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_BTInHoaDonActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    // TODO add your handling code here:
    int selectedRow = tableHoaDon.getSelectedRow();
    System.out.println(selectedRow);
    if (selectedRow < 0) {
      JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn 1 dòng", "Lỗi", JOptionPane.ERROR_MESSAGE);
      return;
    }
    int reply = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa dòng này không", "Xóa", JOptionPane.YES_NO_OPTION);
    if (reply == JOptionPane.YES_OPTION) {
      int maHd = (int) tableHoaDon.getValueAt(selectedRow, 0);
      boolean result = HoaDonBLL.deleteHoaDon(maHd);
      if (result) {
        QuanLyHoaDon.loadAllHoaDon();
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công !");
      }
      else JOptionPane.showMessageDialog(rootPane, "Xóa lỗi, thử lại sau", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTInHoaDon;
    private javax.swing.JButton BTReturn;
    private javax.swing.JButton BTThem;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTable tableHoaDon;
    // End of variables declaration//GEN-END:variables
}
