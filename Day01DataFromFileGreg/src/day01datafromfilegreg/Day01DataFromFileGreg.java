package day01datafromfilegreg;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Day01DataFromFileGreg {
    
    // Function to read data from file - called from main
    static final String DATA_FILE_NAME = "input.txt";
    
    static void readDataFromFile() {
        
        try (Scanner fileInput = new Scanner(new File(DATA_FILE_NAME))) { // try with resources - don't need to close() and finally clause, it does it automatically  | Java takes care to call .close() on all resources we've opened in try().
            
            while (fileInput.hasNextLine()) {
                
                String line = fileInput.nextLine();
                
                try {
                    double val = Double.parseDouble(line); // exception NumberFormatException
                    numsList.add(val);
                } catch (NumberFormatException ex) {
                    namesList.add(line);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
    
    // Function to calculate average length of names - called from main
    static double findAverage() {
    
        if(namesList.isEmpty()) {
            System.out.println("No names, can't compute the average length");
            // return keyworkd
        }
        
        int numChar = 0;
        
        for (String name : namesList) {
            numChar += name.length();
        }
        
        double average = (double)numChar / (namesList.size());
        
        return average; // could've put it as static void and print here
    
    }
    
    // Function to find duplicates
    static HashSet<String> findDuplicates() {
    
        HashSet<String> duplicates = new HashSet<>(); // teacher created the algorithmn and used a nested loop (see his answer, better this way)
        
        for (String name : namesList) {
            duplicates.add(name);
        }
        
        return duplicates; // could've put it as static void and print here
        
        // ça a l'air que c pas bon... prendre le code du prof
    
    }
    
    // Function to write duplicates hashset in file
    static void writeToFile() {
    
        try (BufferedWriter bw = new BufferedWriter( // try with resources
                    new FileWriter("/Users/emmadebarros/Documents (Local)/java-lll/Day01DataFromFileGreg/duplicates.txt"))) {
            
            for (String name : findDuplicates()) {
            
                bw.write(name + "\n");
            
            }
            
        } catch (Exception ex) { // Teacher used IO Exception
            System.out.println("Couldn't write to file");
            System.exit(1);
        }
    
    }
    
    static ArrayList<String> namesList = new ArrayList<>();
    static ArrayList<Double> numsList = new ArrayList<>();


    public static void main(String[] args) {
        // TODO code application logic here
        readDataFromFile();
        
        //Q.1 Sort names alphabetically
        Collections.sort(namesList);
        //Q.2 Sort numbers smallest to largest
        Collections.sort(numsList);
        
        //Q.3 Display names (sorted) on a single line, comma seperated
        System.out.println("Names: " + String.join(", ", namesList));
        System.out.println("-------------------");
        
        //Q.4 Display numbers (sorted) on a single line, comma seperated
        System.out.println("Numbers: " + numsList.toString()); // FIXME
        System.out.println("-------------------");
        
        //Q.5 Compute the average length of names in characters (floating point) and display it
        
        System.out.printf("Average length of names: %f characters per name\n", findAverage());
        System.out.println("-------------------");
        
        
        //Q.6 Find duplicates in namesList
        System.out.println("Duplicate names in namesList: " + String.join(", ", findDuplicates()));
        System.out.println("-------------------");
        
        //Q.7 Write duplicates HashSet in file
        writeToFile();
        System.out.println("Wrote to file");
        
        System.out.println("-------------------");
        System.out.println("done");
        
        
    }
    
}
