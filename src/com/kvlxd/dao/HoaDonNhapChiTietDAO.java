/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.HoaDonNhapChiTiet;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonNhapChiTietDAO extends kvlxdDAO<HoaDonNhapChiTiet, String> {

    String INSERT_SQL = "insert into HDNhapCT values (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update HDNhapCT set MaMH=?,TenMH=?,SoLuong=?,DVT=?,GiaNiemYet=?,GhiChu=? where  ID = ?";
    String DELETE_SQL = "delete from HDNhapCT where  ID = ?";
    String SELECT_ALL_SQL = "select * from HDNhapCT";
    String SELECT_BY_ID_SQL = "select * from HDNhapCT where MaHDN = ?";
    String SELECT_ID_FROM_ALL = "select MaHDN from HDNhapCT where MaHDN=? and MaMH = ? and TenMH = ? and SoLuong=? and DVT = ? and GiaNiemYet = ?";
    String SELECT_TONGSL_BY_MAMH = "select * from HDNhapCT where MaMH=?";

    public List<HoaDonNhapChiTiet> selectBySL(String id) {
        List<HoaDonNhapChiTiet> list = selectBySql(SELECT_TONGSL_BY_MAMH, id);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Override
    public void insert(HoaDonNhapChiTiet entity) {
        JDBCHelper.update(INSERT_SQL,entity.getMaHDN(), entity.getMaMH(), entity.getTenMH(), entity.getSoLuong(), entity.getDVT(), entity.getGiaNiemYet(), entity.getGhiChu());
    }

    @Override
    public void update(HoaDonNhapChiTiet entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaMH(), entity.getTenMH(), entity.getSoLuong(), entity.getDVT(), entity.getGiaNiemYet(), entity.getGhiChu(), entity.getID());
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    public void delete2(Integer id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<HoaDonNhapChiTiet> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDonNhapChiTiet selectById(String key) {
        List<HoaDonNhapChiTiet> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<HoaDonNhapChiTiet> selectByIdd(int id) {
        List<HoaDonNhapChiTiet> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Override
    protected List<HoaDonNhapChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonNhapChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDonNhapChiTiet hdct = new HoaDonNhapChiTiet();
                hdct.setID(rs.getInt("ID"));
                hdct.setMaHDN(rs.getInt("MaHDN"));
                hdct.setMaMH(rs.getString("MaMH"));
                hdct.setTenMH(rs.getString("TenMH"));
                hdct.setDVT(rs.getString("DVT"));
                hdct.setSoLuong(rs.getDouble("SoLuong"));
                hdct.setGiaNiemYet(rs.getDouble("GiaNiemYet"));
                hdct.setGhiChu(rs.getString("GhiChu"));

                list.add(hdct);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public void delete(int maHD) {
        JDBCHelper.update(DELETE_SQL, maHD);
    }

//    public HoaDonNhapChiTiet selectID(int mahdn, String mamh, String tenmh, String DVT, double soluong, double gia) {
//        List<HoaDonNhapChiTiet> list = selectBySql(SELECT_ID_FROM_ALL, mahdn, mamh, tenmh, DVT, soluong, gia);
//        if (list.isEmpty()) {
//            return null;
//        } else {
//            return list.get(0);
//        }
//    }
}
