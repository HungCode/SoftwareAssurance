package com.hung.entities;

import java.util.ArrayList;

public class NguoiDongBHXHThang {
    private NguoiDongBHXH nguoi;
    private ArrayList<LichSuDongBHXH> list;

    public NguoiDongBHXH getNguoi() {
        return nguoi;
    }

    public void setNguoi(NguoiDongBHXH nguoi) {
        this.nguoi = nguoi;
    }

    public ArrayList<LichSuDongBHXH> getList() {
        return list;
    }

    public void setList(ArrayList<LichSuDongBHXH> list) {
        this.list = list;
    }

    public NguoiDongBHXHThang() {
    }

    public NguoiDongBHXHThang(NguoiDongBHXH nguoi, ArrayList<LichSuDongBHXH> list) {
        this.nguoi = nguoi;
        this.list = list;
    }
}
