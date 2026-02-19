package collectionframeworks;
import java.util.*;

public class Maps {
    public static void  main(String[] args) {
//        HashMap<Integer,String> students=new HashMap<>();
//        students.put(1,"Sagar");
//        students.put(2,"Ankit");
//        students.put(3,"Daniel");
//        System.out.println(students);
        // Find the frequency of characters in a string
        String str="hello world";
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            }
            else  {
                freq.put(ch, 1);
            }
    }
        System.out.println(freq);
    }

}
