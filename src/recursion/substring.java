package recursion;

public class substring {
    public static void main(String[] args) {
        String s="abc";
        subsequence(s,0,"");
    }
    public static void subsequence(String s, int index, String newString){
        if(index==s.length()){
            System.out.println(newString);
            return ;
        }
        // include
        subsequence(s, index+1, newString+s.charAt(index));
        // exclude
        subsequence(s, index+1, newString);
    }
}
