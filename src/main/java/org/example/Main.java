package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String url=  "jdbc:mysql://localhost:3306/monlivre?allowPublicKeyRetrieval=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris";
    private static final String password= "246810";
    private static final String username = "app_test";




    public static void main(String[] args) throws SQLException{


        Connection conn = DriverManager.getConnection(url, username, password);


        System.out.println("connecté à la base de donnée !!!");
    }



}