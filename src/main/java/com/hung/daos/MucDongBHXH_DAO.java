package com.hung.daos;

import com.hung.entities.MucDongBHXH;
import com.hung.entities.NguoiDongBHXH;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class MucDongBHXH_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    public MucDongBHXH_DAO() {
        conn = new Config().getConnection();
    }

    public MucDongBHXH getMucDongBHXH(String ID) {
        MucDongBHXH m = null;
        String sql = "select * from MucDong where mucDongID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String maapdung = rs.getString("maapdung");//ld  trong nuoc, nuoc ngoai, tu nguyen
                String mota = rs.getString("mota");
                Double huutri_tutuat = rs.getDouble("huutru_tutuat");
                Double omdau_thaisan = rs.getDouble("omdau_thaisan");
                Double tainanLD_nghenghiep = rs.getDouble("tainanLD_nghenghiep");
                Double yte = rs.getDouble("yte");
                Date ngaybatdau = rs.getDate("ngaybatdau");
                String trangthai = rs.getString("trangthai");
                m = new MucDongBHXH(maapdung, mota, huutri_tutuat,
                        omdau_thaisan, tainanLD_nghenghiep, yte, ngaybatdau, trangthai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return m;
    }

    public boolean insert(MucDongBHXH md) {
        boolean check =false;
        String sql = "insert into MucDongBHXH values(?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, md.getMaapdung());
            ps.setString(2, md.getMota());
            ps.setDouble(3, md.getHuutri_tutuat());
            ps.setDouble(4, md.getOmdau_thaisan());
            ps.setDouble(5, md.getTainanLD_nghenghiep());
            ps.setDouble(6, md.getYte());
            ps.setDate(7, (java.sql.Date) md.getNgaybatdau());
            ps.setString(8, md.getTrangThai());
            check = ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    public ArrayList<NguoiDongBHXH> getList() {
        ArrayList<NguoiDongBHXH> list = new ArrayList<>();
        String sql = "select * from NguoiDongBHXH";
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                NguoiDongBHXH nguoiDongBHXH = new NguoiDongBHXH(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8),
                        rs.getDouble(9));

                list.add(nguoiDongBHXH);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
