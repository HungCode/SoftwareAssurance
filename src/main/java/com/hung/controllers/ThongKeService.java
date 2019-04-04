package com.hung.controllers;

import com.hung.daos.MucDongBHXH_DAO;
import com.hung.daos.ThongKe_DAO;
import com.hung.entities.NguoiDongBHXH;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThongKeService {
    MucDongBHXH_DAO mucDongBHXH_dao = new MucDongBHXH_DAO();

    ThongKe_DAO thongke = new ThongKe_DAO();

    @PostMapping("/thongKeThang")
    public ResponseEntity thongKeThang(@RequestBody String cmt) {
        return null;
    }

    @GetMapping("/getList")
    public ResponseEntity getList() {
        return ResponseEntity.ok(thongke.getList());
    }
}
