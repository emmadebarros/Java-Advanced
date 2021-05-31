package java3midterm;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;
import java3midterm.IceCreamOrder.Flavour;

/**
 *
 * @author emmadebarros
 */
public class Java3Midterm {

    static Scanner input = new Scanner(System.in);

    static ArrayList<IceCreamOrder> ordersList = new ArrayList<>();
    
    
    static void loadDataFromFile() {
        //TODO
        System.out.println("Not implemented yet");
    }

    static void saveDataToFile() {
        //TODO
        System.out.println("Not implemented yet");
    }
    
    static int mainMenu() throws DataInvalidException {

        System.out.println("Available Options\n1. Add an order\n2. List orders by customer name\n3. List orders by delivery date\n0. Exit");
        System.out.print("Please enter your choice:  ");

        int choice = inputChoice();

        return choice;
    }

    static int inputChoice() throws DataInvalidException {

        //while (true) { is it pertinent to place have it here...? FIXME?
        try {
            int result = input.nextInt(); // exc InputMismatchException
            input.nextLine(); // consume leftover newline ;
            return result;
        } catch (InputMismatchException ex) {
            input.nextLine(); // consume the leftover newline from invalid input
            throw new DataInvalidException("Only digits from [0-3] accepted.\n", ex);
        }
        //}

    }

    static Flavour setFlav(String s) throws DataInvalidException {
        try {
            Flavour f = Flavour.valueOf(s);
            return f;
        } catch (IllegalArgumentException exc) {
            throw new DataInvalidException("Invalid flavour, please try again.", exc);
        }

    }

    static void addOrder() throws DataInvalidException {
        //TODO
        //System.out.println("Not implemented yet");

        try {

            ArrayList<Flavour> flavList1 = new ArrayList<>();

            System.out.println("Adding an order...");
            System.out.println("Please enter customer's name: ");
            String name = input.nextLine(); // will be checked in constructor/setter ex
            System.out.println("Enter the delivery date (yyyy-mm-dd): ");
            String date1 = input.nextLine();
            System.out.println("Enter delivery time (hh:mm): ");
            String date2 = input.nextLine();
            String dateFull = date1 + " " + date2;
            Date dateApp = GlobalDF.df.parse(dateFull); // ex ParseExc

            //enum
            System.out.print("Flavours: ");
            for (Flavour flav : Flavour.values()) {
                System.out.printf("%s%s%s", (flav == flav.VANILLA ? "" : ", "), flav, (flav == flav.ROCKYROAD ? "\n" : ""));
            }

            while (true) {
                System.out.println("Enter which flavour to add (empty to finish): ");
                String flavour = input.nextLine().toUpperCase();
                if (flavour.isEmpty()) {
                    break;
                } else {
                    try {
                        flavList1.add(setFlav(flavour)); // ex DataInvalidExc                        
                    } catch (DataInvalidException exc) {
                        System.out.println(exc.getMessage());
                    }
                }
            }

            //Create OrderOb
            IceCreamOrder ico = new IceCreamOrder(name, dateApp, flavList1); // ex DataInvalidExc
            
            ordersList.add(ico);
            
            //TODO implement read/write to file!!

        } catch (ParseException exc) {
            throw new DataInvalidException("Date parsing exception, please try again entering date and time in the correct format.\n", exc);
        } catch (InputMismatchException exc) { //exc for enum?
            input.nextLine();
            throw new DataInvalidException("Only integer values of 20, 40, or 60 accepted for the appointment duration. Please try again.\n", exc);
        }

    }

    static void listByName() {
        //TODO
        System.out.println("Listing orders by customer name: ");
        
        /*
        for(int i = 0; i<ordersList.size(); i++) {
            System.out.print("For: " + ordersList[i].toString());
        }
        */
    }

    static void listByDate() {
        //TODO
        System.out.println("Not implemented yet");
    }

    public static void main(String[] args) {

        while (true) {

            try {

                int choice = mainMenu();
                System.out.println();

                switch (choice) {
                    case 1:
                        addOrder();
                        break;
                    case 2:
                        listByName();
                        break;
                    case 3:
                        listByDate();
                        break;
                    case 0:
                        saveDataToFile();
                        System.out.println("Exiting.");
                        return;
                    default:
                        System.out.println("Invalid choice, try again");
                }
                System.out.println();

            } catch (DataInvalidException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        }

    }

}
