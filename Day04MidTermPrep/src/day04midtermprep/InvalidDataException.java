package day04midtermprep;

/**
 *
 * @author emmadebarros
 */
public class InvalidDataException extends Exception{
    
    public InvalidDataException(String msg) {
        super(msg);
    }
    
    public InvalidDataException(String msg, Throwable cause) {
        super(msg, cause);
    }
    
}
