/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalflights;

import java.util.Date;

/**
 *
 * @author emmadebarros
 */
public class Flight {

    int id;
    Date onDate;
    String fromCode, toCode;
    Type type;
    int passengers;
    // implement toString, constructor
    // encapsulation is not required

    public enum Type {
        Domestic, International, Private
    };

    public Flight(int id, Date onDate, String fromCode, String toCode, Type type, int passengers) {
        this.id = id;
        this.onDate = onDate;
        this.fromCode = fromCode;
        this.toCode = toCode;
        this.type = type;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return String.format("Flight id: %d, date: %s, from: %s, to: %s, type: %s, passengers: %d", id, onDate, fromCode, toCode, type, passengers);
    }

}
