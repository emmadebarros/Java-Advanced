// Really cool code/example of error handling and custom checked exception
package day02peoplegreg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Day02PeopleGreg {
    
    static ArrayList<Person> people = new ArrayList<>();

    static final String DATA_FILE_NAME = "people.txt"; // Put the path in a final variable
    
    private static void readDataFromFile() {
        try (Scanner fileInput = new Scanner(new File(DATA_FILE_NAME))) {
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                try {
                    String [] data = line.split(";");
                    if (data.length != 2) {
                        //System.out.println("Invalid number of fields in line, skipping.");
                        //continue;
                        throw new InvalidDataException("Every line must have 2 fields"); // created custom exception
                    }
                    String name = data[0]; // Just a thought: we could check here if the 'name' parses as something else than a string, not a name... see ** below
                    int age = Integer.parseInt(data[1]); // this could throw a NumberFormatException
                    Person person = new Person(name, age); // all the Person objects have the same name... maybe store the name as a dynamic variable with a count variable..?
                    people.add(person);
                    /* Every time there's an error thrown in that block of code, the rest of the code won't execute. It will fall in the catch statement and restart because of the while loop */
                } catch (NumberFormatException ex) {
                    System.out.println("Error parsing integer, skipping the invalid line");
                    System.out.println(">> " + line);
                } catch (InvalidDataException ex) {
                    System.out.println("Error in data, skippnig line: " + ex.getMessage());
                    System.out.println(">> " + line);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
    
    private static void printDataToScreen() {
        for (Person p : people) {
            System.out.println(p); // toString(); implicitly called
        }
    }
    


    public static void main(String[] args) {
        // TODO code application logic here
        
        readDataFromFile();
        printDataToScreen();
        
    }
    
}

/*
Step 1: Try (try with resources) reading from a file
Step 2: While the file has a nextLine(), we want to store this line in a variable to interpret it after
Step 3: Try splitting the line and storing the values in a simple array (if the length of this array is less or more than 2, that means there's something wrong in the line)
Step 4: Store the first element of the array in a variable called name
Step 5: Sotre the second element of the array in a variable called age (to make sure it's an int, parse it because for now it's just a string in the file)
Step 6: Instantiate the Person object
Step 7: Add the Person object in the people arrayList
Step 8: Catch two possible exceptions
Step 9: Catch possible file reading exception
*/


/*
***
Perhaps the easiest and the most reliable way to check whether a String is numeric or not is by parsing it using Java's built-in methods:

Integer.parseInt(String)
Float.parseFloat(String)
Double.parseDouble(String)
Long.parseLong(String)
new BigInteger(String)
If these methods don't throw any NumberFormatException, then it means that the parsing was successful and the String is numeric
we could even check if the string is == to null
*/
