/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BLL.TaiKhoanBLL;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ManHinhChinh extends javax.swing.JFrame {
    public TaiKhoanBLL TaiKhoanBLL = new TaiKhoanBLL();
    /**
     * Creates new form ManHinhChinh
     */
    public static int maNV;
    
    public ManHinhChinh() {
        initComponents();
        loadThongTinNhanVien(Login.username);
        String date = new Date().toString();
        timelable.setText(date);
    }
    public void loadThongTinNhanVien(String loginUser){
        String username = loginUser;
        ArrayList<String> nv = TaiKhoanBLL.getThongTinNhanVien(username);
        // Lấy thông tin nhân viên hiện lên mainscreen
        if (username.isEmpty()){
            TenNV.setText("");
            ChucVu.setText("");
            Email.setText("");
            SDT.setText("");
        }
        else {
            maNV = Integer.parseInt(nv.get(0).toString());
            TenNV.setText(nv.get(1));
            ChucVu.setText(nv.get(2));
            Email.setText(nv.get(3));
            SDT.setText(nv.get(4));
        }
        // Phân quyền
        if (nv.get(2).equals("Nhân Viên Kho")){
            BTQuanLyNhanVien.setVisible(false);
            BTQuanLyThanhVien.setVisible(false);
            BTQuanLyHoaDon.setVisible(false);
        }
        else if (nv.get(2).equals("Nhân Viên Kế Toán")){
            BTQuanLyNhanVien.setVisible(false);
            BTQuanLyThanhVien.setVisible(false);
            BTKiemKe.setVisible(false);
        }
        else if (nv.get(2).equals("Nhân Viên Bán Hàng")){
            BTQuanLyNhanVien.setVisible(false);
            BTKiemKe.setVisible(false);
            BTQuanLyNhapKho.setVisible(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTQuanLyNhapKho = new javax.swing.JButton();
        BTQuanLySanPham = new javax.swing.JButton();
        BTQuanLyNhanVien = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BTQuanLyThanhVien = new javax.swing.JButton();
        BTQuanLyHoaDon = new javax.swing.JButton();
        BTKiemKe = new javax.swing.JButton();
        BTThongKe = new javax.swing.JButton();
        BTReturn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TenNV = new javax.swing.JLabel();
        timelable = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ChucVu = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        SDT = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TongHoaDon = new javax.swing.JLabel();
        TongNhanVien = new javax.swing.JLabel();
        TongTonKho = new javax.swing.JLabel();
        TongThanhVien = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <center>PHẦN MỀM QUẢN LÝ</center>  CỬA HÀNG LINH KIỆN MÁY TÍNH ABC </html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 0, 960, 140));

        jPanel2.setBackground(new java.awt.Color(0, 168, 232));

        BTQuanLyNhapKho.setBackground(new java.awt.Color(0, 168, 232));
        BTQuanLyNhapKho.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        BTQuanLyNhapKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-input-60.png"))); // NOI18N
        BTQuanLyNhapKho.setText(" NHẬP KHO");
        BTQuanLyNhapKho.setBorderPainted(false);
        BTQuanLyNhapKho.setContentAreaFilled(false);
        BTQuanLyNhapKho.setFocusPainted(false);
        BTQuanLyNhapKho.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTQuanLyNhapKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuanLyNhapKhoActionPerformed(evt);
            }
        });

        BTQuanLySanPham.setBackground(new java.awt.Color(0, 168, 232));
        BTQuanLySanPham.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        BTQuanLySanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-product-60.png"))); // NOI18N
        BTQuanLySanPham.setText(" SẢN PHẨM ");
        BTQuanLySanPham.setBorderPainted(false);
        BTQuanLySanPham.setContentAreaFilled(false);
        BTQuanLySanPham.setFocusPainted(false);
        BTQuanLySanPham.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTQuanLySanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuanLySanPhamActionPerformed(evt);
            }
        });

        BTQuanLyNhanVien.setBackground(new java.awt.Color(0, 168, 232));
        BTQuanLyNhanVien.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        BTQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-staff-60.png"))); // NOI18N
        BTQuanLyNhanVien.setText(" NHÂN VIÊN");
        BTQuanLyNhanVien.setBorderPainted(false);
        BTQuanLyNhanVien.setContentAreaFilled(false);
        BTQuanLyNhanVien.setFocusPainted(false);
        BTQuanLyNhanVien.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuanLyNhanVienActionPerformed(evt);
            }
        });

        jLabel2.setText("<html>\n<center>\nHỆ THỐNG THÔNG TIN KHÓA 2018\n</center>\n<center>ĐH CNTT - ĐHQG TPHCM\n</center>\n\n</html>");

        BTQuanLyThanhVien.setBackground(new java.awt.Color(0, 168, 232));
        BTQuanLyThanhVien.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        BTQuanLyThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-member-60.png"))); // NOI18N
        BTQuanLyThanhVien.setText(" THÀNH VIÊN");
        BTQuanLyThanhVien.setBorderPainted(false);
        BTQuanLyThanhVien.setContentAreaFilled(false);
        BTQuanLyThanhVien.setFocusPainted(false);
        BTQuanLyThanhVien.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTQuanLyThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuanLyThanhVienActionPerformed(evt);
            }
        });

        BTQuanLyHoaDon.setBackground(new java.awt.Color(0, 168, 232));
        BTQuanLyHoaDon.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        BTQuanLyHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-paid-bill-60.png"))); // NOI18N
        BTQuanLyHoaDon.setText(" HÓA ĐƠN   ");
        BTQuanLyHoaDon.setBorderPainted(false);
        BTQuanLyHoaDon.setContentAreaFilled(false);
        BTQuanLyHoaDon.setFocusPainted(false);
        BTQuanLyHoaDon.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTQuanLyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuanLyHoaDonActionPerformed(evt);
            }
        });

        BTKiemKe.setBackground(new java.awt.Color(0, 168, 232));
        BTKiemKe.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        BTKiemKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-check-60.png"))); // NOI18N
        BTKiemKe.setText(" KIỂM KÊ      ");
        BTKiemKe.setBorderPainted(false);
        BTKiemKe.setContentAreaFilled(false);
        BTKiemKe.setFocusPainted(false);
        BTKiemKe.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTKiemKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTKiemKeActionPerformed(evt);
            }
        });

        BTThongKe.setBackground(new java.awt.Color(0, 168, 232));
        BTThongKe.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        BTThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-business-report-60.png"))); // NOI18N
        BTThongKe.setText(" THỐNG KÊ   ");
        BTThongKe.setBorderPainted(false);
        BTThongKe.setContentAreaFilled(false);
        BTThongKe.setFocusPainted(false);
        BTThongKe.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BTThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTThongKeActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTQuanLySanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTQuanLyNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTQuanLyNhapKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTQuanLyThanhVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTQuanLyHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTKiemKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(BTQuanLyNhapKho, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTQuanLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTKiemKe, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTQuanLyThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 260, 930));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-male-user-100.png"))); // NOI18N

        TenNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TenNV.setText("TÊN NHÂN VIÊN...");

        timelable.setBackground(new java.awt.Color(0, 0, 0));
        timelable.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        timelable.setText("Timelable");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 2, 28)); // NOI18N
        jLabel5.setText("WELCOME BACK...");

        ChucVu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChucVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChucVu.setText("CHỨC VỤ");

        Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email.setText("EMAIL");

        SDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SDT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SDT.setText("SĐT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(Email)))
                        .addGap(244, 244, 244)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SDT)
                    .addComponent(timelable, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(timelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(TenNV)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(ChucVu)
                    .addComponent(SDT))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 960, 220));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setLayout(new java.awt.GridLayout(2, 2, 15, 15));

        TongHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        TongHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TongHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-paid-bill-100.png"))); // NOI18N
        TongHoaDon.setText("<html> <br> TỔNG SỐ HÓA ĐƠN </html>");
        TongHoaDon.setOpaque(true);
        jPanel4.add(TongHoaDon);

        TongNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        TongNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TongNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-staff-100.png"))); // NOI18N
        TongNhanVien.setText("TỔNG SỐ NHÂN VIÊN TRONG CỬA HÀNG");
        TongNhanVien.setOpaque(true);
        jPanel4.add(TongNhanVien);

        TongTonKho.setBackground(new java.awt.Color(255, 255, 255));
        TongTonKho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TongTonKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-in-inventory-100.png"))); // NOI18N
        TongTonKho.setText("TỔNG SỐ SẢN PHẨM TỒN KHO");
        TongTonKho.setOpaque(true);
        jPanel4.add(TongTonKho);

        TongThanhVien.setBackground(new java.awt.Color(255, 255, 255));
        TongThanhVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TongThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-member-100.png"))); // NOI18N
        TongThanhVien.setText("TỔNG SỐ THÀNH VIÊN");
        TongThanhVien.setOpaque(true);
        jPanel4.add(TongThanhVien);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 970, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTQuanLyNhapKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuanLyNhapKhoActionPerformed
        // TODO add your handling code here:
        QuanLyPhieuNhap qlypnh = new QuanLyPhieuNhap();
        qlypnh.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTQuanLyNhapKhoActionPerformed

    private void BTQuanLySanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuanLySanPhamActionPerformed
        // TODO add your handling code here:
        QuanLySanPham qlysp = new QuanLySanPham();
        qlysp.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTQuanLySanPhamActionPerformed

    private void BTQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuanLyNhanVienActionPerformed
        // TODO add your handling code here:
        QuanLyNhanVien qlynv = new QuanLyNhanVien();
        qlynv.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTQuanLyNhanVienActionPerformed

    private void BTQuanLyThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuanLyThanhVienActionPerformed
        // TODO add your handling code here:
        QuanLyThanhVien qlytv = new QuanLyThanhVien();
        qlytv.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTQuanLyThanhVienActionPerformed

    private void BTQuanLyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuanLyHoaDonActionPerformed
        // TODO add your handling code here:
        QuanLyHoaDon qlyhd = new QuanLyHoaDon();
        qlyhd.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTQuanLyHoaDonActionPerformed

    private void BTKiemKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTKiemKeActionPerformed
        // TODO add your handling code here:
        QuanLyKiemKe qlykk = new QuanLyKiemKe();
        qlykk.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTKiemKeActionPerformed

    private void BTThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTThongKeActionPerformed
        // TODO add your handling code here:
        ThongKe tk = new ThongKe();
        tk.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTThongKeActionPerformed

    private void BTReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTReturnActionPerformed
        // TODO add your handling code here:
        dispose();
        Login loginscr = new Login();
        loginscr.setVisible(true);
    }//GEN-LAST:event_BTReturnActionPerformed

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
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManHinhChinh().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTKiemKe;
    private javax.swing.JButton BTQuanLyHoaDon;
    private javax.swing.JButton BTQuanLyNhanVien;
    private javax.swing.JButton BTQuanLyNhapKho;
    private javax.swing.JButton BTQuanLySanPham;
    private javax.swing.JButton BTQuanLyThanhVien;
    private javax.swing.JButton BTReturn;
    private javax.swing.JButton BTThongKe;
    public static javax.swing.JLabel ChucVu;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel SDT;
    public static javax.swing.JLabel TenNV;
    private javax.swing.JLabel TongHoaDon;
    private javax.swing.JLabel TongNhanVien;
    private javax.swing.JLabel TongThanhVien;
    private javax.swing.JLabel TongTonKho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel timelable;
    // End of variables declaration//GEN-END:variables
}
