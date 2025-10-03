package Practiceproblems;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Wap a program to check weather a number is positive negative or zero
//        int a;
//        a=sc.nextInt();
//        if(a>0){
//            System.out.println("The number is positive");
//        }
//        else if (a<0) {
//            System.out.println("The number is negative");
//
//        }
//        else {
//            System.out.println("The number is 0");
//        }
//        for (int i = 0; i <100; i++) {
//            if (i%5==0){
//                continue;
//            }
//            else {
//                System.out.println(i);
//            }
//
//        }
        // Sumof digits of a number using while loop
//        int a;
//        a=sc.nextInt();
//        int sum=0;
//        while (a>0){
//            sum+=a%10;
//            a/=10;
//        }
//        System.out.println(sum);
        // insterting an element at a specific postition
        int[] arr = new int[10];
        int n = 5; // current size
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();
        System.out.print("Enter position (0-based index): ");
        int pos = sc.nextInt();

        for (int i = n; i > pos; i--) arr[i] = arr[i - 1];
        arr[pos] = x;
        n++;

        System.out.print("Array after insertion: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
