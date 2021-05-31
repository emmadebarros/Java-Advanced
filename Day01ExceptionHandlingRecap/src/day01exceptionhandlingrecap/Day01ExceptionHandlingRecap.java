//Exercice from Java 2 ErrorHandling - Practice3

package day01exceptionhandlingrecap;


public class Day01ExceptionHandlingRecap {
    
    static void doSomething() throws ArithmeticException {
		
        int a = 10;
        int b = 0;
		
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException exc) {
            throw new ArithmeticException("An error happened");
            }
		
//		THIS IS NOT GOOD: 
//		int x = a/b;
//		throw new ArithmeticException("An error happened");

		
		
    }


    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            doSomething();
            System.out.println("Hey, I don't get executed because there's an exception happening right above me!");
	}
        catch(ArithmeticException exc) {
            System.err.println(exc.getMessage()); //Prints An error happened
	}
	finally {
            System.out.println("Hi, I get called all the time");
	}
		
	//Just to show that the execution of the program resumes after the catch block
	int z = 8-2;
	System.out.println(z);
		
	System.out.println();
		
	//Another example: 
	int[] numer = {4, 8, 16, 32};
	int[] denum = {2, 0, 4, 4};
		
	for(int i = 0; i < numer.length; i++) {
            
            try {
		System.out.println(numer[i] / denum[i]);
            }
            catch(ArithmeticException exc) {
		System.out.println("You can't devide by zero!");
            }
	}
    }
    
}
