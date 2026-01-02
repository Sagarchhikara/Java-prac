package oops;

class Student {
    private String name;
    private int rollNo;
    private float marks;

    // Parameterized constructor
    Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
        System.out.println("Copy constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNo + ", Marks: " + marks);
    }

    void setMarks(float marks) {
        this.marks = marks;
    }
}


    public static void main(String[] args) {
        // Original object
//        Student s1 = new Student("Alice", 101, 85.5f);
//
//        // Copy object using copy constructor
//        Student s2 = new Student(s1);

        System.out.println("Original object:");
        s1.display();

        System.out.println("\nCopied object:");
        s2.display();

        // Modifying copy doesn't affect original
        s2.setMarks(95.0f);

        System.out.println("\nAfter modifying copy:");
        System.out.println("Original:");
        s1.display();
        System.out.println("Copy:");
        s2.display();
    }

//```
//
//        **Output:**
//        ```
//Copy constructor called
//Original object:
//Name: Alice, Roll: 101, Marks: 85.5
//
//Copied object:
//Name: Alice, Roll: 101, Marks: 85.5
//
//After modifying copy:
//Original:
//Name: Alice, Roll: 101, Marks: 85.5
//Copy:
//Name: Alice, Roll: 101, Marks: 95.0

    // Instance variables (unique to each object)
    String name;
    int rollNo;

    // Static variable (shared by all objects)
    static String schoolName = "ABC High School";
    static int totalStudents = 0;

    // Constructor
//  //  Student(String name, int rollNo) {
//        this.name = name;
//        this.rollNo = rollNo;
//        totalStudents++;  // Increment for each new student
//    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("School: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("---");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects
//        Student s1 = new Student("Alice", 101);
//        Student s2 = new Student("Bob", 102);
//        Student s3 = new Student("Charlie", 103);

        // Accessing static variable using class name (preferred way)
        System.out.println("School: " + Student.schoolName);
        System.out.println("Total Students: " + Student.totalStudents);

        System.out.println("\nStudent Details:");
//        s1.display();
//        s2.display();
//        s3.display();

        // Changing static variable affects all objects
        Student.schoolName = "XYZ International School";

        System.out.println("\nAfter changing school name:");
//        s1.display();
//        s2.display();
    }
}
//```
//
//        **Output:**
//        ```
//School: ABC High School
//Total Students: 3
//
//Student Details:
//Name: Alice
//Roll No: 101
//School: ABC High School
//Total Students: 3
//        ---
//Name: Bob
//Roll No: 102
//School: ABC High School
//Total Students: 3
//        ---
//Name: Charlie
//Roll No: 103
//School: ABC High School
//Total Students: 3
//        ---
//
//After changing school name:
//Name: Alice
//Roll No: 101
//School: XYZ International School
//Total Students: 3
//        ---
//Name: Bob
//Roll No: 102
//School: XYZ International School
//Total Students: 3
//        ---