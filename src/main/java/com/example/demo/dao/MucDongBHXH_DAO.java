package com.example.demo.dao;

import com.example.demo.entities.MucDongBHXH;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MucDongBHXH_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    MucDongBHXH_DAO(){
        conn = Config.getConnection();
    }

    public MucDongBHXH getMucDongBHXH(String ID){
        MucDongBHXH m = null;
        String sql = "select * from MucDong where mucDongID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,ID);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                String type = rs.getString("type");//ld  trong nuoc, nuoc ngoai, tu nguyen
                Double huutri_tutuat = rs.getDouble("huutru_tutuat");
                Double omdau_thaisan = rs.getDouble("omdau_thaisan");
                Double tainanLD_nghenghiep = rs.getDouble("tainanLD_nghenghiep");
                Double yte = rs.getDouble("yte");
                Date ngaybatdau = rs.getDate("ngaybatdau");
                Date ngayketthuc = rs.getDate("ngayketthuc");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return m;
    }
}
