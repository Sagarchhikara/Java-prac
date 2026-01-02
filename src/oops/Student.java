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

public class Main {
    public static void main(String[] args) {
        // Original object
        Student s1 = new Student("Alice", 101, 85.5f);

        // Copy object using copy constructor
        Student s2 = new Student(s1);

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
}
```

        **Output:**
        ```
Copy constructor called
Original object:
Name: Alice, Roll: 101, Marks: 85.5

Copied object:
Name: Alice, Roll: 101, Marks: 85.5

After modifying copy:
Original:
Name: Alice, Roll: 101, Marks: 85.5
Copy:
Name: Alice, Roll: 101, Marks: 95.0