/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.HoaDonNhap;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HoaDonNhapDAO extends kvlxdDAO<HoaDonNhap, String> {

    String INSERT_SQL = "insert into HDNhap values (?,?,?,?,?)";
    String UPDATE_SQL = "update HDNhap set MaNV = ?,MaNCC=?,TenLaiXe=?,SDTLaiXe=?,NgayNhap=? where MaHDN=?";
    String DELETE_SQL = "delete from HDNhap where MaHDN = ?";
    String SELECT_ALL_SQL = "select * from HDNhap";
    String SELECT_BY_ID_SQL = "select * from HDNhap where MaHDN = ?";
    String SELECT_MAX_MaHDN = "select * from HDNhap where MaHDN = (select max(MaHDN) from HDNhap)";
    String SELECT_BY_NGAYNHAP="select * from HDNhap where NgayNhap = ?";


    public int MaxMaHDN() {
        List<HoaDonNhap> list = selectBySql(SELECT_MAX_MaHDN);
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0).getMaHDN();
        }

    }

    @Override
    public void insert(HoaDonNhap entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaNV(), entity.getMaNCC(),
                entity.getTenLaiXe(), entity.getSDTLaiXe(), entity.getNgayNhap());
    }

    @Override
    public void update(HoaDonNhap entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaNV(), entity.getMaNCC(),
                entity.getTenLaiXe(), entity.getSDTLaiXe(), entity.getNgayNhap(), entity.getMaHDN());
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<HoaDonNhap> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    public HoaDonNhap selectByIdd(int id) {
        List<HoaDonNhap> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HoaDonNhap> selectBySql(String sql, Object... args) {
        List<HoaDonNhap> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDonNhap hdn = new HoaDonNhap();
                hdn.setMaHDN(rs.getInt("MaHDN"));
                hdn.setMaNV(rs.getString("MaNV"));
                hdn.setMaNCC(rs.getString("MaNCC"));
                hdn.setTenLaiXe(rs.getString("TenLaiXe"));
                hdn.setSDTLaiXe(rs.getString("SDTLaiXe"));
                hdn.setNgayNhap(rs.getDate("NgayNhap"));
                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public HoaDonNhap selectById(String key) {
        List<HoaDonNhap> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
public List<HoaDonNhap> selectByNgayNhap(Date ngaynhap) {
        List<HoaDonNhap> list = selectBySql(SELECT_BY_NGAYNHAP, ngaynhap);
        if (list.isEmpty()) {
            return null;
        }
        
        return list;
    }
}
