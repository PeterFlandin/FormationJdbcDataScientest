package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException{



        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "246810");


        System.out.println("connecté à la base de donnée !!!");
    }



}