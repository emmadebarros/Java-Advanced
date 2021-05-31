package day02people;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Day02People {
    
    static ArrayList<Person> personList = new ArrayList<>();
    
    static final String DATA_FILE_NAME = "people.txt";
    
    // Read data from file and instantiate object
    static void readDataFromFile() {
        
        try (Scanner fileInput = new Scanner(new File(DATA_FILE_NAME))) { // try with resources - don't need to close() and finally clause, it does it automatically  | Java takes care to call .close() on all resources we've opened in try().
            
            fileInput.useDelimiter(";|\n");
            
            while (fileInput.hasNextLine()) {
                
                try {
                    
                    String name = fileInput.next();
                    int age = fileInput.nextInt(); // we should make sure it parses as an integer
                    
                    Person person = new Person(name, age);
                    
                    personList.add(person);
                    
                } catch (Exception ex) { // not good practice to catch - throw Exception (I don't believe this but for this course do it like that - never use Exception class in catch/throw)
                    System.out.println("Invalid line encountered");
                    continue;
                }
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
        
    }


    public static void main(String[] args) {
        
        /* Person p1 = new Person("Jerry Bobdhfkjhskfdhsakdhfaskluefkjshdfkausyefhjdsa", 23);
        
        System.out.println("Name is " + p1.getName());
        
        System.out.println("------------------------");
        
        p1.setName("Jerry Bonbdkjhfadskajhfkasjhdfkajshdfkhjasdkfjhasdkfhaskdfhaskd");
        
        System.out.println("Name is " + p1.getName());
        
        System.out.println("------------------------");

        */
        
        
        readDataFromFile();
        
        for(Person person : personList) {
            System.out.println(person.getName() + " is " + person.getAge() + " y/o");
            // with string.format in toString just need to call the object and it will happen implicitly (so it will print) - see teacher's solution
        }
        
        // if a method goes above 30lines approx, split it, re-work it, etc (general, good practice)
        // keep main method short and clean (general, good practice)
    }
    
}
