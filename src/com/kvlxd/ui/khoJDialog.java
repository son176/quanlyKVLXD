package com.kvlxd.ui;

import com.kvlxd.dao.KeHangDAO;
import com.kvlxd.dao.KhoDAO;
import com.kvlxd.dao.LoaiHangDAO;
import com.kvlxd.entity.KeHang;
import com.kvlxd.entity.Kho;
import com.kvlxd.entity.LoaiHang;
import com.kvlxd.util.Auth;
import com.kvlxd.util.CheckData;
import com.kvlxd.util.MsgBox;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class khoJDialog extends javax.swing.JInternalFrame {

    KhoDAO daokho = new KhoDAO();
    LoaiHangDAO daolh = new LoaiHangDAO();
    KeHangDAO daoKeHang = new KeHangDAO();
    int row = -1;

    public khoJDialog() {
        initComponents();
        inits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaKho = new javax.swing.JTextField();
        txtTenKho = new javax.swing.JTextField();
        txtViTri = new javax.swing.JTextField();
        txtDienTich = new javax.swing.JTextField();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblKeHang = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaKe = new javax.swing.JTextField();
        txtSucChua = new javax.swing.JTextField();
        btnMoiKe = new javax.swing.JButton();
        btnThemKe = new javax.swing.JButton();
        btnSuaKe = new javax.swing.JButton();
        btnXoaKe = new javax.swing.JButton();
        rdoTrong = new javax.swing.JRadioButton();
        rdoKTrong = new javax.swing.JRadioButton();
        cboTenLoaiHang = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKho = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã kho:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên kho:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên loại hàng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Vị trí:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Diện tích:");

        txtMaKho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTenKho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtViTri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDienTich.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDienTich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDienTichActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kệ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tblKeHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblKeHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã kệ", " Trạng thái", "Sức chứa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKeHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKeHangMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblKeHang);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Mã kệ:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Trạng thái:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Sức chứa:");

        txtMaKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSucChua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnMoiKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMoiKe.setText("Mới");
        btnMoiKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiKeActionPerformed(evt);
            }
        });

        btnThemKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemKe.setText("Thêm kệ");
        btnThemKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKeActionPerformed(evt);
            }
        });

        btnSuaKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaKe.setText("Sửa kệ");
        btnSuaKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKeActionPerformed(evt);
            }
        });

        btnXoaKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoaKe.setText("Xóa kệ");
        btnXoaKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoTrong);
        rdoTrong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoTrong.setText("Trống");

        buttonGroup1.add(rdoKTrong);
        rdoKTrong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoKTrong.setText("Không trống");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnMoiKe)
                        .addGap(30, 30, 30)
                        .addComponent(btnThemKe))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSucChua, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMaKe, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(rdoTrong)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdoKTrong))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btnSuaKe)
                        .addGap(26, 26, 26)
                        .addComponent(btnXoaKe)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoiKe, btnSuaKe, btnThemKe, btnXoaKe});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMaKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rdoTrong)
                            .addComponent(rdoKTrong))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtSucChua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoiKe)
                    .addComponent(btnThemKe)
                    .addComponent(btnSuaKe)
                    .addComponent(btnXoaKe))
                .addContainerGap())
        );

        cboTenLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboTenLoaiHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTenLoaiHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenLoaiHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenKho, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(txtViTri)
                    .addComponent(txtDienTich)
                    .addComponent(txtMaKho)
                    .addComponent(cboTenLoaiHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnMoi)
                    .addComponent(btnXoa))
                .addGap(31, 31, 31))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoi, btnSua, btnThem, btnXoa});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMoi)
                        .addGap(30, 30, 30)
                        .addComponent(btnThem)
                        .addGap(32, 32, 32)
                        .addComponent(btnSua)
                        .addGap(27, 27, 27)
                        .addComponent(btnXoa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboTenLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Thông tin chi tiết", jPanel1);

        tblKho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã kho", "Tên kho", "Mã loại hàng", "Vị trí", "Diện tích"
            }
        ));
        tblKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKho);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        tabs.addTab("Danh sách kho", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDienTichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDienTichActionPerformed

    }//GEN-LAST:event_txtDienTichActionPerformed

    private void tblKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoMouseClicked
        row = tblKho.getSelectedRow();
        edit();
        this.fillTableKeHang();
    }//GEN-LAST:event_tblKhoMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insertForm();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        updateForm();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        deleteForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblKeHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKeHangMouseClicked
        row = tblKeHang.getSelectedRow();
        editKe();
    }//GEN-LAST:event_tblKeHangMouseClicked

    private void btnMoiKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiKeActionPerformed
        clearKe();
    }//GEN-LAST:event_btnMoiKeActionPerformed

    private void btnThemKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKeActionPerformed
        insertKe();
    }//GEN-LAST:event_btnThemKeActionPerformed

    private void btnSuaKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKeActionPerformed
        updateKe();
    }//GEN-LAST:event_btnSuaKeActionPerformed

    private void btnXoaKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKeActionPerformed
        deleteKe();
    }//GEN-LAST:event_btnXoaKeActionPerformed

    private void cboTenLoaiHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenLoaiHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTenLoaiHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnMoiKe;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaKe;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemKe;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaKe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTenLoaiHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rdoKTrong;
    private javax.swing.JRadioButton rdoTrong;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblKeHang;
    private javax.swing.JTable tblKho;
    private javax.swing.JTextField txtDienTich;
    private javax.swing.JTextField txtMaKe;
    private javax.swing.JTextField txtMaKho;
    private javax.swing.JTextField txtSucChua;
    private javax.swing.JTextField txtTenKho;
    private javax.swing.JTextField txtViTri;
    // End of variables declaration//GEN-END:variables

    private void inits() {
        this.fillTable();
        this.fillComboBoxTenLoaiHang();
        this.row = -1;
        tabs.setSelectedIndex(1);
        this.updateStatus();
        AutoCompleteDecorator.decorate(cboTenLoaiHang);
    }

    private void fillComboBoxTenLoaiHang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTenLoaiHang.getModel();
        model.removeAllElements();
        List<LoaiHang> list = daolh.selectAll();
        for (LoaiHang lh : list) {
            model.addElement(lh);
        }
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKho.getModel();
        model.setRowCount(0);
        try {
            List<Kho> list = daokho.selectAll();
            for (Kho k : list) {
                Object[] row = {k.getMaKho(), k.getTenKho(), k.getMaLH(), k.getViTri(), k.getDienTich()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lõi truy vấn dữ liệu");
        }
    }

    private void edit() {
        try {
            String makho = (String) tblKho.getValueAt(row, 0);
            Kho kho = daokho.selectById(makho);
            setForm(kho);
            tabs.setSelectedIndex(0);
            updateStatus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearForm() {
        txtDienTich.setText("");
        txtMaKe.setText("");
        txtMaKho.setText("");
        txtSucChua.setText("");
        txtTenKho.setText("");
        cboTenLoaiHang.setSelectedIndex(0);
        txtViTri.setText("");
        DefaultTableModel model = (DefaultTableModel) tblKeHang.getModel();
        model.setRowCount(0);
        row = -1;
        updateStatus();
    }

    private void insertForm() {
        String err = check("Them");
        if (err.equals("")) {
            Kho k = getForm();
            try {
                daokho.insert(k);
                fillTable();
                updateStatus();
                MsgBox.alert(this, "Thêm thành công");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "Thêm thất bại");
            }
        } else {
            MsgBox.alert(this, err);

        }
    }

    private void setForm(Kho kho) {
        LoaiHang lh = daolh.selectTenLH(kho.getMaKho());
        String tenlh = lh.getTenLH();
        txtMaKho.setText(kho.getMaKho());
        txtTenKho.setText(kho.getTenKho());
        txtViTri.setText(kho.getViTri());
        txtDienTich.setText(String.valueOf(kho.getDienTich()));
        cboTenLoaiHang.setSelectedItem(lh);
    }

    Kho getForm() {
        LoaiHang lh = (LoaiHang) cboTenLoaiHang.getSelectedItem();
        String malh = lh.getMaLH();
        Kho k = new Kho();
        k.setMaKho(txtMaKho.getText());
        k.setTenKho(txtTenKho.getText());
        k.setViTri(txtViTri.getText());
        k.setDienTich(Double.parseDouble(txtDienTich.getText()));

        k.setMaLH(malh);
        return k;
    }

    private void updateForm() {
        String err = check("Sua");
        if (err.equals("")) {
            Kho k = getForm();
            try {
                daokho.update(k);
                fillTable();
                clearForm();
                tabs.setSelectedIndex(1);
                MsgBox.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "Cập nhật thất bại");
            }
        } else {
            MsgBox.alert(this, err);

        }
    }

    private void deleteForm() {
        List<KeHang> list = daoKeHang.selectByMaKho(txtMaKho.getText());
        if (list.size() > 0) {
            MsgBox.alert(this, "Kệ hàng đang tồn tại !");
            return;
        } else {
            if (!Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xóa kho");
            } else {
                String mak = txtMaKho.getText();
                if (MsgBox.confirm(this, "Bạn có muốn xóa kho" + txtMaKho.getText() + "?")) {
                    try {
                        daokho.delete(mak);
                        fillTable();
                        updateStatus();
                        clearForm();
                        MsgBox.alert(this, "Xóa thành công");
                    } catch (Exception e) {
                        //  e.printStackTrace();
                        MsgBox.alert(this, "Xóa thất bại");
                    }
                }
            }
        }

    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);
        //Trạng thái form
        txtMaKe.setEditable(!edit);
        txtMaKho.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    private void fillTableKeHang() {
        DefaultTableModel model = (DefaultTableModel) tblKeHang.getModel();
        model.setRowCount(0);

        try {
            List<KeHang> list = daoKeHang.selectByMaKho(txtMaKho.getText());

            if (list != null) {
                for (KeHang kh : list) {
                    model.addRow(new Object[]{kh.getMaKe(), kh.isTrangThai() ? "Trống" : "Không trống", kh.getSucChua()});
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    KeHang getFormKe() {
        KeHang kh = new KeHang();
        kh.setMaKe(txtMaKe.getText());
        kh.setMaKho(txtMaKho.getText());
        kh.setTrangThai(rdoTrong.isSelected());
        // kh.setTrangThai(!rdoKTrong.isSelected());
        kh.setSucChua(Double.parseDouble(txtSucChua.getText()));
        return kh;
    }

    void setFormKe(KeHang kh) {
        txtMaKe.setText(kh.getMaKe());
        rdoTrong.setSelected(kh.isTrangThai());
        rdoKTrong.setSelected(!kh.isTrangThai());
        txtSucChua.setText(kh.getSucChua() + "");
    }

    private void clearKe() {
        KeHang k = new KeHang();
        setFormKe(k);

        row = -1;
        updateStatus();
    }

    private void insertKe() {
        String err = checkKe("Them");
        if (err.equals("")) {
            KeHang k = getFormKe();
            try {
                daoKeHang.insert(k);
                fillTableKeHang();
                updateStatus();
                MsgBox.alert(this, "Thêm thành công");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "Thêm thất bại");
            }
        } else {
            MsgBox.alert(this, err);
        }
    }

    private void updateKe() {
        String err = checkKe("Sua");
        if (err.equals("")) {
            try {
                KeHang k = getFormKe();

                daoKeHang.update(k);
                fillTableKeHang();

                tabs.setSelectedIndex(0);
                MsgBox.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "Cập nhật thất bại");
            }
        } else {
            MsgBox.alert(this, err);
        }
    }

    private void deleteKe() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa kho");
        } else {
            String mak = txtMaKe.getText();
            if (MsgBox.confirm(this, "Bạn có muốn xóa kệ " + txtMaKe.getText() + "?")) {
                try {

                    daoKeHang.delete(mak);
                    fillTableKeHang();
                    updateStatus();
                    MsgBox.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "Xóa thất bại");
                }
            }
        }
    }

    private void editKe() {
        try {
            String make = (String) tblKeHang.getValueAt(row, 0);
            KeHang kh = daoKeHang.selectById(make);
            setFormKe(kh);
            tabs.setSelectedIndex(0);
            updateStatus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String check(String btn) {
        String err = "";
        if (!checkTrung() && btn.equals("Them")) {
            err += "Mã kho trùng ";
        } else {
            if (CheckData.isNull(txtMaKho.getText()) && btn.equals("Them")) {
                err += "Mã kho không được để trống\n";
            }
            if (CheckData.isNull(txtTenKho.getText())) {
                err += "Tên kho không được để trống\n";
            }
            if (CheckData.isNull(txtViTri.getText())) {
                err += "Vị trí không được để trống\n";
            }
            if (CheckData.isNull(txtDienTich.getText())) {
                err += "Diện tích không được để trống\n";
            } else {
                if (!CheckData.isDouble(txtDienTich.getText())) {
                    err += "Diện tích sai định dạng\n";
                }
            }
        }
        return err;
    }

    private boolean checkTrung() {
        Kho h = daokho.selectById(txtMaKho.getText());
        if (h == null) {
            return true;
        } else {
            return false;
        }
    }

    private String checkKe(String btn) {
        String err = "";
        if (!checkTrung() && btn.equals("Them")) {
            err += "Mã kệ trùng ";
        } else {
            if (CheckData.isNull(txtMaKe.getText()) && btn.equals("Them")) {
                err += "Mã kệ không được để trống\n";
            }
            if (CheckData.isNull(txtSucChua.getText())) {
                err += "Sức chứa không được để trống\n";
            } else {
                if (!CheckData.isDouble(txtSucChua.getText())) {
                    err += "Sức chứa sai định dạng\n";
                }
            }
        }
        return err;
    }

    private boolean checkTrungKe() {
        KeHang h = daoKeHang.selectById(txtMaKe.getText());
        if (h == null) {
            return true;
        } else {
            return false;
        }
    }
}
