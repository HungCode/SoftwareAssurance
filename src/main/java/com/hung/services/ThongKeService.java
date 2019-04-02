package com.hung.services;

import com.hung.daos.MucDongBHXH_DAO;
import com.hung.entities.NguoiDongBHXH;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThongKeService {
    MucDongBHXH_DAO mucDongBHXH_dao = new MucDongBHXH_DAO();

    @PostMapping("/thongKeThang")
    public ResponseEntity thongKeThang(@RequestBody Object o) {
        return null;
    }

    @GetMapping("/getList")
    public ResponseEntity getList() {

        return ResponseEntity.ok(mucDongBHXH_dao.getList());
    }
}
