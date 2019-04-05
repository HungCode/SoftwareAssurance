package com.hung.controllers;

import com.hung.daos.MucDongBHXH_DAO;
import com.hung.daos.Vung_DAO;
import com.hung.entities.MucDongBHXH;
import com.hung.entities.Vung;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.testng.Assert;

@RestController
public class CauHinhController {
    MucDongBHXH_DAO mucdong_dao = new MucDongBHXH_DAO();
    Vung_DAO vung_dao = new Vung_DAO();

    @PostMapping("/addMucDongBHXH")
    public ResponseEntity addBHXH(@RequestBody MucDongBHXH md) {
        Assert.assertNotNull(md.getMamucdong());
        Assert.assertNotNull(md.getMota());
        Assert.assertNotNull(md.getHuutri_tutuat());
        Assert.assertNotNull(md.getOmdau_thaisan());
        Assert.assertNotNull(md.getTainanLD_nghenghiep());
        Assert.assertNotNull(md.getYte());
        Assert.assertNotNull(md.getNgaybatdau());
        Assert.assertNotNull(md.getTrangthai());
        if (!md.getMamucdong().equals("")
                && !md.getMota().equals("")
                && !md.getHuutri_tutuat().equals("")
                && !md.getOmdau_thaisan().equals("")
                && !md.getTainanLD_nghenghiep().equals("")
                && !md.getYte().equals("")
                && !md.getNgaybatdau().equals("")
                && !md.getTrangthai().equals("")
        ) {
            mucdong_dao.disableMucDong(md);
            mucdong_dao.insert(md);
        } else {
            System.out.println("thong tin chua hop le");
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.ok(md);
    }

    @PostMapping("/updateVung")
    public ResponseEntity addVung(@RequestBody Vung vung) {
        Assert.assertNotNull(vung.getMavung());
        Assert.assertNotNull(vung.getXa_phuong());
        Assert.assertNotNull(vung.getQuan_huyen());
        Assert.assertNotNull(vung.getTinh_tp());
        Assert.assertNotNull(vung.getKhuvuc());
        Assert.assertNotNull(vung.getMucvuotquagioihan());
        Assert.assertNotNull(vung.getSotiendongbh());
        Assert.assertNotNull(vung.getNgaybatdau());
        Assert.assertNotNull(vung.getTrangthai());

        if (!vung.getMavung().equals("")
                && !vung.getXa_phuong().equals("")
                && !vung.getQuan_huyen().equals("")
                && !vung.getTinh_tp().equals("")
                && !(vung.getKhuvuc() + "").equals("")
                && !(vung.getSotiendongbh() + "").equals("")
                && !(vung.getMucvuotquagioihan() + "").equals("")
                && !vung.getNgaybatdau().equals("")
                && !vung.getTrangthai().equals("")
        ) {
            vung_dao.disableVung(vung);
            vung_dao.insert(vung);
        } else return ResponseEntity.ok(null);

        return ResponseEntity.ok(vung);
    }
}
