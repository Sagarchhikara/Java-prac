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
// to find a weather a number is prime or not
    public static void primeornot(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }

}
