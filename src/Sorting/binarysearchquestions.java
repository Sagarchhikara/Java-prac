package Sorting;

public class binarysearchquestions {
    public static void main(String[] args){

    }
    // finding the ceiling of  a number in a sorted array
    public static int findPivot(int[] arr,int n){
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<=arr[end]){
            return start;
        }
        int mid = start + (end-start)/2;
        int prev=(mid-1+n)%n;
        int next=(mid+1)%n;
        if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next]){
            return mid;
        }
        return  findPivot(arr,n)+1;
    }
}
