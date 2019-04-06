package com.hung.daos;

import com.hung.entities.LichSuDongBHXH;
import com.hung.entities.NguoiDongBHXH;
import com.hung.entities.NguoiDongBH_LichSu;
import org.testng.Assert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ThongKe_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    public ThongKe_DAO() {
        conn = Config.getConnection();
    }

    public ArrayList<NguoiDongBHXH> getListBHXH() {
        ArrayList<NguoiDongBHXH> list = new ArrayList<>();
        String sql = "select * from NguoiDongBHXH";
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            boolean check = false;
            ResultSet rs2 = rs;
            Assert.assertEquals(true,rs2.next());

            while (rs.next()) {
                NguoiDongBHXH nguoiDongBHXH = new NguoiDongBHXH(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        getTongTien(rs.getString(1)));

                list.add(nguoiDongBHXH);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public NguoiDongBH_LichSu getListBHXH_Detail(String cmt) {
        String sql1 = "SELECT * FROM dbclpm.nguoidongbhxh where CMT = ?";

        NguoiDongBHXH nguoi = new NguoiDongBHXH();
        ArrayList<LichSuDongBHXH> list = getLichSu(cmt);

        try {
            ps = conn.prepareStatement(sql1);
            ps.setString(1, cmt);
            rs = ps.executeQuery();

            boolean check = false;
            ResultSet rs2 = rs;
            Assert.assertEquals(true,rs2.next());

            while (rs.next()) {
                nguoi = new NguoiDongBHXH(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new NguoiDongBH_LichSu(nguoi, list);
    }

    public ArrayList<LichSuDongBHXH> getLichSu(String cmt) {
        String sql2 = "select * from LichSuDongBHXH where NguoiDongBHXH_CMT = ?";
        ArrayList<LichSuDongBHXH> list = new ArrayList<>();

        try {
            ps = conn.prepareStatement(sql2);
            ps.setString(1, cmt);
            rs = ps.executeQuery();

            boolean check = false;
            ResultSet rs2 = rs;
            Assert.assertEquals(true,rs2.next());

            while (rs.next()) {
                list.add(new LichSuDongBHXH(
                        rs.getString("NguoiDongBHXH_CMT"),
                        rs.getInt("thang"),
                        rs.getInt("nam"),
                        rs.getDouble("sotienphaidong"),
                        rs.getString("ngaydongtien"),
                        rs.getString("trangthai")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Double getTongTien(String cmt) {

        Double tong = 0.0;
        try {
            String sql2 = "SELECT sum(sotienphaidong) as tongtien from lichsudongbhxh where nguoidongbhxh_cmt = ? and trangthai = ?";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps2.setString(1, cmt);
            ps2.setString(2, "true");
            ResultSet rs2 = ps2.executeQuery();

            boolean check = false;
            ResultSet rs3 = rs;
            Assert.assertEquals(true,rs3.next());

            while (rs2.next()) {
                tong += rs2.getDouble("tongtien");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tong;
    }
}
