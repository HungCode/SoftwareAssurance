package com.hung.controllers;

import com.hung.daos.Vung_DAO;
import com.hung.entities.Vung;

public class VungController {
    Vung vung;

    public VungController() {
    }

    public VungController(Vung vung) {
        this.vung = vung;
    }

    public boolean check() {
        if (!vung.getXa_phuong().equals("")
                && !vung.getQuan_huyen().equals("")
                && !vung.getTinh_tp().equals("")
                && !(vung.getKhuvuc() + "").equals("")
                && !vung.getSotiendongbh().equals("")
                && !(vung.getMucvuotquagioihan() + "").equals(""))
            return true;
        return false;
    }
    public void addVung(){
        new Vung_DAO().insert(vung);
    }
}
