package collectionframeworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class lists {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Sagar");
        students.add("Ankit");
        students.add("Daniel");
        System.out.println(students.get(2));
        students.set(2, "Rohit");
        System.out.println(students);
        students.remove("Ankit");
        System.out.println(students);
        int x=students.size();
        System.out.println(x);
        boolean flag=students.contains("Sagar");
        System.out.println(flag);

    }
}
