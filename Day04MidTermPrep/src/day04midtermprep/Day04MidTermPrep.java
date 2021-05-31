package day04midtermprep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emmadebarros
 */
public class Day04MidTermPrep { // 1 function called

    static Scanner input = new Scanner(System.in);
    
    enum Reason { CHECKUP, REFERRAL, TESTS, FOLLOWUP, UNWELL };

    static int mainMenu() throws InvalidDataException {
        System.out.println("Main Menu:\n1. Make an appointment\n2. List appointments by Date\n3. List appointments by Name\n4. List appointments by their first reason\n0. Exit");
        System.out.print("Your choice? ");

        int choice = inputChoice();

        return choice;
    }

    static int inputChoice() throws InvalidDataException { // 2 function called

        while (true) {
            try {
                int result = input.nextInt(); // exc InputMismatchException
                input.nextLine(); // consume the leftover newline
                return result;
            } catch (InputMismatchException ex) {
                input.nextLine(); // consume the invalid input
                throw new InvalidDataException("Only digits from [0-4]\n", ex);
            }
        }

    }

    static void makeAppointment() throws InvalidDataException {
        
        HashSet<Reason> reasonList = new HashSet<>();

        try {
            System.out.println("Enter appointment date (yyyy-mm-dd): ");
            String date1 = input.nextLine();
            System.out.println("Enter appointment time (hh:mm): ");
            String date2 = input.nextLine();
            String dateFull = date1 + " " + date2;
            Date dateApp = GlobalDF.df.parse(dateFull); // ex ParseExc
            System.out.println("Enter duration (20, 40, 60): ");
            int duration = input.nextInt(); // ex InputMistmatchExc
            input.nextLine();
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            
            /*
            // Gather info for HashShet
            System.out.println("Possible reasons for visit are : Checkup, Referral, Tests, FollowUp, Unwell");
            System.out.println("Enter comma seperated list for reasons to visit (eg: Test, Unwell): ");
            String reasonApp = input.nextLine(); .toUpperCase();
            String[] reasonArray = reasonApp.split(",");
            */
            
            Appointment appointment = new Appointment(dateApp, duration, name);
            

            //1. put date together
            //2. parse it with Globals and store it in a Date variable
            System.out.println("Appoitnment Created");

            //return
        } catch (ParseException exc) {
            throw new InvalidDataException("Date parsing exception, try again.\n", exc);
        } catch (InputMismatchException exc) {
            input.nextLine();
            throw new InvalidDataException("Only integer values of 20, 40, or 60 accepted for the appointment duration. Please try again.\n", exc);
        }

    }

    static void listAppDates() {
        //TODO
    }

    static void listAppName() {
        //TODO
    }

    static void saveDataToFile() {
        //TODO
    }

    static void listAppFirstReason() {
        //TODO
    }

    public static void main(String[] args) {

        while (true) {

            try {

                int choice = mainMenu();

                switch (choice) {
                    case 1:
                        makeAppointment();
                        break;
                    case 2:
                        listAppDates();
                        break;
                    case 3:
                        listAppName();
                        break;
                    case 4:
                        listAppFirstReason();
                        break;
                    case 0:
                        saveDataToFile();
                        System.out.println("Exiting.");
                        return;
                    default:
                        System.out.println("Invalid choice, try again");
                }
                System.out.println();

            } catch (InvalidDataException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        }

    }

}
