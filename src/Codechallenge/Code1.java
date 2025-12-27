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
}

