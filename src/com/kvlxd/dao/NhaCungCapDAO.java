/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.dao;

import com.kvlxd.entity.NhaCungCap;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhaCungCapDAO extends kvlxdDAO<NhaCungCap, String> {

    String INSERT_SQL = "insert into NhaCungCap values (?,?,?,?)";
    String UPDATE_SQL = "update NhaCungCap set TenNCC = ?, DiaChi =?, SDT = ? where MaNCC=?";
    String DELETE_SQL = "delete from NhaCungCap where MaNCC = ?";
    String SELECT_ALL_SQL = "select * from NhaCungCap";
    String SELECT_BY_ID_SQL = "select * from NhaCungCap where MaNCC = ?";
    String SELECT_ALL_NCC="select * from NhaCungCap WHERE TenNCC=?";
    @Override
    public void insert(NhaCungCap entity) {
     JDBCHelper.update(INSERT_SQL, entity.getMaNCC(),entity.getTenNCC(),entity.getDiaChi(),entity.getSDT());
    }

    @Override
    public void update(NhaCungCap entity) {
        JDBCHelper.update(UPDATE_SQL,entity.getTenNCC(),entity.getDiaChi(),entity.getSDT(), entity.getMaNCC());
    }

    @Override
    public void delete(String key) {
       JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<NhaCungCap> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }
   

    @Override
    public NhaCungCap selectById(String key) {
        List<NhaCungCap> list=selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhaCungCap> selectBySql(String sql, Object... args) {
        List<NhaCungCap> list=new ArrayList<>();
        try {
            ResultSet rs=JDBCHelper.query(sql, args);
            while(rs.next()){
                NhaCungCap ncc=new NhaCungCap();
                ncc.setMaNCC(rs.getString("MaNCC"));
                ncc.setTenNCC(rs.getString("TenNCC"));
                ncc.setDiaChi(rs.getString("DiaChi"));
                ncc.setSDT(rs.getString("SDT"));
                list.add(ncc);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
public NhaCungCap selectBySDTNCC(String id) {
        List<NhaCungCap> list=selectBySql(SELECT_ALL_NCC, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
