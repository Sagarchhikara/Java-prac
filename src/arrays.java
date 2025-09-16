import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // multidimensional arrays
        // syntax
//        int[][] arr=new int[3][3];
//        int[][] arr2={
//                {1,2,3}, // oth index
//                {4,5}, // 1st index
//                {6,7,8,9}
//        };
//        // input multidimensional array
//        for(int row = 0; row <arr.length; row++){
//            for(int col = 0; col <arr[row].length; col++){
//                arr[row][col]=sc.nextInt();
//            }
//        }
//        for(int row = 0; row <arr.length; row++){
//            for(int col = 0; col <arr[row].length; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
//        for(int row = 0; row <arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
//        for(int[] a:arr){
//            System.out.println(Arrays.toString(a));
//        }
        // Wap to find the largest element in a given array
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        System.out.println(largest);
//        for (int i = 0; i < arr.length; i++) {
//
//        }
//

    }
}
//    static void change(int[] arr){
//        arr[0]
//    }
//}
