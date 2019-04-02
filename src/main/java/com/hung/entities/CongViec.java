package com.hung.entities;

import java.util.Date;

public class CongViec {
    private String NguoiDongBHXH_CMT;
    private String maconty;
    private String tenconty;
    private String diachi;
    private String chucvu;
    private Date ngaybatdau;
    private Date ngayketthuc;
    private Double luong;

    public CongViec() {
    }

    public CongViec(String nguoiDongBHXH_CMT, String maconty, String tenconty, String diachi, String chucvu, Date ngaybatdau, Date ngayketthuc, Double luong) {
        NguoiDongBHXH_CMT = nguoiDongBHXH_CMT;
        this.maconty = maconty;
        this.tenconty = tenconty;
        this.diachi = diachi;
        this.chucvu = chucvu;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
        this.luong = luong;
    }

    public String getNguoiDongBHXH_CMT() {
        return NguoiDongBHXH_CMT;
    }

    public void setNguoiDongBHXH_CMT(String nguoiDongBHXH_CMT) {
        NguoiDongBHXH_CMT = nguoiDongBHXH_CMT;
    }

    public String getMaconty() {
        return maconty;
    }

    public void setMaconty(String maconty) {
        this.maconty = maconty;
    }

    public String getTenconty() {
        return tenconty;
    }

    public void setTenconty(String tenconty) {
        this.tenconty = tenconty;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public Date getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return NguoiDongBHXH_CMT + ";"
                + maconty + ";"
                + tenconty + ";"
                + diachi + ";"
                + chucvu + ";"
                + ngaybatdau + ";"
                + ngayketthuc + ";"
                + luong;
    }
}
