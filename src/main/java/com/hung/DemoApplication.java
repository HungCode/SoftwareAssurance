package com.hung;

import com.hung.daos.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);
//        Config.getConnection("dbclpm","sa","1");
        System.out.println( new Config().getConnection());

    }
}
