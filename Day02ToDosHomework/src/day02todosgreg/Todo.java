package day02todosgreg;

/**
 *
 * @author emmadebarros
 */
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.IntStream;

public class Todo {

    private String task; // 2-50 characters long, must NOT contain a semicolon or | or ` (reverse single quote) characters
    private Date dueDate; // Date between year 1900 and 2100
    private int hoursOfWork; // 0 or greater number
    // Part3: TaskStatus status;	
    // Part3: enum TaskStatus { Pending, Done };

    public Todo(String task, Date dueDate, int hoursOfWork) {
        setTask(task);
        setDueDate(dueDate);
        setHoursOfWork(hoursOfWork);
        instanceCount++;
    }

    public Todo(String dataLine) { // throws ParseException, NumberFormatException, IllegalArgumentException {
        String[] data = dataLine.split(";");
        if (data.length != 3) {
            throw new IllegalArgumentException("Invalid number of items in line");
        }
        /// continue parsing, use setters to set values
        instanceCount++;
    }

    private static int instanceCount; // static, read-only property

    public static int getInstanceCount() {
        return instanceCount;
    }

    // format all fields of this Todo item for display exactly as specified below in the example interactions
    @Override
    public String toString() {
        String dueDateStr = Globals.dateFormatScreen.format(dueDate);
        return String.format("%s, %s, will take %d hour(s) of work", task, dueDateStr, hoursOfWork);
    }

    public String toDataString() {
        // returns a string similar to "Buy milk 2%;2019-11-22;2"
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        //if (task.length() < 2 || task.length() > 50) {
        if (!task.matches("[^;|`]{2,50}")) { // with regex
            throw new IllegalArgumentException("Task must be 2-50 character long and not contain ;|` characters");
        }
        this.task = task;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        // int year = dueDate.getYear() + 1900; // getYear() gives us year - 1900
        Calendar cal = Calendar.getInstance();
        cal.setTime(dueDate);
        int year = cal.get(Calendar.YEAR);
        if (year < 1900 || year > 2100) { // error
            throw new IllegalArgumentException("Year must be 1900 to 2100");
        }
        this.dueDate = dueDate;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        if (hoursOfWork < 0) {
            throw new IllegalArgumentException("Hours of work can't be negative");
        }
        this.hoursOfWork = hoursOfWork;
    }

}
