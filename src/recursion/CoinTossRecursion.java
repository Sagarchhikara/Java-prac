package recursion;
import java.util.ArrayList;
import java.util.List;

public class CoinTossRecursion {
    public static  void toss(String s,int n){
        if(n==0){
            System.out.println(s);
            return ;
        }
        toss(s+"H",n-1);
        toss(s+"T",n-1);
    }
    public static  void main(String[] args){
        int n=3;
        toss("",n);
    }
}
