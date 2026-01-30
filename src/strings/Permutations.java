package strings;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.hasNextLine() ? sc.nextLine() : "";
        if (s.isEmpty()) {
            System.out.println("Empty string provided. Nothing to permute.");
            sc.close();
            return;
        }

        List<String> result = new ArrayList<>();
        permute(s.toCharArray(), 0, result);

        System.out.println("Permutations (" + result.size() + "):");
        for (String p : result) {
            System.out.println(p);
        }
        sc.close();
    }

    // Recursive backtracking that generates permutations by swapping in-place.
    static void permute(char[] arr, int index, List<String> res) {
        if (index == arr.length - 1) {
            res.add(new String(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, res);
            swap(arr, index, i); // backtrack
        }
    }

    static void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
