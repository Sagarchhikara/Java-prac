package recursion;

public class Lexigraph {
    public static void main(String[] args) {
        String s = "1234";
        printLexicographical(s, "");
    }

    public static void printLexicographical(String s, String prefix) {
        if (s.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            printLexicographical(remaining, prefix + ch);
        }
    }
}
