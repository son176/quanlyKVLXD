
package com.kvlxd.dao;

import com.kvlxd.entity.NhanVien;
import com.kvlxd.util.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class NhanVienDAO extends kvlxdDAO<NhanVien, String> {

    String INSERT_SQL = "insert into NhanVien (MaNV,TenNV,NgaySinh,SDT,DiaChi,VaiTro,MatKhau,Hinh) values (?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update NhanVien set TenNV=?,NgaySinh=?,SDT=?,DiaChi=?, VaiTro = ?,MatKhau=?,Hinh=? where MaNV=?";
    String DELETE_SQL = "delete from NhanVien where MaNV = ?";
    String SELECT_ALL_SQL = "select * from NhanVien";
    String SELECT_BY_ID_SQL = "select * from NhanVien where MaNV = ?";
    String SELECT_TENNV="SELECT * FROM NhanVien WHERE MaNV=?"; 

    @Override
    public void insert(NhanVien entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaNV(), entity.getTenNV(), entity.getNgaySinh(), entity.getSDT(), entity.getDiaChi(),
                entity.isVaiTro(), entity.getMatKhau(), entity.getHinh()
        );
    }

    @Override
    public void update(NhanVien entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenNV(), entity.getNgaySinh(), entity.getSDT(), entity.getDiaChi(),
                entity.isVaiTro(), entity.getMatKhau(),entity.getHinh(), entity.getMaNV()
        );
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setSDT(rs.getString("SDT"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setHinh(rs.getString("Hinh"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
     public NhanVien selectByTenNV(String manv) {
        return this.selectBySql(SELECT_TENNV, manv).get(0);  
    }

}
