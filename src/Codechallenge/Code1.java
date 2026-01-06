package Codechallenge;
import java.util.*;
public class Code1 {
    // Caser Cypher Script-- the alphabets are shifted by key value rotate the elemts also the method should only shift in alpbatical characters
    public static String decipher(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                // Reverse the shift (deciphering)
                char shiftedChar = (char) ((character - base - shift + 26) % 26 + base);
                result.append(shiftedChar);
            } else {
                // Keep non-letter characters unchanged
                result.append(character);
            }
        }

        return result.toString();
    }
    // Question1: Family photo graph
    public static void familyphoto(int[] arr, int n) {
        // Handle edge cases
        if (arr == null || n <= 0 || n > arr.length) {
            System.out.println("Invalid input parameters");
            return;
        }

        int start = 0;
        int end = start + n - 1;

        // Process all segments of size n
        while (start < arr.length) {
            // Adjust end if it exceeds array bounds
            if (end >= arr.length) {
                end = arr.length - 1;
            }

            // Sort the current segment using bubble sort
            for (int i = start; i <= end; i++) {
                for (int j = start + 1; j <= end - (i - start); j++) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                }
            }

            // Move to next segment
            start += n;
            end += n;
        }
    }
//    public static void reverseGroups(int[] arr, int k) {
//        int n = arr.length;
//
//        // Process each group of size k
//        for (int i = 0; i < n; i += k) {
//            int left = i;
//            // For last group, check if it has fewer than k elements
//            int right = Math.min(i + k - 1, n - 1);
//
//            // Reverse the current group
//            while (left < right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//        }
//    }
    // Q2 -Airline baggage
    public static int airlinebaggage(int[] ids){
        if(ids.length==0){
            return 0;
        }
        Arrays.sort(ids);
        int unique=1;
        for (int i = 1; i < ids.length; i++) {
            if(ids[i]!=ids[i-1]){
                unique++;
            }

        }
        return unique;
    }
    // next smallest element
//    static int[] nextSmaller(int[] demand) {
//        int n = demand.length;
//        int[] result = new int[n];
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = n - 1; i >= 0; i--) {
//
//            while (!stack.isEmpty() && stack.peek() >= demand[i]) {
//                stack.pop();
//            }
//
//            result[i] = stack.isEmpty() ? -1 : stack.peek();
//            stack.push(demand[i]);
//        }
//        return result;
//    }
//    static void countFrequency(String s) {
//        int[] freq = new int[26];
//
//        // Count frequencies
//        for (char ch : s.toCharArray()) {
//            freq[ch - 'a']++;
//        }
//
//        // Print in sorted order
//        for (int i = 0; i < 26; i++) {
//            if (freq[i] > 0) {
//                System.out.print((char) (i + 'a') + "" + freq[i]);
//            }
//        }
//    }


}

