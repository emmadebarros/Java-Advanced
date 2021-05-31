package day09friendsdb;

//in here we throw the exceptions (like getters and setters) because this is the data layer so we cannot interact with the user here (no msg box, etc)
//we don't handle the exception here
//the only thing we can do is either return a value is everything is okay or throw an excpetion if it is not
/**
 *
 * @author emmadebarros
 */
import java.sql.*;
import java.util.ArrayList;

public class Database {

    private static final String dbURL = "jdbc:mysql://localhost:3306/day08people";
    private static final String username = "root";
    private static final String password = "root2021";

    private Connection conn;

    /* 
    Connection is private because we don't want anything from outside of this class to access the connection to the database.
    The idea is that this class encapsulates the connection to the database and allows to perform only those operations that this class implements
     */
    public Database() throws SQLException {
        conn = DriverManager.getConnection(dbURL, username, password); //line that opens the connection;
    }

    public ArrayList<Person> getAllPeople() throws SQLException {
        ArrayList<Person> list = new ArrayList<>();

        String sql = "SELECT * FROM people"; // NEVER + id (prone to sql injections) - always use preparedStatement
        PreparedStatement statement = conn.prepareStatement(sql);
        //it is a good practice to use try-with-resources for ResultSet so it is freed up as soon as possible (because of BLOB's that could take up all the ram)
        try (ResultSet result = statement.executeQuery(sql)) { //executeQuery is to retrieve data, unlike executeUpdate on the statement
            while (result.next()) { // has next row to read
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                //System.out.printf("%d: %s is %d y/o\n", id, name, age);
                list.add(new Person(id, name, age));
            }
        }

        return list;

    }

    public void addPerson(Person person) throws SQLException {

        String sql = "INSERT INTO people VALUES (NULL, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, person.name); //name (no id because AI)
        statement.setInt(2, person.age);//age
        statement.executeUpdate(); // for insert, update, delete (anything that modifies the database but doesn't return any info back)
        System.out.println("Record Inserted");

    }

    public void updatePerson(Person person) throws SQLException {

        String sql = "UPDATE people SET name=?, age=? WHERE id=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, person.name);
        statement.setInt(2, person.age);
        statement.setInt(3, person.id);//you do not tupdate the id NEVER. It is assigned to the record by auto-increment
        statement.executeUpdate();
        //System.out.println("Record updated id= " + id);

    }

    public void deletePerson(Person person) throws SQLException {

        try {
            String sql = "DELETE FROM people WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, person.id);
            statement.executeUpdate();
            //System.out.println("Record deleted id= " + person.id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }// end try block
    }

}
