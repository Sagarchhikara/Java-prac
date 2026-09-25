package recursion;

public class Prime {
    public static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i - 1);
    }
    public static void main(String[] args) {
        int n = 29; // Change this number to test other values
        if (isPrime(n, n / 2)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
