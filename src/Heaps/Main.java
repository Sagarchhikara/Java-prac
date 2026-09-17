import java.util.Scanner;

class Product {
    private int productId;
    private double price;
    private int quantity;

    // Constructor
    public Product(int productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total inventory value
    public double calculateValue() {
        return price * quantity;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Q1
//        int originalAmount = sc.nextInt();
//        double discountPercentage = sc.nextDouble();
//        double serviceChargePercentage = sc.nextDouble();
//
//        double discount = originalAmount * discountPercentage / 100.0;
//
//        double amountAfterDiscount = originalAmount - discount;
//
//        double serviceCharge =
//                amountAfterDiscount * serviceChargePercentage / 100.0;
//
//        double finalAmount = amountAfterDiscount + serviceCharge;
//
//        System.out.printf("%.2f%n", finalAmount);
// Q2
//        int n = sc.nextInt();
//        int[] arr=new int [n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        int sum=0;
//        for (int i = 0; i < n; i++) {
//            min=Math.min(min,arr[i]);
//            max=Math.max(max,arr[i]);
//            sum+=arr[i];
//        }
//        int average=sum/n;
//        int diff=max-min;
//        System.out.println(sum);
//        System.out.println(average);
//        System.out.println(diff);
        // Q4
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        double[] arr2 = new double[n];
//        for (int i = 0; i < n; i++) {
//            arr2[i]=arr[i]*1000;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr2[i]+" ");
//        }
        //Q5 Input values
//        int productId = Integer.parseInt(sc.nextLine());
//        double price = Double.parseDouble(sc.nextLine());
//        int quantity = Integer.parseInt(sc.nextLine());
//
//        // Create Product object
//        Product product = new Product(productId, price, quantity);
//
//        // Calculate and print total value rounded to 2 decimal places
//        System.out.printf("%.2f", product.calculateValue());
//Q6
                int n = sc.nextInt();
                int[] arr = new int[n];

                // Input array
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                // Separate even and odd
                int[] even = new int[n];
                int[] odd = new int[n];
                int eCount = 0, oCount = 0;

                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        even[eCount++] = arr[i];
                    } else {
                        odd[oCount++] = arr[i];
                    }
                }

                // Merge even and odd into ans
                int[] ans = new int[eCount + oCount];
                int idx = 0;

                for (int i = 0; i < eCount; i++) {
                    ans[idx++] = even[i];
                }
                for (int i = 0; i < oCount; i++) {
                    ans[idx++] = odd[i];
                }

                // Print original array
                System.out.print("Original: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

                // Print merged array
                System.out.print("Merged (Even + Odd): ");
                for (int i = 0; i < ans.length; i++) {
                    System.out.print(ans[i] + " ");
                }






        sc.close();
    }
}