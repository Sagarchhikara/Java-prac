//package recursion;
//import java.util.*;
//import java.awt.*;
//
//public class Lexigraph {
//    // function to generate lexicographical numbers upto n
//    public static List<Integer> lexicalOrder(int n) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 1; i <= 9; i++) {
//            dfs(i, n, result);
//        }
//        return result;
//    }
//    public static void  df(int current, int n, List<Integer> result) {
//        if (current > n) {
//            return;
//        }
//        result.add(current);
//        for (int i = 0; i <= 9; i++) {
//            int next = current * 10 + i;
//            if (next > n) {
//                break;
//            }
//            dfs(next, n, result);
//        }
//    }
//}
