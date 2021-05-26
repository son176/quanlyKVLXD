package com.kvlxd.ui;

import com.kvlxd.util.Auth;
import com.kvlxd.util.MsgBox;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.Timer;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        inits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnHDNhap = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnHDXuat = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        JDes = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        mniDangxuat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniKhachHang = new javax.swing.JMenuItem();
        mniNCC = new javax.swing.JMenuItem();
        mniHoaDonNhap = new javax.swing.JMenuItem();
        mniHDX = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mniKiemKe = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniDoanhThu = new javax.swing.JMenuItem();
        mniHaoHut = new javax.swing.JMenuItem();
        mniHangton = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ KHO VẬT LIỆU XÂY DỰNG HUYỀN TOÀN");
        setIconImages(null);

        jToolBar1.setRollover(true);

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);
        jToolBar1.add(jSeparator1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/User group.png"))); // NOI18N
        jButton2.setText("Nhân viên");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Home.png"))); // NOI18N
        jButton3.setText("Kho");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator3);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Card file.png"))); // NOI18N
        jButton4.setText("Mặt hàng");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator5);

        btnHDNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHDNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Lists.png"))); // NOI18N
        btnHDNhap.setText("Hóa đơn nhập");
        btnHDNhap.setFocusable(false);
        btnHDNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHDNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHDNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDNhapActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHDNhap);
        jToolBar1.add(jSeparator6);

        btnHDXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHDXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/List.png"))); // NOI18N
        btnHDXuat.setText("Hóa đơn xuất");
        btnHDXuat.setFocusable(false);
        btnHDXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHDXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHDXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHDXuat);
        jToolBar1.add(jSeparator7);
        jToolBar1.add(jSeparator4);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Globe.png"))); // NOI18N
        jButton6.setText("Hướng dẫn");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        javax.swing.GroupLayout JDesLayout = new javax.swing.GroupLayout(JDes);
        JDes.setLayout(JDesLayout);
        JDesLayout.setHorizontalGroup(
            JDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1284, Short.MAX_VALUE)
        );
        JDesLayout.setVerticalGroup(
            JDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Hệ thống quản lý kho");

        lblDongHo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDongHo.setText("00:00:00");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Info.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Alarm.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jMenu1.setText("Hệ thống");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mniDangNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Open door.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        jMenu1.add(mniDangNhap);

        mniDoiMatKhau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mniDoiMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        jMenu1.add(mniDoiMatKhau);

        mniDangxuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Exit.png"))); // NOI18N
        mniDangxuat.setText("Đăng xuất");
        mniDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangxuatActionPerformed(evt);
            }
        });
        jMenu1.add(mniDangxuat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mniKhachHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mniKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/User.png"))); // NOI18N
        mniKhachHang.setText("Quản lý khách hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }
        });
        jMenu2.add(mniKhachHang);

        mniNCC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        mniNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Users.png"))); // NOI18N
        mniNCC.setText("Quản lý nhà cung cấp");
        mniNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNCCActionPerformed(evt);
            }
        });
        jMenu2.add(mniNCC);

        mniHoaDonNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniHoaDonNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Lists.png"))); // NOI18N
        mniHoaDonNhap.setText("Quản lý hóa đơn nhập");
        mniHoaDonNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonNhapActionPerformed(evt);
            }
        });
        jMenu2.add(mniHoaDonNhap);

        mniHDX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniHDX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/List.png"))); // NOI18N
        mniHDX.setText("Quản lý hóa đơn xuất");
        mniHDX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniHDXMouseClicked(evt);
            }
        });
        mniHDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHDXActionPerformed(evt);
            }
        });
        jMenu2.add(mniHDX);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Box.png"))); // NOI18N
        jMenuItem1.setText("Quản lý loại hàng");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        mniKiemKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniKiemKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Notes.png"))); // NOI18N
        mniKiemKe.setText("Kiểm kê");
        mniKiemKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKiemKeActionPerformed(evt);
            }
        });
        jMenu2.add(mniKiemKe);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Dollar.png"))); // NOI18N
        mniDoanhThu.setText("Doanh thu");
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        jMenu3.add(mniDoanhThu);

        mniHaoHut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Diagram.png"))); // NOI18N
        mniHaoHut.setText("Hao hụt");
        mniHaoHut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHaoHutActionPerformed(evt);
            }
        });
        jMenu3.add(mniHaoHut);

        mniHangton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kvlxd/icon/Bricks.png"))); // NOI18N
        mniHangton.setText("Hàng tồn");
        mniHangton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHangtonActionPerformed(evt);
            }
        });
        jMenu3.add(mniHangton);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Hướng dẫn");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDes)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        this.openCuaSoDangNhap();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        this.openCuaSoDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.openCuaSoNhanVien();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachHangActionPerformed
        this.openCuaSoKhachHang();
    }//GEN-LAST:event_mniKhachHangActionPerformed

    private void mniNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNCCActionPerformed
        this.openCuasoNhaCungCap();
    }//GEN-LAST:event_mniNCCActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.openCuaSoKho();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.openCuaSoMatHang();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mniHoaDonNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDonNhapActionPerformed
        openCuaSoHoaDonNhap();
    }//GEN-LAST:event_mniHoaDonNhapActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        openCuaSoLoaiHang();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mniHDXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniHDXMouseClicked
      
    }//GEN-LAST:event_mniHDXMouseClicked

    private void mniHDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHDXActionPerformed
         openHoaDonXuat();
    }//GEN-LAST:event_mniHDXActionPerformed

    private void btnHDNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDNhapActionPerformed
        openCuaSoHoaDonNhap();
    }//GEN-LAST:event_btnHDNhapActionPerformed

    private void btnHDXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDXuatActionPerformed
        openHoaDonXuat();
    }//GEN-LAST:event_btnHDXuatActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        // TODO add your handling code here:
        if(Auth.user.isVaiTro()){
            openCuaSoThongKe(0);
        }else{
            MsgBox.alert(this, "Bạn không có quyền xem doanh thu");
        }
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void mniKiemKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKiemKeActionPerformed
      openCuaSoKiemKe();
    }//GEN-LAST:event_mniKiemKeActionPerformed

    private void mniDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangxuatActionPerformed
        DangXuat();
    }//GEN-LAST:event_mniDangxuatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
       DangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mniHaoHutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHaoHutActionPerformed
        // TODO add your handling code here:
        openCuaSoThongKe(1);
    }//GEN-LAST:event_mniHaoHutActionPerformed

    private void mniHangtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHangtonActionPerformed
        // TODO add your handling code here:
        openCuaSoThongKe(2);
    }//GEN-LAST:event_mniHangtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       MsgBox.alert(this, "Không tìm thấy đường dẫn");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
       
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
       MsgBox.alert(this, "Không tìm thấy đường dẫn");
    }//GEN-LAST:event_jMenu4MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDes;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHDNhap;
    private javax.swing.JButton btnHDXuat;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangxuat;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniHDX;
    private javax.swing.JMenuItem mniHangton;
    private javax.swing.JMenuItem mniHaoHut;
    private javax.swing.JMenuItem mniHoaDonNhap;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniKiemKe;
    private javax.swing.JMenuItem mniNCC;
    // End of variables declaration//GEN-END:variables
    private void inits() {
        
        new DangNhapJDialog(this, true).setVisible(true);
        if (Auth.isLogin()) {
            this.setVisible(true);
            mniDangNhap.setVisible(false);
        }
        new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String text = formater.format(now);
                lblDongHo.setText(text);
            }
        }).start();
        this.setSize(1920, 1070);
        this.setLocationRelativeTo(null);
        openCuaSoMain2();
        
    }
    private void DangXuat(){
        System.exit(0);
    }
    private void openCuaSoMain2() {
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        Main2 cd = new Main2();
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openCuaSoDangNhap() {
        new DangNhapJDialog(this, true).setVisible(true);
    }

    private void openCuaSoDoiMatKhau() {
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        DoiMatKhauJDialog cd = new DoiMatKhauJDialog();
        cd.setTitle("Đổi mật khẩu");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openCuaSoNhanVien() {
        if (Auth.isLogin()) {
            if (!Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem nhân viên");
                return;
            }

        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        NhanVienJDialog cd = new NhanVienJDialog();
        cd.setTitle("Quản lý nhân viên");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 100) / 2 - cd.getHeight() / 2 - 100);
        
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openCuaSoKhachHang() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            KhachHangJDialog kh = new KhachHangJDialog(this, true);
            kh.setTitle("Quản lý khách hàng");
            kh.setLocation(this.getWidth() / 2 - kh.getWidth() / 2, (this.getHeight() - 100) / 2 - kh.getHeight() / 2 - 100);
            JDes.add(kh);
            kh.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuasoNhaCungCap() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            NhaCungCapJDialog ncc = new NhaCungCapJDialog();
            ncc.setTitle("Quản lý nhà cung cấp");
            ncc.setLocation(this.getWidth() / 2 - ncc.getWidth() / 2, (this.getHeight() - 100) / 2 - ncc.getHeight() / 2 - 100);
            JDes.add(ncc);
            ncc.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoKho() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            khoJDialog k = new khoJDialog();
            k.setTitle("Quản lý kho");
            k.setLocation(this.getWidth() / 2 - k.getWidth() / 2, (this.getHeight() - 50) / 2 - k.getHeight() / 2 - 50);
            JDes.add(k);
            k.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoMatHang() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            MatHangJDialog k = new MatHangJDialog();
            k.setTitle("Quản lý mặt hàng");
            k.setLocation(this.getWidth() / 2 - k.getWidth() / 2, (this.getHeight() - 50) / 2 - k.getHeight() / 2 - 50);
            JDes.add(k);
            k.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }


    private void openCuaSoHoaDonNhap() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            HoaDonNhapJDialog k = new HoaDonNhapJDialog();
            k.setTitle("Quản lý hóa đơn nhập");
            k.setLocation(this.getWidth() / 2 - k.getWidth() / 2, (this.getHeight() - 50) / 2 - k.getHeight() / 2 - 50);
            JDes.add(k);
            k.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoLoaiHang() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            LoaiHangJDialog lh = new LoaiHangJDialog();
            lh.setTitle("Quản lý loại hàng");
            lh.setLocation(this.getWidth() / 2 - lh.getWidth() / 2, (this.getHeight() - 50) / 2 - lh.getHeight() / 2 - 50);
            JDes.add(lh);
            lh.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openHoaDonXuat() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            HoaDonXuatJDialog lh = new HoaDonXuatJDialog();
            lh.setTitle("Quản lý hóa đơn xuất");
             lh.setLocation(this.getWidth() / 2 - lh.getWidth() / 2, (this.getHeight() - 50) / 2 - lh.getHeight() / 2 - 50);
//            Dimension d = JDes.getSize();
//            lh.setSize(d.width, d.height);
            JDes.add(lh);
            lh.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoThongKe(int tab) {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            ThongKe1JDialog lh = new ThongKe1JDialog(tab);
            lh.setTitle("Thống kê doanh thu");
            lh.setLocation(this.getWidth() / 2 - lh.getWidth() / 2, (this.getHeight() - 50) / 2 - lh.getHeight() / 2 - 50);
            JDes.add(lh);
            lh.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }

    private void openCuaSoKiemKe() {
        if (Auth.isLogin()) {
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            KiemKeJDialog lh = new KiemKeJDialog();
            lh.setTitle("Kiểm kê");
            lh.setLocation(this.getWidth() / 2 - lh.getWidth() / 2, (this.getHeight() - 50) / 2 - lh.getHeight() / 2 - 50);
            JDes.add(lh);
            lh.setVisible(true);
        } else {
            MsgBox.alert(this, "Bạn phải đăng nhập");
            return;
        }
    }
}
