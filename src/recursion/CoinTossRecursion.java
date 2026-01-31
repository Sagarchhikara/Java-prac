package recursion;
import java.util.ArrayList;
import java.util.List;

public class CoinTossRecursion {

    public static void generateOutcomes(int n, String currentOutcome, List<String> allOutcomes) {
        if (n == 0) {
            allOutcomes.add(currentOutcome);
            return;
        }

        generateOutcomes(n - 1, currentOutcome + "H", allOutcomes); // Append Heads
        generateOutcomes(n - 1, currentOutcome + "T", allOutcomes); // Append Tails
    }
    public static void main(String[] args) {
        int numFlips = 3; // Example: Flip the coin 3 times
        List<String> outcomesList = new ArrayList<>();

        System.out.println("Generating all outcomes for " + numFlips + " coin flips using recursion:");
        generateOutcomes(numFlips, "", outcomesList);

        // Print the results
        for (String outcome : outcomesList) {
            System.out.println(outcome);
        }

        System.out.println("\nTotal number of outcomes: " + outcomesList.size());
    }
}