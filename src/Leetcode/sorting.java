package Leetcode;
import java.util.*;
public class sorting {
    public  static void main(String[] args){

    }
   // Q 217 https://leetcode.com/problems/contains-duplicate/
   public boolean containsDuplicate(int[] nums) {
       Set<Integer> set=new HashSet<>();
       for(int num:nums){
           if(!set.add(num)){
               return true;
           }
       }
       return false;
    }
    // Q 88 https://leetcode.com/problems/merge-sorted-array/description/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
    public void mergeoptimize(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }


}
