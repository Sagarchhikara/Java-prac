package recursion;

import java.util.Map;
import java.util.LinkedHashMap;

public class factorial {
   public static void main(String[] args) {
      int number = 5; // Example number to calculate factorial
       int result = factorialrecursion(number);
//        int resultIterative = factorialiterative(number);
//        System.out.println("Factorial of " + number + " using iterative method is: "+ resultIterative);
        System.out.println("Factorial of " + number + " is: " + result);
   }
//
    static int factorialrecursion(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorialrecursion(n - 1); // Recursive case
    }
//    static int factorialiterative(int n){
//        int fact =1;
//        for(int i=2;i<=n;i++){
//            fact = fact*i;
//        }
//        return fact;
//    }i

public class PrimeFactorization {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java PrimeFactorization <positive-integer>");
            return;
        }
        long n;
        try {
            n = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
            return;
        }
        if (n <= 0) {
            System.out.println("Enter a positive integer greater than 0.");
            return;
        }

        Map<Long, Integer> factors = primeFactors(n);
        System.out.print(n + " = ");
        if (factors.isEmpty()) {
            System.out.print(n); // n is 1
        } else {
            boolean first = true;
            for (Map.Entry<Long, Integer> e : factors.entrySet()) {
                if (!first) System.out.print(" * ");
                first = false;
                if (e.getValue() == 1) {
                    System.out.print(e.getKey());
                } else {
                    System.out.print(e.getKey() + "^" + e.getValue());
                }
            }
        }
        System.out.println();
    }

    // Returns prime factors in insertion order (smallest to largest)
    static Map<Long, Integer> primeFactors(long n) {
        Map<Long, Integer> map = new LinkedHashMap<>();
        // factor out 2s
        while (n % 2 == 0) {
            map.put(2L, map.getOrDefault(2L, 0) + 1);
            n /= 2;
        }
        // factor odd numbers
        for (long p = 3; p * p <= n; p += 2) {
            while (n % p == 0) {
                map.put(p, map.getOrDefault(p, 0) + 1);
                n /= p;
            }
        }
        if (n > 1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return map;
    }
}


}
