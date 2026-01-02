package oops;

public class Counter {
    // Static variable - shared by all objects
    static int staticCount = 0;

    // Instance variable - each object has its own copy
    int instanceCount = 0;

    Counter() {
        staticCount++;      // Increments shared variable
        instanceCount++;    // Increments object's own variable
    }

    void display() {
        System.out.println("Static Count: " + staticCount +
                ", Instance Count: " + instanceCount);
    }

    // Static method - can only access static members
    static void displayStaticCount() {
        System.out.println("Static Count from static method: " + staticCount);
        // System.out.println(instanceCount);  // ERROR! Cannot access instance variable
    }
}

//
//```
//
//        **Output:**
//        ```
//Static Count: 1, Instance Count: 1
//Static Count: 2, Instance Count: 1
//Static Count: 3, Instance Count: 1
//
//All objects see the same static count:
//Static Count: 3, Instance Count: 1
//Static Count: 3, Instance Count: 1
//Static Count: 3, Instance Count: 1
//Static Count from static method: 3