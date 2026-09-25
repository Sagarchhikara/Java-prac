package pa_uj_practical;
import java.io.*;
import java.util.Scanner;

public class fileHandling {
    public static void main(String args[])  throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DATA ");
        String data = sc.nextLine();
        FileWriter fw = new FileWriter("abc.txt");// if we use absolut path use double //
        fw.write(data);
        fw.close();
//        System.out.println("Saved data ");
//        System.out.println("name\tage\theight");
//        System.out.println("Amit\t25\t59");
//        System.out.println("Gopal\t32\t56");
//        System.out.println("Arun\t35\t60");
//        System.out.println("Naveen is 61");
//        System.out.println("The empty string is.");
//
//        System.out.println("a\tb\tc");
//        System.out.println("C:\nin\the downward spiral");
        System.out.println("Dear -Codequotient-,");
        System.out.println();
        System.out.println("\tYour courses are wonderful to me.  Isn't it");
        System.out.println("\nSincerely,");
        System.out.println("Gopal & Amit");

    }
}
