package org.example;

import java.sql.*;

public class Main2 {

    private static final String url=  "jdbc:mysql://localhost:3306/monlivre?allowPublicKeyRetrieval=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris";
    private static final String password= "246810";
    private static final String username = "app_test";

private static final String Query_get_Livre = "SELECT * FROM livre";


    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("connecté à la base de donnée !!!");
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(Query_get_Livre);


            while (resultSet.next()) {
                System.out.printf("| %02d | %-10s | %8.2f | %n |", resultSet.getInt("id_livre"), resultSet.getString("titre"), resultSet.getFloat("prix"));
            }


        } catch (SQLException e) {
            System.out.println("error : " + e.getMessage());
        }


    }
}



