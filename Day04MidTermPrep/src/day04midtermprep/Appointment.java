package day04midtermprep;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author emmadebarros
 */
public class Appointment {

    Date date;

    int durationMinutes;

    String name;

    // HashSet<Reason> reasonList = new HashSet<>();
    // enum Reason { CHECKUP, REFERRAL, TESTS, FOLLOWUP, UNWELL };
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public Appointment(Date date, int durationMinutes, String name) throws InvalidDataException { // HashSet<Reason> reasonList
        setDate(date);
        setDurationMinutes(durationMinutes);
        setName(name);
        // setReasonList(reasonList);
    }

    //TODO
    public Appointment(String dataLine) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws InvalidDataException {

        Date now = new Date();
        
        if(date.compareTo(now) <= 0) {
            throw new InvalidDataException("Appointments can only be made for tomorrow or a later date. Today's date: " + GlobalDF.df.format(now) + "\n");
        } else {
            this.date = date;
        }

        /*
        
        if(date.compareTo() <= 0) { // exc
            throw new InvalidDataException("Appointments can only be made for tomorrow or a later date. Today's date: " + now);
        } else {
            this.date = date;
        }
         */
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) throws InvalidDataException {
        
        if(durationMinutes == 20 || durationMinutes == 40 || durationMinutes == 60) {
            this.durationMinutes = durationMinutes;
        } else {
            throw new InvalidDataException("Duration of appointments can only be 20, 40 or 60 minutes\n");
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataException {

        if (!name.matches("^[a-zA-Z0-9(),'\"\\. -]+$")) {
            throw new InvalidDataException("The name must only contain uppercase, lowercase, digits 0-9, a comma, ', \", ., (), - and a space.");
        } else {
            this.name = name;
        }
    }

    /*
    public HashSet<Reason> getReasonList() {
        return reasonList;
    }

    public void setReasonList(HashSet<Reason> reasonList) throws InvalidDataException {
        
        if(reasonList.isEmpty()) {
            throw new InvalidDataException("Must have one or more reason to visit.");
        } else {
            this.reasonList = reasonList;
        }
    }
     */
}
