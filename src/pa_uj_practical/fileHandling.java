package pa_uj_practical;
import java.io.*;
import java.util.Scanner;

public class fileHandling {
    public static void main(String args[])  throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DATA ");
        String data = sc.nextLine();
        FileWriter fw = new FileWriter("abc.txt");
        fw.write(data);
        fw.close();
        System.out.println("Saved data ");
    }
}

