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
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // if no solution
    }
    public static boolean longestsum(int[] arr, int k){
        HashMap<Integer,Integer> map =new HashMap<>();
        int prefixsum=0;
        map.put(0,1);
        for(int num:arr){
            prefixsum+=num;
            if(map.containsKey(prefixsum-k)){
                return  true;
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return  false;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        countfrequency(arr);
        String str = "aabbcde";
        System.out.println(FirstNonRepeating(str));
        int[] arr1={2,7,11,15};
        int target =9;
        int[] result =twoSum(arr1,target);
        System.out.println(result);

    }
}
