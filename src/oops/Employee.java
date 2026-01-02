//package oops;
//
//class Employee {
//    private String name;
//    private int id;
//    private double salary;
//
//    // Parameterized constructor
//    Employee(String name, int id, double salary) {
//        this.name = name;      // 'this' refers to current object
//        this.id = id;
//        this.salary = salary;
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//        System.out.println("Salary: " + salary);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Creating objects with specific values
//        Employee e1 = new Employee("John", 101, 50000);
//        Employee e2 = new Employee("Sarah", 102, 60000);
//
//        e1.display();
//        e2.display();
//    }
//}
//class Rectangle {
//    private int length;
//    private int width;
//
//    // Constructor 1: No parameters
//    Rectangle() {
//        length = 1;
//        width = 1;
//    }
//
//    // Constructor 2: One parameter (square)
//    Rectangle(int side) {
//        length = side;
//        width = side;
//    }
//
//    // Constructor 3: Two parameters
//    Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    int area() {
//        return length * width;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle();           // 1x1
//        Rectangle r2 = new Rectangle(5);          // 5x5
//        Rectangle r3 = new Rectangle(4, 6);       // 4x6
//
//        System.out.println("Area 1: " + r1.area());  // 1
//        System.out.println("Area 2: " + r2.area());  // 25
//        System.out.println("Area 3: " + r3.area());  // 24
//    }
//}