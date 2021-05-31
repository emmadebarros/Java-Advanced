// as always, look at teacher's version...

package day01stackinterpreter;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emmadebarros
 */
public class Day01StackInterpreter {
    
    static Scanner input = new Scanner(System.in);
    
    static final String DIRECTORY = "/Users/emmadebarros/Documents (Local)/java-lll/Day01StackInterpreter";
    
    static File[] files;
    
    static void listTxtFiles() {
        
        File directoryPath = new File(DIRECTORY); //try with resources?
        
        System.out.println("---------- Text Files ----------");
        
        files = directoryPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
        
        for (File file : files) {
		System.out.println(file.getName());
	}
        
        System.out.println();
        
    }
    
    static void verifFile(String fileToUse) {
    
        if(!fileToUse.contains(".txt")) {
        
            System.out.println("The file name should contain the .txt extension");
            System.exit(1);
        
        }
    
    }
    
    static void interpretFile() {
        
    }


    public static void main(String[] args) {
        // TODO code application logic here
        
        listTxtFiles();
        
        System.out.println("Enter the name of a .txt file to use:");
        
        String fileToUse = input.nextLine();
        
        verifFile(fileToUse);
        
        interpretFile();
        
    }
    
}
