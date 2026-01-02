package oops;
import java.util.*;
public class constructors {
    //Data members(fields/attributes)
    String name;
    int rollno;
    float marks;
    void displayINfo(){
        System.out.println("Name"+name);
        System.out.println("Rollno"+rollno);
        System.out.println("Marks"+marks);
       // OBjects

    }
    public static void main(String[] args) {
        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Setting values
        s1.name = "Alice";
        s1.rollNumber = 101;
        s1.marks = 85.5f;

        s2.name = "Bob";
        s2.rollNumber = 102;
        s2.marks = 90.0f;

        // Calling methods
        s1.displayInfo();
        s2.displayInfo();
    }
}
class Student {
    // Data members
    String name;
    int rollNumber;
    float marks;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}
