/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.HoaDonXuatChiTiet;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cuong
 */
public class HoaDonXuatChiTietDAO extends kvlxdDAO<HoaDonXuatChiTiet, Integer> {

    String INSERT_SQL = "insert into HDXuatCT values (?,?,?,?,?)";
    String UPDATE_SQL = "update HDXuatCT set SoLuong=?, MaMH=?, GhiChu=?, GiaXuat=? where ID=?";
    String DELETE_SQL = "delete from HDXuatCT where ID = ?";
    String SELECT_ALL_SQL = "select * from HDXuatCT";
    String SELECT_BY_ID_SQL = "select * from HDXuatCT where ID = ?";
    String SELECT_BY_MAHDX_SQL = "select * from HDXuatCT where MaHDX = ?";
    String SELECT_BY_MAMH = "select * from HDXuatCT where MaMH = ?";

    
    public List<HoaDonXuatChiTiet> selectByMatHangXuatCTiet(String mamh) {
        List<HoaDonXuatChiTiet> list = selectBySql(SELECT_BY_MAMH, mamh);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
    public List<HoaDonXuatChiTiet> selectByMaHDX(String maHDX) {
        return this.selectBySql(SELECT_BY_MAHDX_SQL, maHDX);
    }

    @Override
    public void insert(HoaDonXuatChiTiet entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaHDX(), entity.getSoLuong(), entity.getMaMH(), entity.getGhiChu(), entity.getGiaXuat());
    }

    @Override
    public void update(HoaDonXuatChiTiet entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getSoLuong(), entity.getMaMH(), entity.getGhiChu(), entity.getGiaXuat(), entity.getID());
    }

    @Override
    public void delete(Integer key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<HoaDonXuatChiTiet> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDonXuatChiTiet selectById(Integer key) {
        List<HoaDonXuatChiTiet> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HoaDonXuatChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonXuatChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDonXuatChiTiet hdct = new HoaDonXuatChiTiet();
                hdct.setID(rs.getInt("ID"));
                hdct.setMaHDX(rs.getInt("MaHDX"));
                hdct.setSoLuong(rs.getDouble("SoLuong"));
                hdct.setMaMH(rs.getString("MaMH"));
                hdct.setGiaXuat(rs.getDouble("GiaXuat"));
                hdct.setGhiChu(rs.getString("GhiChu"));
                list.add(hdct);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
