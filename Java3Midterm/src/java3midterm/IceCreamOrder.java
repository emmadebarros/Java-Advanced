package java3midterm;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author emmadebarros
 */
public class IceCreamOrder {

    private String customerName; // 2-20 characters, regex to allow only uppercase, lowercase, digits, space, -,.()'"
    private Date deliveryDate; // 'y-m-d h:m' must be right now or later, and no further than 100 days ahead - get current date/time from new Date() and use Calendar
    private ArrayList<Flavour> flavList = new ArrayList<Flavour>(); // duplicates allowed, but setter must verify that list must not be empty (at least 1 item in it)

    static enum Flavour {
        VANILLA, CHOCOLATE, STRAWBERRY, ROCKYROAD
    };

    //Constructors
    public IceCreamOrder(String customerName, Date deliveryDate, ArrayList<Flavour> flavList) throws DataInvalidException {
        setCustomerName(customerName);
        setDeliveryDate(deliveryDate);
        setFlavList(flavList);
    }

    //Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) throws DataInvalidException {

        if (!customerName.matches("^[a-zA-Z0-9(),'\"\\. -]+$")) {
            throw new DataInvalidException("Incorrect name. Characters allowed : uppercase, lowercase, digits 0-9, a comma, ', \", ., (), - and a space.");
        } else {
            this.customerName = customerName;
        }

    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) throws DataInvalidException {

        Date now = new Date();

        Calendar c = Calendar.getInstance();
        c.setTime(now);

        c.add(Calendar.DAY_OF_MONTH, 100);

        if (deliveryDate.compareTo(now) <= 0 || deliveryDate.compareTo(c.getTime()) > 0) {
            throw new DataInvalidException("Appointments can only be made for right now or later, and no further than 100 days ahead. Today's date: " + GlobalDF.df.format(now) + "\n");
        } else {
            this.deliveryDate = deliveryDate;
        }

    }

    public ArrayList<Flavour> getFlavList() {
        return flavList;
    }

    public void setFlavList(ArrayList<Flavour> flavList) throws DataInvalidException {

        if (flavList.isEmpty()) {
            throw new DataInvalidException("List of flavours must not be empty\n");
        } else {
            this.flavList = flavList;
        }

    }

    //toString
    @Override
    public String toString() {
        return "IceCreamOrder{" + "customerName=" + customerName + ", deliveryDate=" + deliveryDate + ", flavList=" + flavList + '}';
    }

    /* FIXME
    public String toDataString() {
 
        String dtf2 = GlobalDF.df2.parse(deliveryDate);
        
        return String.format("%s;%s;%s", customerName, dtf2, flavList.toString());
        
    }
    */

}
