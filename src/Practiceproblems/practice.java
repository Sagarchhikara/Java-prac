package Practiceproblems;

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
//public static void main(String[] args) {
//    int[] originalArray = {1, 2, 3, 4, 5};
//    int elementToInsert = 99;
//    int position = 2; // Insert at index 2 (0-based)
//
//    System.out.println("Original array: " + Arrays.toString(originalArray));
//
//    int[] newArray = insertIntoArray(originalArray, elementToInsert, position);
//
//    System.out.println("After inserting " + elementToInsert + " at position " + position + ": " +
//            Arrays.toString(newArray));
//}
//
//    public static int[] insertIntoArray(int[] array, int element, int position) {
//        // Validate position
//        if (position < 0 || position > array.length) {
//            throw new IllegalArgumentException("Position must be between 0 and " + array.length);
//        }
//
//        // Create new array with increased size
//        int[] newArray = new int[array.length + 1];
//
//        // Copy elements before the insertion point
//        for (int i = 0; i < position; i++) {
//            newArray[i] = array[i];
//        }
//
//        // Insert the new element
//        newArray[position] = element;
//
//        // Copy elements after the insertion point
//        for (int i = position; i < array.length; i++) {
//            newArray[i + 1] = array[i];
//        }
//
//        return newArray;
//    }

//
//    // Corrected findElement method
//    static int findElement(int[] arr, int n, int key) {
//        for (int i = 0; i < n; i++) {  // Changed <= to <
//            if (arr[i] == key) {
//                return i;  // Return index if found
//            }
//        }
//        return -1;  // Moved outside the loop - return -1 only after checking all elements
//    }
//
//    // Corrected deleteElement method
//    static int deleteElement(int[] arr, int n, int key) {
//        // First find the position of the element to delete
//        int pos = findElement(arr, n, key);
//
//        // If element not found, return original size
//        if (pos == -1) {
//            System.out.println("Element " + key + " not found in array");
//            return n;
//        }
//
//        // Shift elements to the left to fill the gap
//        for (int i = pos; i < n - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//
//        // Optional: Set the last element to 0 (or default value)
//        arr[n - 1] = 0;
//
//        return n - 1;  // Return new size
//    }
//
//    // Utility method to print array
//    static void printArray(int[] arr, int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    // LinkedLists.linkedlists.Main method to test the functions
//    public static void main(String[] args) {
//        int[] arr = new int[10];  // Array with capacity 10
//        int n = 5;  // Current number of elements
//
//        // Initialize array
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//
//        System.out.println("Original array:");
//        printArray(arr, n);
//
//        // Test findElement
//        int key = 30;
//        int position = findElement(arr, n, key);
//        System.out.println("Element " + key + " found at position: " + position);
//
//        // Test deleteElement
//        System.out.println("\nDeleting element " + key + ":");
//        n = deleteElement(arr, n, key);
//        System.out.println("New array size: " + n);
//        printArray(arr, n);
//
//        // Test deleting non-existent element
//        System.out.println("\nTrying to delete element 99:");
//        n = deleteElement(arr, n, 99);
//        System.out.println("Array size remains: " + n);
//        printArray(arr, n);
//
//        // Test edge case - delete first element
//        System.out.println("\nDeleting first element (10):");
//        n = deleteElement(arr, n, 10);
//        printArray(arr, n);
//
//        // Test edge case - delete last element
//        System.out.println("\nDeleting last element (50):");
//        n = deleteElement(arr, n, 50);
//        printArray(arr, n);
//    }
//}

    public static void main(String[] args) {
        // to find the largest element in a java

    }

}