/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.HoaDonNhap;
import com.kvlxd.entity.HoaDonXuat;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cuong
 */
public class HoaDonXuatDAO extends kvlxdDAO<HoaDonXuat, Integer> {

    String INSERT_SQL = "insert into HDXuat values (?,?,?,?,?,?)";
    String UPDATE_SQL = "update HDXuat set MaNV = ?, MaKH=?, TenLaiXe=?, SDTLaiXe=?, NgayXuat=?, TrangThai=? where MaHDX=?";
    String DELETE_SQL = "delete from HDXuat where MaHDX = ?";
    String SELECT_ALL_SQL = "select * from HDXuat";
    String SELECT_BY_ID_SQL = "select * from HDXuat where MaHDX = ?";
    String SELECT_MAX_MaHDN = "select * from HDXuat where MaHDX = (select max(MaHDX) from HDXuat)";
    String SELECT_BY_NGAYNHAP="select * from HDXuat where NgayXuat = ?";

    public int MaxMaHDN() {
        List<HoaDonXuat> list = selectBySql(SELECT_MAX_MaHDN);
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0).getMaHDX();
        }

    }

    @Override
    public void insert(HoaDonXuat entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaNV(), entity.getMaKH(), entity.getTenLaiXe(), entity.getSDTLaiXe(), entity.getNgayXuat(), entity.isTrangThai());

    }

    @Override
    public void update(HoaDonXuat entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaNV(), entity.getMaKH(), entity.getTenLaiXe(), entity.getSDTLaiXe(), entity.getNgayXuat(), entity.isTrangThai(), entity.getMaHDX());

    }

    @Override
    public void delete(Integer key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<HoaDonXuat> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDonXuat selectById(Integer id) {
        List<HoaDonXuat> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HoaDonXuat> selectBySql(String sql, Object... args) {
        List<HoaDonXuat> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDonXuat hdx = new HoaDonXuat();
                hdx.setMaHDX(rs.getInt("MaHDX"));
                hdx.setMaNV(rs.getString("MaNV"));
                hdx.setMaKH(rs.getString("MaKH"));
                hdx.setTenLaiXe(rs.getString("TenLaiXe"));
                hdx.setSDTLaiXe(rs.getString("SDTLaiXe"));
                hdx.setNgayXuat(rs.getDate("NgayXuat"));
                hdx.setTrangThai(rs.getBoolean("TrangThai"));
                list.add(hdx);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<HoaDonXuat> selectByNgayNhap(Date ngaynhap) {
        List<HoaDonXuat> list = selectBySql(SELECT_BY_NGAYNHAP, ngaynhap);
        if (list.isEmpty()) {
            return null;
        }
        
        return list;
    }

}
