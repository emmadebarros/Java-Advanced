/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10students;

/**
 *
 * @author emmadebarros
 */
public class Student {
    
    //give the fields same name as database entities
    //the properties are not encapsulated yet
    int id;
    String name;
    byte[] image; //other possible types ByteArray, Blob, a data stream. Right now it's a null value because it's a reference type

    public Student(int id, String name, byte[] image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    @Override
    public String toString() {
        return String.format("Student ID #%d: %s", id, name); //we can't really print the image so don't put it in toString()
    }
    
}
