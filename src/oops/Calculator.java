package oops;

public class Calculator {

        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, double b) {
            return a + b;
        }

        public static void main(String[] args) {

            Calculator obj = new Calculator();

            System.out.println(obj.add(2,3));      // calls first method
            System.out.println(obj.add(2,3,4));    // calls second method
            System.out.println(obj.add(2.5,3.5));  // calls third method
        }
    }

