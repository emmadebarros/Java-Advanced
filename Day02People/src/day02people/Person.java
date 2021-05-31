package day02people;

import java.security.InvalidParameterException;


public class Person {
    
    private String name; // String is a reference type and is default null if FIELD not initialized
    
    private int age; // int is a primitive type and is default 0 if FIELD not initialized (floating point as well) (boolean is false)

    /* public Person(String name, int age) {
        this.name = name;
        this.age = age;
    } */
    // Because we have setters, thhis constructor is not good anymore
    // If not defined constructor, Java generates a default constructor.
    // When defined construcotr, Java doesn't generate default constrcutor public Person () { super();}
    
    // Good constructor now
    // We could technically copy paste the setters code in here but this is duplicate code and it is a BIG NO!
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }
    
    // A read-only class is when we set verif in the constructor and only have getters, so we call it only once and can never change it, just access data

    public String getName() { //Getters and setters with encapsulation (makes field private)
        return name;
    }

    public void setName(String name) {
        //don't silently ignore what doesn't suit the field!!!!!!!
        if(name.length() < 2 || name.length() > 20) {
            throw new InvalidParameterException("Name must be 2-20 characters long");         // never throw Exception or catch it, want to be more specific   
        } 
        
        this.name = name;       
       
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        
        if(age < 1 || age > 150) {
            throw new InvalidParameterException("Age must be between 1-150");
        }
        
        this.age = age;
        
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    // no pintln in constructor nor setters!!! You want to interact with the user? in the main
    
    
}
