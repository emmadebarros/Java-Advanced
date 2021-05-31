/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalflights;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author emmadebarros
 */
public class Database {

    private static final String dbURL = "jdbc:mysql://localhost:3306/finaldb"; //TODO: DATABASE NAME
    private static final String username = "root";
    private static final String password = "root2021";

    private Connection conn;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(dbURL, username, password);
    }
    
    private static java.sql.Date convertDate(java.util.Date date) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        GlobalDF.format.format(sqlDate);
        return sqlDate;
    }

    public ArrayList<Flight> getAllFlights() throws SQLException {
        ArrayList<Flight> flightList = new ArrayList<>();
        String sql = "SELECT id, onDay, fromCode, toCode, type, passengers FROM flights";
        PreparedStatement statement = conn.prepareStatement(sql);
        //try-with-resources for ResultSet
        try (ResultSet result = statement.executeQuery(sql)) {
            while (result.next()) { // has next row to read
                int id = result.getInt("id");
                Date onDate = result.getDate("onDay");
                String fromCode = result.getString("fromCode");
                String toCode = result.getString("toCode");
                String flightType = result.getString("type");
                int passengers = result.getInt("passengers");
                flightList.add(new Flight(id, onDate, fromCode, toCode, Flight.Type.valueOf(flightType), passengers));
            }
        }
        return flightList;
    }

    public void addFlight(Flight flight) throws SQLException {
        String sql = "INSERT INTO flights VALUES (NULL, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDate(1, convertDate(flight.onDate));
        statement.setString(2, flight.fromCode);
        statement.setString(3, flight.toCode);
        statement.setString(4, flight.type.name());
        statement.setInt(5, flight.passengers);
        statement.executeUpdate(); // for insert, update, delete
        System.out.println("Record inserted");
    }
}
