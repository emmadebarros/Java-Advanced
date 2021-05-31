/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author emmadebarros
 */
public class Database {

    private static final String dbURL = "jdbc:mysql://localhost:3306/day11library";
    private static final String username = "root";
    private static final String password = "root2021";

    private Connection conn;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(dbURL, username, password);
    }

    public ArrayList<Book> getAllBooks() throws SQLException {
        ArrayList<Book> bookList = new ArrayList<>();
        String sql = "SELECT id, isbn, titleAndAuthor FROM books";//we don't fetch the blobs here because take up too much ram
        PreparedStatement statement = conn.prepareStatement(sql);
        // it is a good practice to use try-with-resources for ResultSet so it is freed up as soon as possible
        try (ResultSet result = statement.executeQuery(sql)) {
            while (result.next()) { // has next row to read
                int id = result.getInt("id");
                String isbn = result.getString("isbn");
                String titleAndAuthor = result.getString("titleAndAuthor");
                //we don't fetch the blobs here because take up too much ram
                //TODO: handle image
                // System.out.printf("%d: %s is %d y/o\n", id, name, age);
                bookList.add(new Book(id, isbn, titleAndAuthor, null));//null because of image
            }
        }
        return bookList;
    }
}
