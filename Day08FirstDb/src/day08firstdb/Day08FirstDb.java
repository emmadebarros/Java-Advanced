/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//tutorial : https://www.codejava.net/java-se/jdbc/jdbc-tutorial-sql-insert-select-update-and-delete-examples#ConnectToDatabase (teacher changed a few things)
package day08firstdb;

import java.sql.*;
import java.util.Random;

/**
 *
 * @author emmadebarros
 */
public class Day08FirstDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String dbURL = "jdbc:mysql://localhost:3306/day08people";
        String username = "root";
        String password = "root2021";

        Random random = new Random();

        //Open database connection
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(dbURL, username, password); //line that opens the connection
            System.out.println("Connected"); //verif

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(1); //fatal error
        }

        //Insert
        try {
            String sql = "INSERT INTO people VALUES (NULL, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Bill " + random.nextInt(30)); //name (no id because AI)
            statement.setString(2, "" + random.nextInt(100));//age
            statement.executeUpdate(); // for insert, update, delete (anything that modifies the database but doesn't return any info back)
            System.out.println("Record Inserted");
        } catch (SQLException exc) {
            exc.printStackTrace(); //no fatal error if script is wrong so no exit
        }
        
        System.out.println("==========================================");
        
        
        //Select
        try {
            String sql = "SELECT * FROM people"; // NEVER + id (prone to sql injections) - always use preparedStatement
            PreparedStatement statement = conn.prepareStatement(sql);
            //it is a good practice to use try-with-resources for ResultSet so it is freed up as soon as possible (because of BLOB's that could take up all the ram)
            try (ResultSet result = statement.executeQuery(sql)) { //executeQuery is to retrieve data, unlike executeUpdate on the statement
                while (result.next()) { // has next row to read
                    int id = result.getInt("id");
                    String name = result.getString("name");
                    int age = result.getInt("age");
                    System.out.printf("%d: %s is %d y/o\n", id, name, age);
                }
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        
        System.out.println("==========================================");
        

        //Update
        try {
            int id = random.nextInt(10); // we don't have 10 records yet so it might fail
            int newAge = random.nextInt(100) + 100; // to make sure it was updated
            String sql = "UPDATE people SET age=? WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, newAge);
            statement.setInt(2, id);
            statement.executeUpdate();
            System.out.println("Record updated id= " + id);
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        
        System.out.println("==========================================");
        

        //Delete
        try {
            int id = random.nextInt(10); //never do this in real life oh god lol
            String sql = "DELETE FROM people WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Record deleted id= " + id);
        } catch (SQLException exc) {
            exc.printStackTrace();
        }

    }

}
