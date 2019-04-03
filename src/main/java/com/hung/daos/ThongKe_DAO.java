package com.hung.daos;

import com.hung.entities.LichSuDongBHXH;
import com.hung.entities.NguoiDongBHXH;
import com.hung.entities.NguoiDongBHXHThang;
import com.hung.entities.ThongKe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;

public class ThongKe_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    public ThongKe_DAO() {
        conn = Config.getConnection();
    }

    public NguoiDongBHXHThang getListThang(String cmt) {
        String sql1 = "SELECT * FROM dbclpm.lichsudongbhxh where CMT = ?";

        NguoiDongBHXH nguoi = new NguoiDongBHXH();
        ArrayList<LichSuDongBHXH> list = new ArrayList<>();

        try {
            ps = conn.prepareStatement(sql1);
            ps.setString(1, cmt);
            rs = ps.executeQuery();
            while (rs.next()) {
                nguoi = new NguoiDongBHXH(
                        rs.getString("CMT"),
                        rs.getString("hoten"),
                        rs.getDate("ngaysinh"),
                        rs.getString("gioitinh"),
                        rs.getString("quequan"),
                        rs.getString("email"),
                        rs.getString("dienthoai"),
                        rs.getDate("ngaythamgia"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql2 = "select * from LichSuDongBHXH where NguoiDongBHXH_CMT = ?";
        try {
            ps = conn.prepareStatement(sql2);
            ps.setString(1, cmt);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new LichSuDongBHXH(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getDouble(5),
                        rs.getDate(4),
                        rs.getString(6)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new NguoiDongBHXHThang(nguoi,list);
    }
}
