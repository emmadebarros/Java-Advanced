/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day02todosgreg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emmadebarros
 */
public class TodoTest {
    

    /**
     * Test of getInstanceCount method, of class Todo.
     */
    @Test
    public void testGetInstanceCount() {
        System.out.println("getInstanceCount");
        int expResult = 0;
        int result = Todo.getInstanceCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Todo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Todo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toDataString method, of class Todo.
     */
    @Test
    public void testToDataString() throws ParseException {
        System.out.println("toDataString");
        
        Date date= new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2001");
        Todo instance = new Todo("Run this test", date, 1);
 
        String expResult = "Run this test:;2001-10-20;1";
        String result = instance.toDataString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTask method, of class Todo.
     */
    @Test
    public void testGetTask() {
        System.out.println("getTask");
        Todo instance = null;
        String expResult = "";
        String result = instance.getTask();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTask method, of class Todo.
     */
    @Test
    public void testSetTask() {
        System.out.println("setTask");
        String task = "";
        Todo instance = null;
        instance.setTask(task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDueDate method, of class Todo.
     */
    @Test
    public void testGetDueDate() {
        System.out.println("getDueDate");
        Todo instance = null;
        Date expResult = null;
        Date result = instance.getDueDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDueDate method, of class Todo.
     */
    @Test
    public void testSetDueDate() {
        System.out.println("setDueDate");
        Date dueDate = null;
        Todo instance = null;
        instance.setDueDate(dueDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoursOfWork method, of class Todo.
     */
    @Test
    public void testGetHoursOfWork() {
        System.out.println("getHoursOfWork");
        Todo instance = null;
        int expResult = 0;
        int result = instance.getHoursOfWork();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoursOfWork method, of class Todo.
     */
    @Test
    public void testSetHoursOfWork() {
        System.out.println("setHoursOfWork");
        int hoursOfWork = 0;
        Todo instance = null;
        instance.setHoursOfWork(hoursOfWork);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
