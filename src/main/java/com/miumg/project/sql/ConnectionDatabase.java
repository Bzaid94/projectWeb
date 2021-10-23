package com.miumg.project.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    public Connection getConnection() {
        Connection connection = null;

        String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "database=Universidad;" + "useSSL=false;" + "user=sa;" + "password=reallyStrongPwd123;" +
                                "encrypt=false;" + "trustServerCertificate=false;" + "loginTimeout=30;";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Connection success");

            return connection;

        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e.getClass().getSimpleName() + "_" + e.getMessage());
            return null;
        }
    }
}