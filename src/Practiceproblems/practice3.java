package Practiceproblems;
import java.util.*;
public class practice3 {

//
//    public class Main {
//        static void reverseInGroups(int[] heights, int n, int k) {
//            for (int i = 0; i < n; i += k) {
//                int left = i;
//                int right = Math.min(i + k - 1, n - 1);
//
//                while (left < right) {
//                    int temp = heights[left];
//                    heights[left] = heights[right];
//                    heights[right] = temp;
//                    left++;
//                    right--;
//                }
//            }
//        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] heights = new int[n];

            for(int i = 0; i < n; i++){
                heights[i] = sc.nextInt();
            }

            int k = sc.nextInt();
            reverseInGroups(heights, n, k);

            for(int x : heights){
                System.out.print(x + " ");
            }
            sc.close();
        }
    }

}
