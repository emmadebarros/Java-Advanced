package day02todos;

import java.util.Date;

/**
 *
 * @author emmadebarros
 */
public class ToDo {
    
    String task;
    
    Date dueDate;
    
    int hoursOfWork;

    public ToDo(String task, Date dueDate, int hoursOfWork) {
        setTask(task);
        setDueDate(dueDate);
        setHoursOfWork(hoursOfWork);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        
        if(task.length() < 2 || task.length() > 50 || task.contains(";") || task.contains("`")) {
            throw new IllegalArgumentException("Task must be 2-50 characters long and must NOT contain ; or `");
        } else {
            this.task = task;
        }
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        
        // if(dueDate.after(1900) && dueDate.before(2100) { this.dueDate = dueDate } else { throw IllegalArgumentException } HOW TO DO THIS - COME BACK TO IT LATER
        this.dueDate = dueDate;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        
        if(hoursOfWork < 0) {
            throw new IllegalArgumentException("Hours worked must greater than or equal to 0");
        } else {
            this.hoursOfWork = hoursOfWork;
        }
    }
    
    
    
}
