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
//        int[] arr = new int[5];
//        System.out.println("Enter 5 integers:");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int largest = arr[arr.length - 1];
//        System.out.println(largest);
        // wap to copy an array into another
//        int[] source = new int[5];
//        int[] destination = new int[5];
//        System.out.println("Enter array elements:");
//        for(int i=0;i<=source.length;i++){
//            source[i]=sc.nextInt();
//        }
//        for (int i = 0; i < source.length; i++) {
//            destination[i] = source[i];
//        }
//        System.out.println( Arrays.toString(destination));
//        int[] arr= new int[5];
//        for(int i=0;i<5;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int j=0;j<5;j++){
//            System.out.print(arr[j]+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//
//    }
        // Program to add to matrix



//
//                System.out.println("Enter the number of rows and columns:");
//                int rows = sc.nextInt();
//                int cols = sc.nextInt();
//
//                int[][] max1 = new int[rows][cols];
//                int[][] max2 = new int[rows][cols];
//                int[][] transpose = new int[cols][rows]; // Note: dimensions are swapped
//
//                // Input for first array
//                System.out.println("Enter the elements in the 1st array:");
//                for(int row = 0; row < rows; row++) { // Changed <= to <
//                    for(int col = 0; col < cols; col++) { // Changed <= to <
//                        max1[row][col] = sc.nextInt();
//                    }
//                }
//
//                // Input for second array
//                System.out.println("Enter the elements in the 2nd array:");
//                for(int row = 0; row < rows; row++) { // Changed <= to <
//                    for(int col = 0; col < cols; col++) { // Fixed: was < in original
//                        max2[row][col] = sc.nextInt();
//                    }
//                }
//
//                // Matrix addition (uncommented and fixed)
//                int[][] sum = new int[rows][cols];
//                for(int i = 0; i < rows; i++) {
//                    for(int j = 0; j < cols; j++) {
//                        sum[i][j] = max1[i][j] + max2[i][j];
//                    }
//                }
//
//                // Transpose of first matrix
//                for(int i = 0; i < rows; i++) {
//                    for(int j = 0; j < cols; j++) {
//                        transpose[j][i] = max1[i][j];
//                    }
//                }
//                // Sum of Diagonal Elements
//                int mainDiagonalSum = 0;
//                int antiDiagonalSum = 0;
//
//                 for(int i = 0; i < max1.length; i++) {
//            // Main diagonal: elements where row index = column index
//                mainDiagonalSum += max1[i][i];
//
//            // Anti-diagonal: elements where row + column = n-1
//                antiDiagonalSum += max1[i][max1.length-1-i];
//        }
//
//                // Display original matrices
//                System.out.println("\nFirst Matrix:");
//                printMatrix(max1, rows, cols);
//
//                System.out.println("\nSecond Matrix:");
//                printMatrix(max2, rows, cols);
//
//                // Display sum
//                System.out.println("\nSum of matrices:");
//                printMatrix(sum, rows, cols);
//
//                // Display transpose (fixed dimensions)
//                System.out.println("\nTranspose of first matrix:");
//                printMatrix(transpose, cols, rows); // Note: rows and cols are swapped
//                System.out.println("The diagonal sum is: " + mainDiagonalSum);
//                System.out.println("The anti diagonal sum is: " + antiDiagonalSum);
//
//                sc.close();
//
//            }

            // Helper method to print matrix
//            public static void printMatrix(int[][] matrix, int rows, int cols) {
//                for(int i = 0; i < rows; i++) {
//                    for(int j = 0; j < cols; j++) {
//                        System.out.print(matrix[i][j] + " ");
//                    }
//                    System.out.println(); // New line after each row
//                }
//            }
        int[] nums ={3,4,5,61,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));;
        }
        static void change(int[] arr){
        arr[0]=99;
        }
}




