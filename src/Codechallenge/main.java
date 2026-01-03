package Codechallenge;
import java.util.*;
import java.util.Scanner;
import static Codechallenge.Code1.*;
public class main {
    public static void main(String[] args) {
        // Test cases

        System.out.println("Test Case 1: Basic test");
        int[] arr1 = {5, 2, 8, 1, 9, 3, 7, 4, 6, 0};
        System.out.println("Original: " + Arrays.toString(arr1));
        familyphoto(arr1, 3);
        System.out.println("After sorting segments of 3: " + Arrays.toString(arr1));
        System.out.println();

        System.out.println("Test Case 2: Segment size equals array length");
        int[] arr2 = {9, 5, 7, 2, 8, 1, 6, 3, 4};
        System.out.println("Original: " + Arrays.toString(arr2));
        familyphoto(arr2, 9);
        System.out.println("After sorting entire array: " + Arrays.toString(arr2));
        System.out.println();

        System.out.println("Test Case 3: Segment size of 1");
        int[] arr3 = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("Original: " + Arrays.toString(arr3));
        familyphoto(arr3, 1);
        System.out.println("After sorting segments of 1: " + Arrays.toString(arr3));
        System.out.println();

        System.out.println("Test Case 4: Array length not divisible by n");
        int[] arr4 = {7, 3, 9, 2, 5, 8, 1, 4, 6};
        System.out.println("Original: " + Arrays.toString(arr4));
        familyphoto(arr4, 4);
        System.out.println("After sorting segments of 4: " + Arrays.toString(arr4));
        System.out.println();

        System.out.println("Test Case 5: Already sorted array");
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original: " + Arrays.toString(arr5));
        familyphoto(arr5, 3);
        System.out.println("After sorting segments of 3: " + Arrays.toString(arr5));
        System.out.println();

        System.out.println("Test Case 6: Reverse sorted array");
        int[] arr6 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Original: " + Arrays.toString(arr6));
        familyphoto(arr6, 2);
        System.out.println("After sorting segments of 2: " + Arrays.toString(arr6));
        System.out.println();

        // Test with invalid inputs
        System.out.println("Test Case 7: Invalid segment size");
        int[] arr7 = {1, 2, 3};
        familyphoto(arr7, 0);
        familyphoto(arr7, 5);
        System.out.println();

        System.out.println("Test Case 8: Empty array");
        int[] arr8 = {};
        familyphoto(arr8, 2);
        System.out.println("Test Case 1:");
        int[] ids1 = {101, 102, 101, 103, 102};
        System.out.println("IDs: " + Arrays.toString(ids1));
        System.out.println("Using Sorting: " + airlinebaggage(ids1));
//        System.out.println("Using Boolean Array: " + countUniqueWithBooleanArray(ids1));
//        System.out.println("Using Brute Force: " + countUniqueBruteForce(ids1));
        System.out.println("Expected: 3");
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        int[] ids2 = {50, 50, 50};
        System.out.println("IDs: " + Arrays.toString(ids2));
        System.out.println("Using Sorting: " + airlinebaggage(ids2));
//        System.out.println("Using Boolean Array: " + countUniqueWithBooleanArray(ids2));
//        System.out.println("Using Brute Force: " + countUniqueBruteForce(ids2));
        System.out.println("Expected: 1");
        System.out.println();

        // Additional test cases

        // Test Case 3: Empty array
        System.out.println("Test Case 3: Empty array");
        int[] ids3 = {};
        System.out.println("IDs: " + Arrays.toString(ids3));
        System.out.println("Using Sorting: " + airlinebaggage(ids3));
//        System.out.println("Using Boolean Array: " + countUniqueWithBooleanArray(ids3));
//        System.out.println("Using Brute Force: " + countUniqueBruteForce(ids3));
        System.out.println("Expected: 0");
        System.out.println();

        // Test Case 4: All unique elements
        System.out.println("Test Case 4: All unique elements");
        int[] ids4 = {1, 2, 3, 4, 5};
        System.out.println("IDs: " + Arrays.toString(ids4));
        System.out.println("Using Sorting: " + airlinebaggage(ids4));
//        System.out.println("Using Boolean Array: " + countUniqueWithBooleanArray(ids4));
//        System.out.println("Using Brute Force: " + countUniqueBruteForce(ids4));
        System.out.println("Expected: 5");
        System.out.println();

        // Test Case 5: Large IDs
        System.out.println("Test Case 5: Large IDs");
        int[] ids5 = {1000, 2000, 1000, 3000, 2000, 4000};
        System.out.println("IDs: " + Arrays.toString(ids5));
        System.out.println("Using Sorting: " + airlinebaggage(ids5));
        // Note: Boolean array method would create a large array (4000 elements)
        // This is inefficient for large IDs
//        System.out.println("Using Boolean Array: " + countUniqueWithBooleanArray(ids5));
//        System.out.println("Using Brute Force: " + countUniqueBruteForce(ids5));
        System.out.println("Expected: 4");
        System.out.println();

        // Performance comparison
        System.out.println("Performance Note:");
        System.out.println("1. Sorting method: O(n log n) time, O(1) extra space (in-place sort)");
        System.out.println("2. Boolean array: O(n) time, O(max ID) space");
        System.out.println("3. Brute force: O(n²) time, O(1) space");
        System.out.println("For large arrays, sorting method is recommended!");
    }
    }
