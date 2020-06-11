/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BLL.LoaiSpBLL;
import BLL.SanPhamBLL;
import DTO.LoaiSP;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SanPhamCapNhat extends javax.swing.JFrame {
//    public SanPhamBLL SanPhamBLL = new SanPhamBLL();

    /** Creates new form ThemSanPham */
    public SanPhamCapNhat() {
        initComponents();
        this.maLsp = new ArrayList<>();
        loadLoaisp();
    }
    public void loadLoaisp() {
      LoaiSpBLL loaiSpBLL = new LoaiSpBLL();
      List<LoaiSP> allLoaiSp = loaiSpBLL.getAllLoaiSp();
      for (LoaiSP loaisp : allLoaiSp) {
        tenLoaiTxt.addItem(loaisp.toString());
        boolean add = this.maLsp.add(loaisp.maLSp);
      } 
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    hangSxTxt = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    motaTxt = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    tenSpTxt = new javax.swing.JTextField();
    tenLoaiTxt = new javax.swing.JComboBox<>();
    giaBanTxt = new javax.swing.JTextField();
    tgbhTxt = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    soluongTxt = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    BTThoat = new javax.swing.JButton();
    btnCapnhat = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    hangSxTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    hangSxTxt.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        hangSxTxtActionPerformed(evt);
      }
    });

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setText("Tên Loại Sản Phẩm");

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Tên Sản Phẩm");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Giá Bán");

    motaTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Hãng Sản Xuất");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Thời Gian Bảo Hành");

    tenSpTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    tenLoaiTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    giaBanTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    tgbhTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("Số Lượng Tồn");

    soluongTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("Mô Tả");

    BTThoat.setBackground(new java.awt.Color(255, 0, 51));
    BTThoat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    BTThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-exit-35.png"))); // NOI18N
    BTThoat.setText(" THOÁT");
    BTThoat.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BTThoatActionPerformed(evt);
      }
    });

    btnCapnhat.setBackground(new java.awt.Color(51, 255, 51));
    btnCapnhat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-replace-35.png"))); // NOI18N
    btnCapnhat.setText("  CẬP NHẬT");
    btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCapnhatActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap(40, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(tenSpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(giaBanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(tgbhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(hangSxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(soluongTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(motaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(tenLoaiTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap())
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(btnCapnhat)
            .addGap(89, 89, 89)
            .addComponent(BTThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(99, 99, 99))))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(48, 48, 48)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(tenSpTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(26, 26, 26)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(giaBanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(26, 26, 26)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tgbhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(26, 26, 26)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(hangSxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(soluongTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
          .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(26, 26, 26)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(motaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(36, 36, 36)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(tenLoaiTxt)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(67, 67, 67)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(BTThoat)
          .addComponent(btnCapnhat))
        .addGap(57, 57, 57))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void hangSxTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hangSxTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hangSxTxtActionPerformed

    private void BTThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BTThoatActionPerformed

  private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
    // TODO add your handling code here:
    try {
      int selectedIndex = tenLoaiTxt.getSelectedIndex();
      String giaBan = giaBanTxt.getText().trim();
      String tgbh = tgbhTxt.getText().trim();
      String soluong = soluongTxt.getText().trim();
      String tenSp = tenSpTxt.getText().trim();
      String hangSx = hangSxTxt.getText().trim();
      String mota = motaTxt.getText().trim();
      String loaiSp = tenLoaiTxt.getSelectedItem().toString();
      if (tenSp.isEmpty() || hangSx.isEmpty() || mota.isEmpty() || loaiSp.isEmpty() || giaBan.isEmpty() || tgbh.isEmpty() || soluong.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Không thành công, vui lồng kiểm tra lại thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
      }
      boolean result = SanPhamBLL.updateSanPham(maSp, tenSp, Integer.parseInt(giaBan), Integer.parseInt(tgbh), hangSx, Integer.parseInt(soluong), mota, Integer.parseInt(maLsp.get(selectedIndex)));
      if (result) {
        dispose();
        QuanLySanPham.loadAllSanpham();
        JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
        return;
      }
      JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
      }
    catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(rootPane, "Không thành công, vui lồng kiểm tra lại thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }

  }//GEN-LAST:event_btnCapnhatActionPerformed

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
            java.util.logging.Logger.getLogger(SanPhamCapNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamCapNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamCapNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamCapNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamCapNhat().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BTThoat;
  private javax.swing.JButton btnCapnhat;
  public javax.swing.JTextField giaBanTxt;
  public javax.swing.JTextField hangSxTxt;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel2;
  public javax.swing.JTextField motaTxt;
  public javax.swing.JTextField soluongTxt;
  public javax.swing.JComboBox<String> tenLoaiTxt;
  public javax.swing.JTextField tenSpTxt;
  public javax.swing.JTextField tgbhTxt;
  // End of variables declaration//GEN-END:variables
  public int maSp;
  public List<String> maLsp;
}
