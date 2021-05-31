/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author emmadebarros
 */
public class DateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
        LocalDateTime now = LocalDateTime.now(); 
        
        System.out.println(dtf.format(now));
        
        System.out.println("------------------");
        
        Date today = Calendar.getInstance().getTime();
        
        System.out.println(today);
        
        System.out.println("------------------");
        
        Date currentDate = new Date();
        System.out.println("Date: " + currentDate);
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        
        System.out.println("Date formated: " + df.format(currentDate));
        
        
        // test to add days
        System.out.println("------------------");
        
        Date now1 = new Date();
        
        Calendar c = Calendar.getInstance();
        
        c.add(Calendar.DAY_OF_MONTH, 100);
        
        System.out.println("now1: " + now1);
        System.out.println("c: " + c.getTime());
    }
    
}
