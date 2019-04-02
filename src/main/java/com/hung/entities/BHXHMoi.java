package com.hung.entities;

public class BHXHMoi {
    private NguoiDongBHXH nguoiDongBHXH;
    private CongViec congViec;
    private Vung vung;

    public BHXHMoi() {
    }

    public BHXHMoi(NguoiDongBHXH nguoiDongBHXH, CongViec congViec, Vung vung) {
        this.nguoiDongBHXH = nguoiDongBHXH;
        this.congViec = congViec;
        this.vung = vung;
    }
}
