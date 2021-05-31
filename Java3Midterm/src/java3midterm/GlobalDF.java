package java3midterm;

import java.text.SimpleDateFormat;

/**
 *
 * @author emmadebarros
 */
public class GlobalDF {

    static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    static { // static initializer
        df.setLenient(false);
    }

}
