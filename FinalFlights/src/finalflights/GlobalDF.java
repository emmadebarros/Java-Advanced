/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalflights;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author emmadebarros
 */
public class GlobalDF {

    static DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    static { // static initializer
        format.setLenient(false);
    }
}
