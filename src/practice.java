import java.util.Arrays;
import java.util.Scanner;

public class practice {
    // Wap to find the largest element in a given array
    // wap to input and print a 2d array
    // wap to copy one array to another
    // wap to display weather the given array is equal or not without using predefined method
    // wap to add two matrices
    // wap to find the transpose of given matrix
    // wap to find the sum of primary and secondary diagonal of a matrix
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int[] arr={1 ,11,23,45,6};
////        System.out.println("Enter the number you want to input");
////        int num=sc.nextInt();
////        int n=arr.length;
//        int[] arr=new int[20];
//
//        int capacity=20;
//        int n=6;
//        int i,key=26;
//        System.out.println("Before insertion");
//        for(i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        n=insertend(arr,n,key,capacity);
//        System.out.println();
//        System.out.println("After insertion");
//        for(i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//
//    }
//    static int insertend(int arr[], int n,int key,int capacity){
//        if(n>capacity){
//            return n;}
//        arr[n]=key;
//        return (n+1);
//    }
//    static  void insertelement(int arr[],int n,int x,int pos){
//        for(int i)
//    }
public static void main(String[] args) {
    int[] originalArray = {1, 2, 3, 4, 5};
    int elementToInsert = 99;
    int position = 2; // Insert at index 2 (0-based)

    System.out.println("Original array: " + Arrays.toString(originalArray));

    int[] newArray = insertIntoArray(originalArray, elementToInsert, position);

    System.out.println("After inserting " + elementToInsert + " at position " + position + ": " +
            Arrays.toString(newArray));
}

    public static int[] insertIntoArray(int[] array, int element, int position) {
        // Validate position
        if (position < 0 || position > array.length) {
            throw new IllegalArgumentException("Position must be between 0 and " + array.length);
        }

        // Create new array with increased size
        int[] newArray = new int[array.length + 1];

        // Copy elements before the insertion point
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element
        newArray[position] = element;

        // Copy elements after the insertion point
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }
}
