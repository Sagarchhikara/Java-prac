package recursion;
import java.util.*;

public class recursion1 {
    public static void main(String[] args) {
        message();

    }

    private static void message() {
        System.out.println("Hello World");
        message1();
    }
    static  void message1() {
        System.out.println("Hello World from message1");
        message2();
    }
    static  void message2() {
        System.out.println("Hello World from message2");
        message3();
    }
    static void message3() {
        System.out.println("Hello World from message3");

    }

}
