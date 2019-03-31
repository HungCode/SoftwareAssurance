package com.example.demo;

import com.example.demo.dao.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);
//        Config.getConnection("dbclpm","sa","1");
        System.out.println( Config.getConnection());

    }
}
