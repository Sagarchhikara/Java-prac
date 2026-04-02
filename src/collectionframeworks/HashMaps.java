package collectionframeworks;
import java.util.*;
public class HashMaps {
    public  static  void main(String[] args){
//        String name="Sagar";
//        int code=name.hashCode();
//        System.out.println(code);
        HashMap<String,Integer> map= new HashMap<>();
        map.put("Sagar", 1);
        map.put("Rahul", 2);
        map.put("Kunal", 3);
        System.out.println(map);
        System.out.println(map.get("Sagar"));
        HashSet<Integer> set= new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(56);
        System.out.println(set);
    }
}
