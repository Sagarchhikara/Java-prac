package BitManupulation;
import java.util.*;
public class bitAndORXor {
    public static void main(String[] args){
        System.out.println(51&42);
        System.out.println(51|42);
        System.out.println(countsetbits(5));

    }
    //  Write code to count the number of set bits in an integer n.
    public static int countsetbits(int n){
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return  count;
    }
}
