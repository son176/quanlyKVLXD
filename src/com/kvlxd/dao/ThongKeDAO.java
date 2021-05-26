/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThongKeDAO {

    String SELECT_TONGSL_BY_MAMH = "select SUM(SoLuong) as 'SoLuong' from HDNhapCT where MaMH=?";
    String NamThang = "select distinct YEAR(NgayNhap) as nam, MONTH(NgayNhap)as thang from  HDNhap\n"
            + "where YEAR(NgayNhap) in (select YEAR(NgayXuat) from HDXuat) and MONTH(NgayNhap) in (select MONTH(NgayXuat) from HDXuat)";

    String DOANHTHU = "select Sum(HDXuatCT.SoLuong*HDXuatCT.GiaXuat) as Xuat,Sum(HDNhapCT.SoLuong*HDNhapCT.GiaNiemYet) as Nhap from HDXuat\n"
            + "join NhanVien on NhanVien.MaNV=HDXuat.MaNV\n"
            + "join HDNhap on HDNhap.MaNV=NhanVien.MaNV\n"
            + "join HDNhapCT on HDNhap.MaHDN=HDNhapCT.MaHDN\n"
            + "join HDXuatCT on HDXuat.MaHDX=HDXuatCT.MaHDX\n"
            + "where YEAR(NgayNhap) = ? and MONTH(NgayNhap) = ?\n"
            + "	and YEAR(NgayXuat) = ? and MONTH(NgayXuat) = ?";

    String TKHaoHut = "-- thong ke hao hut\n"
            + "select MONTH(NgayKiemKe) as thang,MatHang.MaMH,TenMH,MatHang.SoLuong,SLKiemKe,(select SoLuong from HangTon where YEAR(NgayNhap)=2020) as SLTon,SLHong,(SoLuong - SLKiemKe - SLHong)as HaoHut from MatHang\n"
            + "join KiemKe on KiemKe.MaMH= MatHang.MaMH\n"
            + "where MatHang.MaMH=? and YEAR(NgayKiemKe) = ?";

    String NamHangTon = "select distinct Year(NgayKiemKe) as Nam from KiemKe";

    public List<Object[]> HangTonKho(int year, int[] m) {
        String sql = "{CALL HangTonKho(?,?,?)}";
        String[] cols = {"MaMH", "TenMH", "SLN", "SLX", "SLHong", "SLTonKho"};
        return this.getListOfArray(sql, cols, year, m[0], m[1]);
    }

    public List<Object> NamHT() {
        try {
            List<Object> listNHT = new ArrayList<>();
            ResultSet rs = JDBCHelper.query(NamHangTon);
            while (rs.next()) {
                listNHT.add(rs.getObject("Nam"));
            }
            return listNHT;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Object[]> DoanhThu(int year, int m) {
        String[] cl = new String[]{"Xuat", "Nhap"};
        return getListOfArray(DOANHTHU, cl, year, m, year, m);
    }

    public List<Object[]> NamThangDT() {
        String[] cl = new String[]{"nam", "thang"};
        return getListOfArray(NamThang, cl);
    }

    public List<Object[]> HaoHut(String mamh, int year) {
        String[] cl = new String[]{"thang", "MaMH", "TenMH", "SoLuong", "SLKiemKe", "SLTon", "SLHong", "HaoHut"};
        return getListOfArray(TKHaoHut, cl, mamh, year);
    }

}
