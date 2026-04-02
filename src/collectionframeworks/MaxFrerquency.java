package collectionframeworks;

import java.util.*;

public class MaxFrerquency {
    public static void countfrequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
    public static char  FirstNonRepeating(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first non-repeating
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '#';
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,2,3,3,3};
//        countfrequency(arr);
        String str = "aabbcde";
        System.out.println(FirstNonRepeating(str));
    }
}
