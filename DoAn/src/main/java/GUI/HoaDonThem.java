/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.HoaDonBLL;
import DTO.SanPham;
import DTO.ThanhVien;
import BLL.SanPhamBLL;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class HoaDonThem extends javax.swing.JFrame {

  /**
   * Creates new form ThemSanPham
   */
  private boolean clicked = false;
  public int stt = 0;

  public HoaDonThem() {
    initComponents();
    deleteDefaultRowCTHD();
    loadAllSanPham();
    loadAllThanhVien();
  }
  public void deleteDefaultRowCTHD() {
    DefaultTableModel CTHDmodel = (DefaultTableModel) tableCTHD.getModel();
    while (tableCTHD.getRowCount() > 0) {
      CTHDmodel.removeRow(0);
    }
  }
  public void loadAllThanhVien() {
    DefaultTableModel Thanhvienmodel = (DefaultTableModel) tableThanhvien.getModel();
    ArrayList<ThanhVien> listThanhvien = BLL.ThanhVienBLL.ThanhVienALL();
    while (tableThanhvien.getRowCount() > 0) {
      Thanhvienmodel.removeRow(0);
    }
    for (ThanhVien thanhvien : listThanhvien) {
      Object[] row = {thanhvien.maTV, thanhvien.tenTV};
      Thanhvienmodel.addRow(row);
    }
  }

  public void loadAllSanPham() {
    DefaultTableModel model = (DefaultTableModel) tableSanPham.getModel();
    while (tableSanPham.getRowCount() > 0) {
      model.removeRow(0);
    }
    
    List<SanPham> listSanPham = SanPhamBLL.getAllSanPham();
    for (SanPham sp : listSanPham) {
      Object[] row = {sp.maSp, sp.tenSp, sp.slTon, sp.giaBan};
      model.addRow(row);
    }
    tableSanPham.setModel(model);
  }

  public int getRowbyId(String id) {
    for (int i = 0; i < tableCTHD.getRowCount(); i++) {
      if (Integer.parseInt(id) == Integer.parseInt(tableCTHD.getValueAt(i, 1).toString())) {
        return i;
      }
    }
    return -1;
  }

  public void tinhTongtien() {
    int tongtien = 0;
    for (int i = 0; i < tableCTHD.getRowCount(); i++) {
      tongtien += (int) tableCTHD.getValueAt(i, 3) * (int) tableCTHD.getValueAt(i, 4);
    }
    tongtienTxt.setText(Integer.toString(tongtien));
    return;
  }

  public void addRowCTHD(String masp, String tensp, int soluong, int giaban) {
    int tienHientai;
    int thanhtien = 0;
    if (getRowbyId(masp) == -1) {
      this.stt++;
      thanhtien = giaban * soluong;
      Object[] row = {this.stt, masp, tensp, soluong, giaban, thanhtien};
      DefaultTableModel model = (DefaultTableModel) tableCTHD.getModel();
      model.addRow(row);
    } else {
      int existRow = getRowbyId(masp);
      int slHientai = (int) tableCTHD.getValueAt(existRow, 3);
      tableCTHD.setValueAt(slHientai + soluong, existRow, 3);
    }
    tinhTongtien();

  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jLabel8 = new javax.swing.JLabel();
    btnLuu = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    tableCTHD = new javax.swing.JTable();
    jLabel7 = new javax.swing.JLabel();
    BTThoat = new javax.swing.JButton();
    mathanhvienTxt = new javax.swing.JTextField();
    jScrollPane3 = new javax.swing.JScrollPane();
    tableThanhvien = new javax.swing.JTable();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    memberFilter = new javax.swing.JTextField();
    tongtienTxt = new javax.swing.JTextField();
    jPanel3 = new javax.swing.JPanel();
    maspTxt = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    soluongTxt = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    tableSanPham = new javax.swing.JTable();
    jLabel4 = new javax.swing.JLabel();
    btnThemsanpham = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    Filter = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBackground(new java.awt.Color(0, 168, 232));

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8.setText("Mã Thành Viên");

    btnLuu.setBackground(new java.awt.Color(0, 102, 204));
    btnLuu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-35.png"))); // NOI18N
    btnLuu.setText(" LƯU HD");
    btnLuu.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLuuActionPerformed(evt);
      }
    });

    tableCTHD.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Giá Bán", "Thành Tiền"
      }
    ));
    tableCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableCTHDMouseClicked(evt);
      }
    });
    jScrollPane2.setViewportView(tableCTHD);
    if (tableCTHD.getColumnModel().getColumnCount() > 0) {
      tableCTHD.getColumnModel().getColumn(2).setPreferredWidth(120);
    }

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setText("HÓA ĐƠN");

    BTThoat.setBackground(new java.awt.Color(255, 0, 51));
    BTThoat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    BTThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-exit-35.png"))); // NOI18N
    BTThoat.setText(" THOÁT");
    BTThoat.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BTThoatActionPerformed(evt);
      }
    });

    mathanhvienTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    mathanhvienTxt.setText("0");
    mathanhvienTxt.setEnabled(false);
    mathanhvienTxt.setFocusable(false);

    tableThanhvien.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    tableThanhvien.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null}
      },
      new String [] {
        "Mã Thành Viên", "Tên Thành Viên"
      }
    ));
    tableThanhvien.setRowMargin(0);
    tableThanhvien.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableThanhvienMouseClicked(evt);
      }
    });
    jScrollPane3.setViewportView(tableThanhvien);

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel9.setText("TÌM KIẾM MÃ THÀNH VIÊN ( Nếu Có)");

    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-35.png"))); // NOI18N

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 8, Short.MAX_VALUE)
    );

    jLabel1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
    jLabel1.setText("TỔNG TIỀN:");

    memberFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    memberFilter.setToolTipText("Tìm theo tên thành viên");
    memberFilter.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        memberFilterFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        memberFilterFocusLost(evt);
      }
    });
    memberFilter.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        memberFilterMouseClicked(evt);
      }
    });
    memberFilter.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        memberFilterKeyPressed(evt);
      }
      public void keyReleased(java.awt.event.KeyEvent evt) {
        memberFilterKeyReleased(evt);
      }
    });

    tongtienTxt.setEnabled(false);
    tongtienTxt.setFocusable(false);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(tongtienTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane3)
          .addComponent(jScrollPane2)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(BTThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(mathanhvienTxt))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel9)
            .addGap(42, 42, 42)
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
            .addComponent(memberFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addComponent(jLabel1))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(tongtienTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(memberFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(mathanhvienTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(28, 28, 28)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnLuu)
          .addComponent(BTThoat))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 0, -1, 620));

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

    maspTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
    maspTxt.setEnabled(false);

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Số Lượng");

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("Mã Sản Phẩm");

    soluongTxt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

    tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng Tồn", "Giá Bán"
      }
    ));
    tableSanPham.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableSanPhamMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tableSanPham);

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("CHỌN SẢN PHẨM");

    btnThemsanpham.setBackground(new java.awt.Color(0, 168, 232));
    btnThemsanpham.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    btnThemsanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-35.png"))); // NOI18N
    btnThemsanpham.setText(" THÊM CTHD");
    btnThemsanpham.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnThemsanphamActionPerformed(evt);
      }
    });

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-35.png"))); // NOI18N

    Filter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    Filter.setToolTipText("");
    Filter.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        FilterFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        FilterFocusLost(evt);
      }
    });
    Filter.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        FilterKeyPressed(evt);
      }
      public void keyReleased(java.awt.event.KeyEvent evt) {
        FilterKeyReleased(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(22, 22, 22)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(soluongTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(maspTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnThemsanpham))
            .addGap(34, 34, 34))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(29, 29, 29))))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(Filter))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(maspTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(soluongTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(btnThemsanpham)
        .addGap(65, 65, 65))
    );

    getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 620));

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnThemsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemsanphamActionPerformed
      // TODO add your handling code here:
      try {
        int selected = tableSanPham.getSelectedRow();
        if (selected == -1) {
          JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn 1 sản phẩm", "Lỗi", JOptionPane.ERROR_MESSAGE);
          return;
        }
        String masp = tableSanPham.getValueAt(selected, 0).toString().trim();
        String tensp = tableSanPham.getValueAt(selected, 1).toString().trim();
        int giaban = Integer.parseInt(tableSanPham.getValueAt(selected, 3).toString());
        int soluong = Integer.parseInt(soluongTxt.getText().toString().trim());
        if ((int)tableSanPham.getValueAt(selected, 2) < soluong) {
          JOptionPane.showMessageDialog(rootPane, "Số lượng không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
          return;
        }
        addRowCTHD(masp, tensp, soluong, giaban);
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "Thông tin không hộp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
      }

    }//GEN-LAST:event_btnThemsanphamActionPerformed

    private void BTThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThoatActionPerformed
      // TODO add your handling code here:
      dispose();
    }//GEN-LAST:event_BTThoatActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
      // TODO add your handling code here:
      try {
        int maKh;
        if (mathanhvienTxt.getText().isEmpty()) {
          maKh = 0;
        } else {
          maKh = Integer.parseInt(mathanhvienTxt.getText());
        }
        String username = Login.username;
        int triGia = Integer.parseInt(tongtienTxt.getText());
        int maHd = HoaDonBLL.themHoaDon(maKh, username, triGia);
        if (tableCTHD.getRowCount() == 0) {
          JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn ít nhất 1 sản phẩm", "Chưa có sản phẩm", JOptionPane.ERROR_MESSAGE);
          return;
        }
        for (int i = 0; i < tableCTHD.getRowCount(); i++) {
          String maSp = tableCTHD.getValueAt(i, 1).toString();
          int soluong = (int) tableCTHD.getValueAt(i, 3);
          int giaban = (int) tableCTHD.getValueAt(i, 4);
          int thanhtien = soluong * giaban;
          HoaDonBLL.themCTHD(maSp, Integer.toString(maHd), soluong, thanhtien);
        }
        tongtienTxt.setText("0");
        QuanLyHoaDon.loadAllHoaDon();
        deleteDefaultRowCTHD();
        loadAllSanPham();
        JOptionPane.showMessageDialog(rootPane, "Tạo hóa đơn thành công");
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "Thông tin không hộp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
      }

    }//GEN-LAST:event_btnLuuActionPerformed

    private void memberFilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memberFilterFocusGained
      // TODO add your handling code here:
      if (memberFilter.getText().trim().equals("Tìm theo tên thành viên")) {
        memberFilter.setText("");
        memberFilter.setForeground(Color.BLACK);
      }
    }//GEN-LAST:event_memberFilterFocusGained

    private void memberFilterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memberFilterFocusLost
      // TODO add your handling code here:
      if (memberFilter.getText().trim().equals("")) {
        memberFilter.setText("Tìm theo tên thành viên");
        memberFilter.setForeground(Color.GRAY);
      }
    }//GEN-LAST:event_memberFilterFocusLost

    private void memberFilterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memberFilterKeyPressed
      // TODO add your handling code here:
//        if (jTextField8.getText().equals("Tìm theo tên thành viên")){
//            jTextField8.setText("");
//            jTextField8.setForeground(Color.BLACK);
//            jTextField4.setCaretPosition(0);
//        }
    }//GEN-LAST:event_memberFilterKeyPressed

  private void FilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterKeyReleased
    // TODO add your handling code here:       
    tableSanPham.getSelectionModel().clearSelection();
    DefaultTableModel model = (DefaultTableModel) tableSanPham.getModel();
    String query = Filter.getText();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
    tableSanPham.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(query));
  }//GEN-LAST:event_FilterKeyReleased

  private void memberFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memberFilterKeyReleased
    // TODO add your handling code here:
    DefaultTableModel model = (DefaultTableModel) tableThanhvien.getModel();
    String query = memberFilter.getText();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
    tableThanhvien.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(query));
  }//GEN-LAST:event_memberFilterKeyReleased

  private void FilterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterKeyPressed
    // TODO add your handling code here:
    //        if (jTextField4.getText().equals("Tìm theo tên sản phẩm")){
      //            jTextField4.setText("");
      //            jTextField4.setForeground(Color.BLACK);
      //            jTextField4.setCaretPosition(0);
      //        }
  }//GEN-LAST:event_FilterKeyPressed

  private void FilterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FilterFocusLost
    // TODO add your handling code here:
    if (Filter.getText().trim().equals("")) {
      Filter.setText("Tìm theo tên sản phẩm");
      Filter.setForeground(Color.GRAY);
    }
  }//GEN-LAST:event_FilterFocusLost

  private void FilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FilterFocusGained
    // TODO add your handling code here:
    if (Filter.getText().trim().equals("Tìm theo tên sản phẩm")) {
      Filter.setText("");
      Filter.setForeground(Color.BLACK);
    }
  }//GEN-LAST:event_FilterFocusGained

  private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked
    // TODO add your handling code here:
    int selected = tableSanPham.getSelectedRow();
    if (selected != -1) {
      maspTxt.setText(tableSanPham.getValueAt(selected, 0).toString());
    }
  }//GEN-LAST:event_tableSanPhamMouseClicked

  private void memberFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberFilterMouseClicked
    // TODO add your handling code here:
    
  }//GEN-LAST:event_memberFilterMouseClicked

  private void tableCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTHDMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_tableCTHDMouseClicked

  private void tableThanhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThanhvienMouseClicked
    // TODO add your handling code here:
    int selected = tableThanhvien.getSelectedRow();
    if (selected != -1) {
      mathanhvienTxt.setText(tableThanhvien.getValueAt(selected, 0).toString());
    }
  }//GEN-LAST:event_tableThanhvienMouseClicked

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
      java.util.logging.Logger.getLogger(HoaDonThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(HoaDonThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(HoaDonThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(HoaDonThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new HoaDonThem().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BTThoat;
  private javax.swing.JTextField Filter;
  private javax.swing.JButton btnLuu;
  private javax.swing.JButton btnThemsanpham;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JTextField maspTxt;
  private javax.swing.JTextField mathanhvienTxt;
  private javax.swing.JTextField memberFilter;
  private javax.swing.JTextField soluongTxt;
  private javax.swing.JTable tableCTHD;
  private javax.swing.JTable tableSanPham;
  private javax.swing.JTable tableThanhvien;
  private javax.swing.JTextField tongtienTxt;
  // End of variables declaration//GEN-END:variables

}
