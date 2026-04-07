package BitManupulation;
import java.util.*;
public class bitAndORXor {
    public static void main(String[] args){
        System.out.println(51&42);
        System.out.println(51|42);
        System.out.println(countsetbits(5));
        int[] arr={1,2,3,4,1,2,3};
        System.out.println(findUnique(arr));
        char[] items = {'A','B','C','D'};
        printsets(items);

    }
    //  Write code to count the number of set bits in an integer n.
    public static int countsetbits(int n){
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return  count;
    }
    //7. Given an array where every element appears twice except one, find the unique element. Solve in O(n) time, O(1) space.
    public static int findUnique(int[] arr){
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique^=arr[i];
        }
        return unique;
    }
    // . Print all subsets of {A, B, C, D} using bitmask.
    public static void printsets(char[] items){
        int n = items.length;
        for (int mask = 0; mask < (1 << n); mask++)
        { System.out.print("{ ");
            for (int k = 0; k < n; k++) if ((mask & (1 << k)) != 0) System.out.print(items[k] + " ");
            System.out.println("}"); }

    }

}
