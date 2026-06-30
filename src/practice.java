import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;
        while (n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;

        }
        System.out.println(sum);
        evennumber();
        printtable();
    }
    public  static  void evennumber(){
        for(int i=2;i<=20;i+=2){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void printtable(){
        for (int i=1;i<=10;i++){
            System.out.println("2 * "+i+" = "+(2*i));
        }
    }
}
