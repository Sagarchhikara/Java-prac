package pa_uj_practical;
import java.io.*;
import java.util.Scanner;

public class fileHandling {
    public static void main(String args[]) {
        System.out.println("ENTER THE DATA ");
        try (Scanner sc = new Scanner(System.in);
             FileWriter fw = new FileWriter("abc.txt")) {

            String data = sc.nextLine();
            fw.write(data);
            System.out.println("Saved data ");
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}