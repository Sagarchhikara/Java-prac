package oops;

public class Main{
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.display();  // Static: 1, Instance: 1

        Counter c2 = new Counter();
        c2.display();  // Static: 2, Instance: 1

        Counter c3 = new Counter();
        c3.display();  // Static: 3, Instance: 1

        System.out.println("\nAll objects see the same static count:");
        c1.display();  // Static: 3, Instance: 1
        c2.display();  // Static: 3, Instance: 1
        c3.display();  // Static: 3, Instance: 1

        Counter.displayStaticCount();  // Can call without object
    }
}