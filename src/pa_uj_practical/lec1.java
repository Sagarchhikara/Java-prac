package pa_uj_practical;

public class lec1 {
    // Typecasting in Java
    // Typecasting is a way through which we can convert one data type to another

    public static void main(String[] args) {
        System.out.println("=== TYPECASTING DEMONSTRATION ===\n");

        // 1. IMPLICIT TYPECASTING (Widening Conversion)
        // Automatically converts smaller data type to larger data type
        System.out.println("1. IMPLICIT TYPECASTING (Widening Conversion):");
        int intValue = 100;
        long longValue = intValue;  // int to long
        float floatValue = intValue;  // int to float
        double doubleValue = intValue;  // int to double

        System.out.println("   int value: " + intValue);
        System.out.println("   Converted to long: " + longValue);
        System.out.println("   Converted to float: " + floatValue);
        System.out.println("   Converted to double: " + doubleValue);

        // 2. EXPLICIT TYPECASTING (Narrowing Conversion)
        // Manually converts larger data type to smaller data type
        System.out.println("\n2. EXPLICIT TYPECASTING (Narrowing Conversion):");
        double doubleNum = 9.78;
        int intNum = (int) doubleNum;  // double to int (loses decimal part)
        float floatNum = (float) doubleNum;  // double to float

        System.out.println("   double value: " + doubleNum);
        System.out.println("   Converted to int: " + intNum);
        System.out.println("   Converted to float: " + floatNum);

        // 3. CHARACTER AND NUMERIC CONVERSION
        System.out.println("\n3. CHARACTER AND NUMERIC CONVERSION:");
        char charValue = 'A';
        int asciiValue = charValue;  // char to int (implicit)
        System.out.println("   char value: " + charValue);
        System.out.println("   ASCII value: " + asciiValue);

        int numericValue = 66;
        char convertedChar = (char) numericValue;  // int to char (explicit)
        System.out.println("   Numeric value: " + numericValue);
        System.out.println("   Converted to char: " + convertedChar);

        // 4. STRING TO NUMBER CONVERSION
        System.out.println("\n4. STRING TO NUMBER CONVERSION:");
        String stringInt = "123";
        String stringDouble = "45.67";

        int parsedInt = Integer.parseInt(stringInt);
        double parsedDouble = Double.parseDouble(stringDouble);

        System.out.println("   String value: " + stringInt + " -> Converted to int: " + parsedInt);
        System.out.println("   String value: " + stringDouble + " -> Converted to double: " + parsedDouble);

        // 5. NUMBER TO STRING CONVERSION
        System.out.println("\n5. NUMBER TO STRING CONVERSION:");
        int numberToString = 789;
        double doubleToString = 12.34;

        String convertedString1 = String.valueOf(numberToString);
        String convertedString2 = String.valueOf(doubleToString);
        String convertedString3 = Integer.toString(numberToString);

        System.out.println("   int value: " + numberToString + " -> String: " + convertedString1);
        System.out.println("   double value: " + doubleToString + " -> String: " + convertedString2);
        System.out.println("   int value (using toString): " + numberToString + " -> String: " + convertedString3);

        // 6. BOOLEAN CONVERSION (Cannot directly typecast)
        System.out.println("\n6. BOOLEAN CONVERSION:");
        System.out.println("   Note: boolean cannot be directly typecast to/from other types");
        System.out.println("   Must use conditional logic or custom conversion methods");

        // 7. LOSS OF DATA EXAMPLE
        System.out.println("\n7. LOSS OF DATA (Narrowing Conversion Risk):");
        long largeNumber = 500000L;
        int smallerInt = (int) largeNumber;
        System.out.println("   long value: " + largeNumber);
        System.out.println("   Converted to int: " + smallerInt);

        long outOfRange = 3000000000L;  // Greater than Integer.MAX_VALUE
        int convertedOutOfRange = (int) outOfRange;
        System.out.println("   long value (out of range): " + outOfRange);
        System.out.println("   Converted to int: " + convertedOutOfRange + " (data loss!)");
    }

    // Helper method to demonstrate typecasting in method
    public void typecasting() {
        System.out.













































































































































                println("Method showing various typecasting examples...");
    }
}