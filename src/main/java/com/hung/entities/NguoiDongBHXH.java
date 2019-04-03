package com.hung.entities;

import java.util.Date;

public class NguoiDongBHXH {
    private String CMT;
    private String hoten;
    private Date ngaysinh;
    private String gioitinh;
    private String quequan;
    private String email;
    private String dienthoai;
    private Date ngaythamgia;
    private double tongTien;

    public NguoiDongBHXH() {
    }

    public NguoiDongBHXH(String CMT, String hoten, Date ngaysinh, String gioitinh, String quequan, String email, String dienthoai, Date ngaythamgia) {
        this.CMT = CMT;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.email = email;
        this.dienthoai = dienthoai;
        this.ngaythamgia = ngaythamgia;
    }

    public NguoiDongBHXH(String CMT, String hoten, Date ngaysinh, String gioitinh, String quequan, String email, String dienthoai, Date ngaythamgia, double tongtien) {
        this.CMT = CMT;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.email = email;
        this.dienthoai = dienthoai;
        this.ngaythamgia = ngaythamgia;
        this.tongTien = tongtien;
    }

    @Override
    public String toString() {
        return CMT + ";"
                + hoten + ";"
                + ngaysinh + ";"
                + gioitinh + ";"
                + quequan + ";"
                + email + ";"
                + dienthoai + ";"
                + ngaythamgia;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public Date getNgaythamgia() {
        return ngaythamgia;
    }

    public void setNgaythamgia(Date ngaythamgia) {
        this.ngaythamgia = ngaythamgia;
    }
}
