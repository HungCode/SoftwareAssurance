package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {
    public static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbclpm?useUnicode=yes&characterEncoding=UTF-8&autoReconnect=true&useSSL=false",
                    "hung", "0210");
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }


}
