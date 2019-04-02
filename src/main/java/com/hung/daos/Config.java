package com.hung.daos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {
    public Connection connection;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbclpm?useUnicode=yes&characterEncoding=UTF-8&autoReconnect=true&useSSL=false",
                    "root", "0210");
            System.out.println("connected!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }


}
