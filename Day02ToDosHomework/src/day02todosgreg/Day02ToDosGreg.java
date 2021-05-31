package day02todosgreg;

/**
 *
 * @author emmadebarros
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Day02ToDosGreg {

    static ArrayList<Todo> todoList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static int getMenuChoice() {
        System.out.print("Please make a choice [0-4]:\n"
                + "1. Add a todo\n"
                + "2. List all todos (numbered)\n"
                + "3. Delete a todo\n"
                + "4. Modify a todo\n"
                + "0. Exit\n"
                + "Your choice is: ");
        int choice = input.nextInt(); // ex
        input.nextLine(); // consume the leftover newline
        return choice;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        while (true) {
            System.out.println("Current instance count: " + Todo.getInstanceCount());
            int choice = getMenuChoice();
            switch (choice) {
                case 1:
                    addTodo();
                    break;
                case 2:
                    listAllTodosNumbered();
                    break;
                case 3:
                    deleteTodo();
                    break;
                case 4:
                    modifyTodo();
                    break;
                case 0:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice, try again"); // Always have a default with a switch-case
            }
            System.out.println();
        }

    }

    private static void addTodo() {
        try {
            System.out.println("Adding a todo.");
            System.out.print("Enter task description: ");
            String task = input.nextLine();
            System.out.print("Enter due Date (yyyy/mm/dd): ");
            String dueDateStr = input.nextLine();
            Date dueDate = Globals.dateFormatScreen.parse(dueDateStr); // ex ParseException
            System.out.print("Enter hours of work (integer): ");
            int hours = input.nextInt(); // ex NumberFormatException
            Todo todo = new Todo(task, dueDate, hours); // ex IllegalArgumentException
            todoList.add(todo);
            System.out.println("You've created the following todo:");
            System.out.println(todo);
        } catch (ParseException | NumberFormatException ex) {
            System.out.println("Error parsing: " + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void listAllTodosNumbered() {
        if (todoList.isEmpty()) {
            System.out.println("No todos found");
            return;
        }
        for (int i = 0; i < todoList.size(); i++) {
            System.out.printf("#%d: %s\n", i + 1, todoList.get(i)); // i + 1 for the output to be more user friendly (not start at 0 but at 1)
        }
    }

    private static void deleteTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. // when method not implemented yet, use this ex
    }

    private static void modifyTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. // when method not implemented yet, use this ex
    }

}
