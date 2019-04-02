package com.hung.daos;

import com.hung.entities.ThongKe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class ThongKe_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    public ThongKe_DAO() {
        conn = new Config().getConnection();
    }

    public ArrayList<ThongKe> getListThang(int thangbd, int nambd, int thangkt, int namkt) {
        String sql = "select" +
                "user.CMT,user.hoten,user.ngaysinh,user.gioitinh,user.quequan,user.email,user.dienthoai,user.ngaythamgia,ls.thang,ls.nam,ls.sotienphaidong,ls.ngaydongtien,ls.trangthai" +
                " from" +
                " NguoiDongBHXH as user,LichSuDongBHXH as ls, NguoiDongBHXH_MucDongBHXH as map " +
                "where " +
                "user.CMT = map.NguoiDongBHXHCMT and map.MucDongBHXH and ls.ID and ls.thang>? and ls.nam=?";

        String sql2 = "select"
                + "user.CMT,user.hoten,user.ngaysinh,user.gioitinh,user.quequan,user.email,user.dienthoai,user.ngaythamgia,ls.thang,ls.nam,ls.sotienphaidong,ls.ngaydongtien,ls.trangthai" +
                " from" +
                " NguoiDongBHXH as user,LichSuDongBHXH as ls, NguoiDongBHXH_MucDongBHXH as map " +
                "where " +
                "user.CMT = map.NguoiDongBHXHCMT and map.MucDongBHXH and ls.ID and ls.thang<? and ls.nam=?";
        String sql3 = "select" +
                "user.CMT,user.hoten,user.ngaysinh,user.gioitinh,user.quequan,user.email,user.dienthoai,user.ngaythamgia,ls.thang,ls.nam,ls.sotienphaidong,ls.ngaydongtien,ls.trangthai" +
                " from" +
                " NguoiDongBHXH as user,LichSuDongBHXH as ls, NguoiDongBHXH_MucDongBHXH as map " +
                "where " +
                "user.CMT = map.NguoiDongBHXHCMT and map.MucDongBHXH and ls.ID and ls.nam<? and nam>?";





        return null;
    }
}
