// as always, look at teacher's version...

package day02todos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emmadebarros
 */
public class Day02ToDos {
    
    static Scanner input = new Scanner(System.in);
    
    static void menu () {
        System.out.println("Please make a choice [0-4]:\n1. Add a To-Do\n2. List all To-do's (numbered)\n3. Delete a To-Do\n4.Modify a To-do\n5.Exit\nYour choice is: ");
              
    }
    
    static void addToDo() {
        
    }
    
    static void listToDos() {
        
    }
    
    static void deleteToDo() {
        
    }
    
    static void modifyToDo() {
        
    }
    
    static void exit() {
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        // List the menu
        menu();
        
        // Store user's choice
        
        int userChoice = 0;
        
        try {
            if(input.nextInt() < 0) {
                throw new IllegalArgumentException("A integer between [0-4] must be entered, no negative values");
            }
            userChoice = input.nextInt();
            input.nextLine(); // consume left-over next line
        } catch (InputMismatchException ex) {
            System.out.println("Sorry, an integer between [0-4] must be entered : ");
            //System.exit(1);
        }
       
        // Manipulate user's choice
        switch(userChoice) {
            case 1:
                addToDo();
                break;
            case 2:
                listToDos();
                break;
            case 3: 
                deleteToDo();
                break;
            case 4: 
                modifyToDo();
                break;
            case 0:
                exit();
                break;
        }
        
    }
    
}
