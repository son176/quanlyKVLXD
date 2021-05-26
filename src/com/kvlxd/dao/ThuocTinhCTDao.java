/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.ThuocTinh;
import com.kvlxd.entity.ThuocTinhChiTiet;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.RuntimeErrorException;

/**
 *
 * @author Admin
 */
public class ThuocTinhCTDao extends kvlxdDAO<ThuocTinhChiTiet, Integer> {

    String INSERT_SQL = "insert into ThuocTinhCT  values (?,?,?)";
    String UPDATE_SQL = "update ThuocTinhCT set GiaTri=? where MaMH=? and MaTT=?";
    String DELETE_SQL = "delete from ThuocTinhCT where MaTTCT = ?";
    String DELETE_TTCT_SQL = "delete from ThuocTinhCT where MaMH=? and MaTT=?";
    String SELECT_ALL_SQL = "select * from ThuocTinhCT";
    String SELECT_BY_ID_SQL = "select * from ThuocTinhCT where MaTT = ?";
    String SELECT_ALL_MAMH = "Select distinct MaMH from ThuocTinhCT";
    String SELECT_BY_MAMH = "select * from ThuocTinhCT where MaMH =?";
    String SELECT_TENCT = "select distinct TenTT,GiaTri from ThuocTinh join ThuocTinhCT on ThuocTinh.MaTT=ThuocTinhCT.MaTT where ThuocTinhCT.MaMH=?";

    public void deleteTTCT(String key, int kw) {
        JDBCHelper.update(DELETE_TTCT_SQL, key,kw);
    }

    public List<String[]> selectbygt(String mamh) {
        try {
            List<String[]> list = new ArrayList<String[]>();
            ResultSet rs = JDBCHelper.query(SELECT_TENCT, mamh);
            while (rs.next()) {
                String[] row = new String[]{rs.getString("TenTT"), rs.getString("GiaTri")};
                list.add(row);
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }

    public List<String> AllMaMH() {
        try {
            List<String> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.query(SELECT_ALL_MAMH);
            while (rs.next()) {
                list.add(rs.getString("MaMH"));
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }

    public List<ThuocTinhChiTiet> TTCTTheoMaMH(String mamh) {
        try {
            return selectBySql(SELECT_BY_MAMH, mamh);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void insert(ThuocTinhChiTiet entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaTT(), entity.getMaMH(), entity.getGiaTri());
    }

    @Override
    public void update(ThuocTinhChiTiet entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getGiaTri(), entity.getMaMH(),entity.getMaTT());
    }

    @Override
    public void delete(Integer key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<ThuocTinhChiTiet> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ThuocTinhChiTiet selectById(Integer key) {
        List<ThuocTinhChiTiet> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ThuocTinhChiTiet> selectBySql(String sql, Object... args) {
        List<ThuocTinhChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ThuocTinhChiTiet tt = new ThuocTinhChiTiet();
                tt.setMaTTCT(rs.getInt("MaTTCT"));
                tt.setMaTT(rs.getInt("MaTT"));
                tt.setMaMH(rs.getString("MaMH"));
                tt.setGiaTri(rs.getString("GiaTri"));
                list.add(tt);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }

}
