package com.kvlxd.ui;

import com.kvlxd.dao.KeHangDAO;
import com.kvlxd.dao.KhoDAO;
import com.kvlxd.dao.LoaiHangDAO;
import com.kvlxd.dao.Main2DAO;
import com.kvlxd.dao.MatHangDAO;
import com.kvlxd.entity.KeHang;
import com.kvlxd.entity.MatHang;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class Main2 extends javax.swing.JInternalFrame {

    public Main2() {
        initComponents();
        inits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbnTTKho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbnDSMH = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbnDSHDX = new javax.swing.JTable();
        lblQuy = new javax.swing.JLabel();
        lblNam = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDSMHHet = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbnTTKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã kho", "Tên kho", "Tình Trạng", "Tổng giá trị"
            }
        ));
        jScrollPane1.setViewportView(tbnTTKho);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Tình trạng kho:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Danh sách mặt hàng bán chạy:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quý:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Năm:");

        tbnDSMH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã mặt hàng", "Tên mặt hàng", "Tổng giá trị"
            }
        ));
        jScrollPane2.setViewportView(tbnDSMH);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Danh sách đơn hàng chờ:");

        tbnDSHDX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD xuất", "Tên NV", "Tên khách hàng", "SDT KH", "Địa chỉ", "Tên lái xe", "SDT lái xe"
            }
        ));
        jScrollPane3.setViewportView(tbnDSHDX);

        lblQuy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuy.setText("Quý");

        lblNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNam.setText("Năm");

        tblDSMHHet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã mặt hàng", "Tên loại hàng", "Mã Kệ", "Mã Kho", "Tên mặt hàng", "Đơn giá", "Đơn vị", "Số lượng", "Ngày sản xuất", "Hãng"
            }
        ));
        jScrollPane4.setViewportView(tblDSMHHet);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Danh sách mặt hàng sắp hết trong kho:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNam, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(lblQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNam, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblQuy;
    private javax.swing.JTable tblDSMHHet;
    private javax.swing.JTable tbnDSHDX;
    private javax.swing.JTable tbnDSMH;
    private javax.swing.JTable tbnTTKho;
    // End of variables declaration//GEN-END:variables
    Main2DAO daom2 = new Main2DAO();

    private void inits() {
        fillDate();
        fillTTKho();
        fillMHChay();
        fillHDChuaXuat();
        fillToTableDSMHHet();
    }

    private void fillDate() {
        LocalDate d = java.time.LocalDate.now();
        int year = d.getYear();
        int month = d.getMonthValue();
        int quy;
        if (month < 4) {
            quy = 1;
        } else if (month < 7) {
            quy = 2;
        } else if (month < 10) {
            quy = 3;
        } else {
            quy = 4;
        }
        lblNam.setText(String.valueOf(year));
        lblQuy.setText(String.valueOf(quy));
    }

    private void fillTTKho() {
        List<Object[]> list = daom2.TTKho();
        DefaultTableModel model = (DefaultTableModel) tbnTTKho.getModel();

        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            model.addRow(new Object[]{list.get(i)[0], list.get(i)[1], list.get(i)[3] + "/" + list.get(i)[2], doiTien(list.get(i)[4])});
        }
    }

    private void fillMHChay() {
        List<Object[]> list = daom2.DSMHBanChay();
        DefaultTableModel model = (DefaultTableModel) tbnDSMH.getModel();
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            model.addRow(new Object[]{tbnDSMH.getRowCount() + 1, list.get(i)[0], list.get(i)[1], doiTien(list.get(i)[2])});
        }
    }

    private void fillHDChuaXuat() {
        List<Object[]> list = daom2.TTHDX();
        DefaultTableModel model = (DefaultTableModel) tbnDSHDX.getModel();
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            model.addRow(list.get(i));
        }
    }

    private String doiTien(Object ob) {
        DecimalFormat fm = new DecimalFormat("#");
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        return currencyVN.format(Double.parseDouble(String.valueOf(ob)));
    }

    MatHangDAO daomh = new MatHangDAO();
    KeHangDAO daoke = new KeHangDAO();
    KhoDAO daoK = new KhoDAO();
    LoaiHangDAO daolh = new LoaiHangDAO();

    private double SLSapHet(MatHang mh) {
        List<KeHang> listKe = daoke.selectByMaMH(mh.getMaMH());
        double sc = listKe.get(0).getSucChua();
        return sc * 2 / 100;
    }

    private void fillToTableDSMHHet() {
        DefaultTableModel model = (DefaultTableModel) tblDSMHHet.getModel();
        model.setRowCount(0);
        List<MatHang> listMH = daomh.selectAll();
        for (MatHang mh : listMH) {
            if (mh.getSoLuong() < SLSapHet(mh)) {
                model.addRow(new Object[]{mh.getMaMH(), daolh.selectById(mh.getMaLH()).getTenLH(), mh.getMaKe(), daoK.selectByMaKe(mh.getMaKe()), mh.getTenMH(), mh.getDonGia(), mh.getDonVi(), mh.getSoLuong(), mh.getNgaySanXuat(), mh.getHang()});
            }
        }
    }
}
