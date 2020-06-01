/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BLL.LoaiSpBLL;
import BLL.SanPhamBLL;
import DAL.LoaiSpDAL;
import DTO.SanPham;
import DTO.LoaiSP;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SanPhamThem extends javax.swing.JFrame {

    /** Creates new form ThemSanPham */
    public SanPhamThem() {
      initComponents();
      loadLoaisp();
      
    }
    public void loadLoaisp() {
      List<LoaiSP> allLoaiSp = LoaiSpDAL.getAllLoaiSp();
      allLoaiSp.forEach((LoaiSP action) -> {
        tenLoaiTxt.addItem(action.tenLSp);
      });
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
    moTaTxt = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    tenSpTxt = new javax.swing.JTextField();
    tenLoaiTxt = new javax.swing.JComboBox<>();
    giaBanTxt = new javax.swing.JTextField();
    TgbhTxt = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    soluongTxt = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    BTThoat = new javax.swing.JButton();
    BTThem = new javax.swing.JButton();

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

    moTaTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Hãng Sản Xuất");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Thời Gian Bảo Hành");

    tenSpTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    tenLoaiTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    tenLoaiTxt.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tenLoaiTxtActionPerformed(evt);
      }
    });

    giaBanTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    TgbhTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    TgbhTxt.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TgbhTxtActionPerformed(evt);
      }
    });

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

    BTThem.setBackground(new java.awt.Color(0, 168, 232));
    BTThem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    BTThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-35.png"))); // NOI18N
    BTThem.setText(" THÊM");
    BTThem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BTThemActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap(22, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(TgbhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(hangSxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(soluongTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(moTaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                  .addComponent(tenLoaiTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(BTThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(100, 100, 100)
            .addComponent(BTThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(98, 98, 98))))
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
          .addComponent(TgbhTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(26, 26, 26)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(hangSxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(soluongTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
          .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(26, 26, 26)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(moTaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(36, 36, 36)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(tenLoaiTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(BTThoat)
          .addComponent(BTThem))
        .addGap(39, 39, 39))
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

    private void BTThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThemActionPerformed
        // TODO add your handling code here:
        try {
          LoaiSpBLL loaiSpBLL = new LoaiSpBLL();
          String tenSp = tenSpTxt.getText().trim();
          String giaBan = giaBanTxt.getText().trim();
          String tgbh = TgbhTxt.getText().trim();
          String hangSx = hangSxTxt.getText().trim();
          String soluong = soluongTxt.getText().trim();
          String mota = moTaTxt.getText().trim();
          String tenLsp = tenLoaiTxt.getSelectedItem().toString().trim();
            System.out.println(tenLsp);
          if (tenSp.isEmpty() || giaBan.isEmpty() || tgbh.isEmpty() || soluong.isEmpty() || hangSx.isEmpty() || mota.isEmpty() || tenLsp.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không thành công, vui lồng kiểm tra lại thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
          }

          SanPhamBLL sanphamBLL = new SanPhamBLL();
          boolean result = sanphamBLL.themSanPham(tenSp, Integer.parseInt(giaBan), Integer.parseInt(tgbh), hangSx, Integer.parseInt(soluong), mota, loaiSpBLL.getIdLoaispByName(tenLsp));
          if (result) {
            QuanLySanPham.loadAllSanpham();
            JOptionPane.showMessageDialog(rootPane, "Thêm sản phẩm thành công !");
          }
          else JOptionPane.showMessageDialog(rootPane, "Không thành công, vui lồng kiểm tra lại thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e) {
          JOptionPane.showMessageDialog(rootPane, "Không thành công, vui lồng kiểm tra lại thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BTThemActionPerformed

  private void tenLoaiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenLoaiTxtActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tenLoaiTxtActionPerformed

  private void TgbhTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TgbhTxtActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_TgbhTxtActionPerformed

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
            java.util.logging.Logger.getLogger(SanPhamThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamThem().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BTThem;
  private javax.swing.JButton BTThoat;
  private javax.swing.JTextField TgbhTxt;
  private javax.swing.JTextField giaBanTxt;
  private javax.swing.JTextField hangSxTxt;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField moTaTxt;
  private javax.swing.JTextField soluongTxt;
  private javax.swing.JComboBox<String> tenLoaiTxt;
  private javax.swing.JTextField tenSpTxt;
  // End of variables declaration//GEN-END:variables

}
