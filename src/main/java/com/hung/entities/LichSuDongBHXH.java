package com.hung.entities;

import java.util.Date;

public class LichSuDongBHXH {
    private String NguoiDongBHXH_CMT;
    private int thang;
    private int nam;
    private Double sotienphaidong;
    private Date ngaydong;
    private String trangthai;

    public LichSuDongBHXH(String nguoiDongBHXH_CMT, int thang, int nam, Double sotienphaidong, Date ngaydong, String trangthai) {
        NguoiDongBHXH_CMT = nguoiDongBHXH_CMT;
        this.thang = thang;
        this.nam = nam;
        this.sotienphaidong = sotienphaidong;
        this.ngaydong = ngaydong;
        this.trangthai = trangthai;
    }

    public LichSuDongBHXH() {
    }

    public LichSuDongBHXH(String nguoiDongBHXH_CMT, int thang, int nam, Double sotienphaidong, Date ngaydong) {
        NguoiDongBHXH_CMT = nguoiDongBHXH_CMT;
        this.thang = thang;
        this.nam = nam;
        this.sotienphaidong = sotienphaidong;
        this.ngaydong = ngaydong;
    }

    public String getNguoiDongBHXH_CMT() {
        return NguoiDongBHXH_CMT;
    }

    public void setNguoiDongBHXH_CMT(String nguoiDongBHXH_CMT) {
        NguoiDongBHXH_CMT = nguoiDongBHXH_CMT;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public Double getSotienphaidong() {
        return sotienphaidong;
    }

    public void setSotienphaidong(Double sotienphaidong) {
        this.sotienphaidong = sotienphaidong;
    }

    public Date getNgaydong() {
        return ngaydong;
    }

    public void setNgaydong(Date ngaydong) {
        this.ngaydong = ngaydong;
    }

    @Override
    public String toString() {
        return NguoiDongBHXH_CMT + ";"
                + thang + ";"
                + nam + ";"
                + sotienphaidong + ";"
                + ngaydong;
    }
}
