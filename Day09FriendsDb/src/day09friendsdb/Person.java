package day09friendsdb;

/**
 *
 * @author emmadebarros
 */
public class Person {
    
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        //return "Person{" + "id= " + id + ", name= " + name + ", age= " + age + '}';
        return String.format("%d: %s is %d y/o", id, name, age);
    }
    
}
