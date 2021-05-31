
package day01randoms;

import java.util.Scanner;


public class Day01Randoms {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        //Gather info
        
        // Ask for minimum value
        System.out.print("Enter minimum: ");
        int minimum = input.nextInt();
        input.nextLine(); //Consume the left over \n in buffer
        
        // Ask for maximum value
        System.out.print("Enter maximum: ");
        int maximum = input.nextInt();
        input.nextLine(); //Consume the left over \n in buffer
        
        if (minimum > maximum) {
            System.out.println("Error: Minimum can't be larger than maximum");
            System.exit(1);
        }
        
        if ( (minimum < 0) || (maximum < 0) ) {
            System.out.println("Error: numbers must not be negative");
            System.exit(1);
        }
        
        System.out.print("How many random numbers do you want to generate?: ");
        int total = input.nextInt();
        input.nextLine(); //Consume the left over \n in buffer
        
        // Verif
        if ( total < 0 ) {
            System.out.println("Error: Number can't be negative");
            System.exit(1);
        }
        
        // Print
        
        System.out.print("Random number: ");
        
        for (int i = 0; i < total; i++) {
            
           int value = (int)(Math.random() * (maximum - minimum + 1)) + minimum;
           System.out.printf("%s%d", i == 0 ? "" : ", " , value);
            
        }
        
        System.out.println();
    }
    
    // See teacher's solution!!!!!
    
}
