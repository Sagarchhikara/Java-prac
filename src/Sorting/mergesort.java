package Sorting;
import java.util.*;
public class mergesort {
    public static void main(String[] args){
        int[] arr={12,11,13,5,6,9,15,86,31};
        System.out.println("Original Array");
        printarr(arr);
        mergeSort(arr);
        System.out.println("Sorted Array");
        printarr(arr);
    }
    private static void mergesor(int[] arr) {
        mergeSortUtil(arr,0,arr.length-1);
    }

    private static void printarr(int[] arr) {
//        for (int i = 0; i<=arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    static void mergeSortUtil(int arr[],int left, int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        mergeSortUtil(arr,left,mid);
        mergeSortUtil(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];


        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }

    }
    // mergesort using recursion
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
