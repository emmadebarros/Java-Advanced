package day02todosgreg;

/**
 *
 * @author emmadebarros
 */
import java.text.SimpleDateFormat;

public class Globals {

    static final SimpleDateFormat dateFormatScreen = new SimpleDateFormat("yyyy/MM/dd"); // mm --> minutes MM --> month

    static { // static initializer
        dateFormatScreen.setLenient(false); // to not turn Feb 29 (as an example) in March 1st / to prevent weird behavior of date format
    }

}
