/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.ui;

import com.kvlxd.dao.LoaiHangDAO;
import com.kvlxd.entity.LoaiHang;
import com.kvlxd.util.Auth;
import com.kvlxd.util.CheckData;
import com.kvlxd.util.MsgBox;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class LoaiHangJDialog extends javax.swing.JInternalFrame {

    LoaiHangDAO lhdao = new LoaiHangDAO();
    int row = -1;

    public LoaiHangJDialog() {
        initComponents();
        inits();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLoaiHang = new javax.swing.JTable();

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã loại hàng:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên loại hàng:");

        txtMa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMa)
                        .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSua, btnThem, btnXoa, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tabs.addTab("Thông tin chi tiết", jPanel1);

        tbLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbLoaiHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại hàng", "Tên loại hàng"
            }
        ));
        tbLoaiHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoaiHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLoaiHang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Danh sách loại hàng", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbLoaiHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiHangMouseClicked
        row = tbLoaiHang.getSelectedRow();
        edit();
    }//GEN-LAST:event_tbLoaiHangMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbLoaiHang;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void inits() {
        this.fillTable();
        this.row = -1;
        tabs.setSelectedIndex(1);
        this.updateStatus();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbLoaiHang.getModel();
        model.setRowCount(0);
        List<LoaiHang> list = lhdao.selectAll();
        for (LoaiHang lh : list) {
            Object[] bk = new Object[]{lh.getMaLH(), lh.getTenLH()};
            model.addRow(bk);
        }

    }

    private void edit() {
        try {
            String malh = (String) tbLoaiHang.getValueAt(row, 0);
            LoaiHang lh = lhdao.selectById(malh);
            setForm(lh);
            tabs.setSelectedIndex(0);
            this.updateStatus();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setForm(LoaiHang lh) {
        txtMa.setText(lh.getMaLH());
        txtTen.setText(lh.getTenLH());
    }

    LoaiHang getForm() {
        LoaiHang l = new LoaiHang();
        l.setMaLH(txtMa.getText());
        l.setTenLH(txtTen.getText());
        return l;
    }

    private void clearForm() {
        LoaiHang lh = new LoaiHang();
        setForm(lh);
        row = -1;
        updateStatus();
    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);
        //Trạng thái form
        txtMa.setEnabled(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    void insert() {
        String err = check("Them");
        if (err.equals("")) {
            LoaiHang lh = getForm();
            try {
                lhdao.insert(lh);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại");
            }
        } else {
            MsgBox.alert(this, err);
        }

    }

    void update() {
        String err = check("Sua");
        if (err.equals("")) {
            LoaiHang lh = getForm();
            try {
                lhdao.update(lh);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Cập nhập thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhập thất bại");
            }
        } else {
            MsgBox.alert(this, err);
        }

    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa loại hàng");
        } else {
            String malh = txtMa.getText();
            if (MsgBox.confirm(this, "Bạn có muốn xóa Loại hàng" + txtMa.getText() + "?")) {
                try {
                    lhdao.delete(malh);
                    fillTable();
                    updateStatus();
                    clearForm();
                    MsgBox.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "Xóa thất bại");
                }
            }
        }

    }

    private String check(String btn) {
        String err = "";
        if (!checkTrung() && btn.equals("Them")) {
            err += "Mã loại hàng trùng ";
        } else {
            if (CheckData.isNull(txtMa.getText()) && btn.equals("Them")) {
                err += "Mã loại hàng không được để trống\n";
            }
            if (CheckData.isNull(txtTen.getText())) {
                err += "Tên loại hàng không được để trống\n";
            }
        }
        return err;
    }

    private boolean checkTrung() {
        LoaiHang h = lhdao.selectById(txtMa.getText());
        if (h == null) {
            return true;
        } else {
            return false;
        }
    }

}
