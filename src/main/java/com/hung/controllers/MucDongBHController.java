package com.hung.controllers;

import com.hung.daos.MucDongBHXH_DAO;
import com.hung.entities.MucDongBHXH;

public class MucDongBHController {
    private MucDongBHXH md;

    public MucDongBHController() {
    }

    public MucDongBHController(MucDongBHXH md) {
        this.md = md;
    }

    public boolean check() {
        if (!md.getMaapdung().equals("")
                && !md.getMota().equals("")
                && !md.getNgaybatdau().equals("")
                && !md.getTrangThai().equals("")
                && !md.getHuutri_tutuat().equals("")
                && !md.getOmdau_thaisan().equals("")
                && !md.getTainanLD_nghenghiep().equals("")
                && !md.getYte().equals("")
        )
            return true;
        return false;
    }

    public void addMDBH() {
        new MucDongBHXH_DAO().insert(md);
    }
}
