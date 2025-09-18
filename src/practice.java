import java.util.Scanner;

public class practice {
    // Wap to find the largest element in a given array
    // wap to input and print a 2d array
    // wap to copy one array to another
    // wap to display weather the given array is equal or not without using predefined method
    // wap to add two matrices
    // wap to find the transpose of given matrix
    // wap to find the sum of primary and secondary diagonal of a matrix
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr={1 ,11,23,45,6};
//        System.out.println("Enter the number you want to input");
//        int num=sc.nextInt();
//        int n=arr.length;
        int[] arr=new int[20];
        arr[1]=10;
        arr[2]=20;
        arr[3]=30;
        arr[4]=40;
        arr[5]=50;
        int capacity=20;
        int n=6;
        int i,key=26;
        System.out.println("Before insertion");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        n=insertend(arr,n,key,capacity);
        System.out.println();
        System.out.println("After insertion");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    static int insertend(int arr[], int n,int key,int capacity){
        if(n>capacity){
            return n;}
        arr[n]=key;
        return (n+1);
    }
}
