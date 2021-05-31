package day01datafromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Day01DataFromFile {
    
    static ArrayList<String> namesList = new ArrayList<>();
    static ArrayList<Double> numsList = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        File file = new File("/Users/emmadebarros/Documents (Local)/java-lll/Day01DataFromFile/input.txt");
        
        try {
            
            Scanner scan = new Scanner(file);
        
            while(scan.hasNextLine()) {
        
                // System.out.println(scan.nextLine());
                
                String line = scan.nextLine();
                
                try {
                    
                    double d = Double.valueOf(line);
                    
                    numsList.add(d);
                    
                } catch (NumberFormatException nfe) {
                   
                    namesList.add(line);
                    
                }
            
            }
            
            System.out.println(numsList);
            System.out.println("-----------");
            System.out.println(namesList);
            System.out.println("-----------");
        
        } catch (FileNotFoundException ex) {
        
            System.out.println("Error: File not found");
            System.exit(1);
        
        }
        
        Collections.sort(namesList);
        System.out.println("Alphabetically sorted Names List:");
        System.out.println(namesList);
        System.out.println("-----------");
        
        Collections.sort(numsList);
        System.out.println("Smallest to Largest:");
        System.out.println(numsList);
        System.out.println("-----------");
    
        
    
    // see teacher's solution!!!!   
        
        
    }
    
}
