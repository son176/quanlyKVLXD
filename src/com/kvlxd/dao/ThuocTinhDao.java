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

/**
 *
 * @author Admin
 */
public class ThuocTinhDao extends kvlxdDAO<ThuocTinh, Integer> {

    String INSERT_SQL = "insert into ThuocTinh(TenTT,MoTa)  values (?,?)";
    String UPDATE_SQL = "update ThuocTinh set TenTT=?,Mota=? where MaTT=?";
    String DELETE_SQL = "delete from ThuocTinh where MaTT = ?";
    String SELECT_ALL_SQL = "select * from ThuocTinh";
    String SELECT_BY_ID_SQL = "select * from ThuocTinh where MaTT = ?";
    String SELECT_ALL_TENTT = "select TenTT from ThuocTinh";
    String SELECT_MATT_FROM_TENTT = "select * from ThuocTinh Where TenTT=?";
    
    

    
    public ThuocTinh selectMaTT(String tentt) {
        List<ThuocTinh> list = selectBySql(SELECT_MATT_FROM_TENTT, tentt);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<String> AllTenTT() {
        try {
            List<String> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.query(SELECT_ALL_TENTT);
            while (rs.next()) {
                list.add(rs.getString("TenTT"));
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }

    @Override
    public void insert(ThuocTinh entity) {

        JDBCHelper.update(INSERT_SQL, entity.getTenTT(), entity.getMota());

    }

    @Override
    public void update(ThuocTinh entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenTT(), entity.getMota(), entity.getMaTT());
    }

    @Override
    public List<ThuocTinh> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ThuocTinh> selectBySql(String sql, Object... args) {
        List<ThuocTinh> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ThuocTinh tt = new ThuocTinh();
                tt.setMaTT(rs.getInt("MaTT"));
                tt.setTenTT(rs.getString("TenTT"));
                tt.setMota(rs.getString("Mota"));
                list.add(tt);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void delete(Integer key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public ThuocTinh selectById(Integer key) {
        List<ThuocTinh> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

}
