package com.hung.entities;

import java.util.Date;

public class ThongKe {
    private NguoiDongBHXH nguoiDongBHXH;
    private LichSuDongBHXH lichSuDongBHXH;
    private Double tongtiendadong;

    public ThongKe() {

    }

    public ThongKe(NguoiDongBHXH nguoiDongBHXH, LichSuDongBHXH lichSuDongBHXH, Double tongtiendadong) {
        this.nguoiDongBHXH = nguoiDongBHXH;
        this.lichSuDongBHXH = lichSuDongBHXH;
        this.tongtiendadong = tongtiendadong;
    }

    public NguoiDongBHXH getNguoiDongBHXH() {
        return nguoiDongBHXH;
    }

    public void setNguoiDongBHXH(NguoiDongBHXH nguoiDongBHXH) {
        this.nguoiDongBHXH = nguoiDongBHXH;
    }

    public LichSuDongBHXH getLichSuDongBHXH() {
        return lichSuDongBHXH;
    }

    public void setLichSuDongBHXH(LichSuDongBHXH lichSuDongBHXH) {
        this.lichSuDongBHXH = lichSuDongBHXH;
    }

    public Double getTongtiendadong() {
        return tongtiendadong;
    }

    public void setTongtiendadong(Double tongtiendadong) {
        this.tongtiendadong = tongtiendadong;
    }
}
