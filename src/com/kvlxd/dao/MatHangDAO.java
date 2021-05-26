/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.util.JDBCHelper;
import com.kvlxd.entity.MatHang;
import com.kvlxd.util.CheckData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class MatHangDAO extends kvlxdDAO<MatHang, String> {

    String INSERT_SQL = "insert into MatHang values (?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update MatHang set MaLH = ?, MaKe =?, TenMH = ?, DonGia=?, DonVi=?, NgaySanXuat=?, Hang=? where MaMH=?";
    String DELETE_SQL = "delete from MatHang where MaMH = ?";
    String SELECT_ALL_SQL = "select * from MatHang";
    String SELECT_BY_ID_SQL = "select * from MatHang where MaMH = ?";
    String SELECT_ALL_SQL_MaKho = "select * from MatHang inner join LoaiHang on LoaiHang.MaLH=MatHang.MaLH inner join Kho on Kho.MaLH=LoaiHang.MaLH where MaKho = ?";
    String SELECT_BY_TENMH = "select * from MatHang where TenMH=?";
    String SELECT_TENMH = "select * from MatHang where TenMH like ?";
    String UPDATE_SQL_SL = "update MatHang set  SoLuong=? where MaMH=?";
    String SELECT_BY_KIEMKE = "select * from MatHang where MatHang.MaMH in (select MaMH from KiemKe)";
    String SELECT_SUMSLN = "select (sum(SoLuong)) as SLN from HDNhapCT\n"
            + " where MaMH=?";
    String SELECT_SUMSLX = "select (sum(SoLuong)) as SLX from HDXuatCT\n"
            + " where MaMH=?;";

    String queryPhanTrang = "Select count(*) as SLD from MatHang inner join LoaiHang on LoaiHang.MaLH=MatHang.MaLH inner join Kho on Kho.MaLH=LoaiHang.MaLH where MaKho = ?";

    public double selectTongMH(String mamh) {
        try {
            ResultSet rsN = JDBCHelper.query(SELECT_SUMSLN, mamh);
            ResultSet rsX = JDBCHelper.query(SELECT_SUMSLX, mamh);
            double slN = 0, slX = 0;
            while (rsN.next()) {
                slN = rsN.getDouble("SLN");
            }
            while (rsX.next()) {
                slX = rsX.getDouble("SLX");
            }
            return slN - slX;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;

        }
    }

    public List<MatHang> selectKiemKe() {
        return this.selectBySql(SELECT_BY_KIEMKE);
    }

    public void updateSL(MatHang entity) {
        JDBCHelper.update(UPDATE_SQL_SL, entity.getSoLuong(), entity.getMaMH());
    }

    public List<MatHang> SearchByTenMH(String tenMH) {
        return selectBySql(SELECT_TENMH, tenMH);
    }

    @Override
    public void insert(MatHang entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaMH(), entity.getMaLH(), entity.getMaKe(), entity.getTenMH(), entity.getDonGia(), entity.getDonVi(), entity.getSoLuong(), entity.getNgaySanXuat(), entity.getHang());
    }

    @Override
    public void update(MatHang entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaLH(), entity.getMaKe(), entity.getTenMH(), entity.getDonGia(), entity.getDonVi(), entity.getNgaySanXuat(), entity.getHang(), entity.getMaMH());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<MatHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MatHang selectById(String id) {
        List<MatHang> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<MatHang> selectBySql(String sql, Object... args) {
        List<MatHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                MatHang k = new MatHang();
                k.setMaMH(rs.getString("MaMH"));
                k.setMaLH(rs.getString("MaLH"));
                k.setMaKe(rs.getString("MaKe"));
                k.setTenMH(rs.getString("TenMH"));
                k.setDonGia(rs.getDouble("DonGia"));
                k.setDonVi(rs.getString("DonVi"));
                k.setSoLuong(rs.getDouble("SoLuong"));
                k.setNgaySanXuat(rs.getDate("NgaySanXuat"));
                k.setHang(rs.getString("Hang"));
                list.add(k);
            }

            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public int selectAllSoTrang(String makho) {
        try {
            ResultSet rs = JDBCHelper.query(queryPhanTrang, makho);
            int sl = 0;
            while (rs.next()) {
                sl = rs.getInt("SLD");
            }
            return sl;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }

    public List<MatHang> selectTop5MatHang(long soTrang, String Makho) {
        try {
            // String sql = "select top 5 * from MatHang where [MaMH] not in (select top " + (soTrang * 5 - 5) + " [MaMH] from MatHang )";
            String sql2 = " select top 10 * from MatHang\n"
                    + "                    inner join LoaiHang on LoaiHang.MaLH =MatHang.MaLH\n"
                    + "                    inner join Kho on Kho.MaLH=LoaiHang.MaLH\n"
                    + "                     where [MaMH] not in (select top " + (soTrang * 10 - 10) + " [MaMH] from MatHang inner join LoaiHang on LoaiHang.MaLH =MatHang.MaLH\n"
                    + "                    inner join Kho on Kho.MaLH=LoaiHang.MaLH where Kho.MaKho=?) \n"
                    + "                    and Kho.MaKho=?";
            List<MatHang> lst = new ArrayList<>();

            ResultSet rs = JDBCHelper.query(sql2, Makho, Makho);

            while (rs.next()) {
                MatHang k = new MatHang();
                k.setMaMH(rs.getString("MaMH"));
                k.setMaLH(rs.getString("MaLH"));
                k.setMaKe(rs.getString("MaKe"));
                k.setTenMH(rs.getString("TenMH"));
                k.setDonGia(rs.getDouble("DonGia"));
                k.setDonVi(rs.getString("DonVi"));
                k.setSoLuong(rs.getDouble("SoLuong"));
                k.setNgaySanXuat(rs.getDate("NgaySanXuat"));
                k.setHang(rs.getString("Hang"));
                lst.add(k);

            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<MatHang> selectByMaKho(String maKho) {
        return this.selectBySql(SELECT_ALL_SQL_MaKho, maKho);
    }

    public List<MatHang> selectByMamh(String TenMH) {
        return this.selectBySql(SELECT_BY_TENMH, TenMH);
    }

    public MatHang selectMaMH(String tenMH) {
        String sql = "select * from MatHang where TenMH like N" + "'" + tenMH + "'";
        return selectBySql(sql).get(0);
    }
}
