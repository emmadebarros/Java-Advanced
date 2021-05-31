/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//I put pictures in the trash - retry with new pictures
package day10students;

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

    private static final String dbURL = "jdbc:mysql://localhost:3306/day10students";
    private static final String username = "root";
    private static final String password = "root2021";

    private Connection conn;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(dbURL, username, password);
    }

    public ArrayList<Student> getAllStudents() throws SQLException {
        ArrayList<Student> studentList = new ArrayList<>();
        String sql = "SELECT id, name FROM students";//we don't fetch the blobs here because take up too much ram
        PreparedStatement statement = conn.prepareStatement(sql);
        // it is a good practice to use try-with-resources for ResultSet so it is freed up as soon as possible
        try (ResultSet result = statement.executeQuery(sql)) {
            while (result.next()) { // has next row to read
                int id = result.getInt("id");
                String name = result.getString("name");
                //we don't fetch the blobs here because take up too much ram
                //TODO: handle image
                // System.out.printf("%d: %s is %d y/o\n", id, name, age);
                studentList.add(new Student(id, name, null));//null because of image
            }
        }
        return studentList;
    }

//Fetch one record, including the BLOB
    Student getStudentById(int id) throws SQLException {
        //Result set get the result of the SQL query
        PreparedStatement stmtSelect = conn.prepareStatement("SELECT * FROM students WHERE id=?");
        stmtSelect.setInt(1, id);
        try (ResultSet resultSet = stmtSelect.executeQuery()) {
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                byte[] image = resultSet.getBytes("image");
                return new Student(id, name, image);
            } else {
                throw new SQLException("Record not found");
            }
        }
    }

    public void addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO students VALUES (NULL, ?, ?)";//when testing at first set the blob (last one) to null because image/ Null because AI in db
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, student.name);
        statement.setBytes(2, student.image);
        //TODO: handle image
        statement.executeUpdate(); // for insert, update, delete
        System.out.println("Record inserted");
    }

    public void updateStudent(Student student) throws SQLException {

        String sql = "UPDATE students SET name=?, image=? WHERE id=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, student.name);
        statement.setBytes(2, student.image);
        statement.setInt(3, student.id);//you do not tupdate the id NEVER. It is assigned to the record by auto-increment
        statement.executeUpdate();
        System.out.println("Record updated id= " + student.id);
    }
    
    

    public void deleteStudent(Student student) throws SQLException {

        try {
            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, student.id);
            statement.executeUpdate();
            //System.out.println("Record deleted id= " + person.id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }// end try block
    }

}
