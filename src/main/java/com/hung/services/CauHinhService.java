package com.hung.services;

import com.hung.controllers.MucDongBHController;
import com.hung.controllers.VungController;
import com.hung.entities.MucDongBHXH;
import com.hung.entities.Vung;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CauHinhService {
    @PostMapping("/addMucDongBHXH")
    public ResponseEntity addBHXH(@RequestBody MucDongBHXH mucdong){
        MucDongBHController mdcontroller =  new MucDongBHController(mucdong);
        if (mdcontroller.check()){
            mdcontroller.addMDBH();
            System.out.println("da them");
        }
        else{
            System.out.println("thong tin chua hop le");
//            return ResponseEntity.ok(null);
        }
        return ResponseEntity.ok(mdcontroller);
    }

    @PostMapping("/updateVung")
    public ResponseEntity addVung(@RequestBody Vung vung){
        VungController vc = new VungController(vung);
        if(vc.check()){
            vc.addVung();
            System.out.println("da them");
        }
        else {
            System.out.println("thong tin chua hop le");
        }
        return ResponseEntity.ok(vc);
    }
}
