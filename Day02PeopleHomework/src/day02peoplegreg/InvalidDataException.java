package day02peoplegreg;

/**
 *
 * @author emmadebarros
 */
public class InvalidDataException extends Exception { // Create custom exception
    
    
    public InvalidDataException(String msg) {
        super(msg);
    }
    
}

/*
Custom checked - unchecked exception:
https://www.baeldung.com/java-new-custom-exception
Teacher advice: never throw a runtime exception
*/
