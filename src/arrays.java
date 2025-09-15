import java.util.Arrays;

public class arrays {

    // Method that just returns the 2-D array so we can test it
    public static int[][] fillArray(int[][] input) {
        // (Here you’d normally fill it; for testing we just echo it)
        return input;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        // existing Scanner code can stay here if you want interactive input
    }
}

