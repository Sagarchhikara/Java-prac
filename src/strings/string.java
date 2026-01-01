package strings;
import  java.util.*;
public class string {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("Tony");
        System.out.println(sb);
        // Character at index 0
        System.out.println(sb.charAt(0));
        // changing character at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);
        // inserting
        sb.insert(0,"s");
        System.out.println(sb);
        sb.insert(2,'n');
        sb.append("e");
        System.out.println(sb);
    }
}
