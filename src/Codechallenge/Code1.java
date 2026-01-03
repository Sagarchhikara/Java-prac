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
    public  static void familyphoto(int[] arr,int n){
        int start=0;
        int end=start+n-1;
        for(int i=start;i<=end;i++){
            for(int j=start;j<=end;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            start+=n-1;
            end+=n-1;
        }
    }

}

