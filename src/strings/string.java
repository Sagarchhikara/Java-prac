package strings;
import  java.util.*;
public class string {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
//        System.out.println(sb);
//        // Character at index 0
//        System.out.println(sb.charAt(0));
//        // changing character at index 0
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//        // inserting
//        sb.insert(0,"s");
//        System.out.println(sb);
//        sb.insert(2,'n');
//        sb.append("e");
//        System.out.println(sb);
        // Reverse a string
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontChar);


//        }
            System.out.println(sb);
        }
    }
}