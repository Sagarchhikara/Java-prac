package recursion;
import java.util.*;
//public class fibo {
//    public static  void main(String[] args){
//        System.out.println(fibo(4));
//    }
//    static int fibo(int n){
////        if(n<2){
////            return n;
////        }
////        return fibo(n-1)+fibo(n-2);
//        for (int i = 0; i < n; i++) {
//            n=(n-1)+(n-2);
//
//
//        }
//        return
//    }
//}
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        long a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i < n) System.out.print(", ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        sc.close();
    }
}

