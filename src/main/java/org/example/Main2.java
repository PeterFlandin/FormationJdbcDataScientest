package org.example;

import Entity.Livre;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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


            List<Livre> livreList = new ArrayList<Livre>();


            while (resultSet.next()) {
                Livre livre1 = new Livre();
                livre1.setId_livre(resultSet.getInt("id_livre"));
                livre1.setPrix(resultSet.getDouble("prix"));
                livre1.setTitre(resultSet.getString("titre"));
                livreList.add(livre1);

                livreList.stream().forEach(System.out::println);
            }


        } catch (SQLException e) {
            System.out.println("error : " + e.getMessage());
        }

    }
}



