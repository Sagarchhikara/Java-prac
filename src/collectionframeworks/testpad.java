package collectionframeworks;
import java.util.*;

public class testpad {
    static void doubleQueue(Queue<Integer> q)
    {
        int n=q.size();
        for(int i=0;i<n;i++){
            int x=q.remove();
            q.add(x);
            q.add(x);
        }


    }
    static void mirrorQueue(Queue<String> q)
    {
        Stack<String> s= new Stack<>();
        int n=q.size();
        for(int i=0;i<n;i++){
            String x=q.remove();
            s.push(x);
            q.add(x);
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    static int balancedString(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}') {
                if (stack.isEmpty()) {
                    return i;

                }
                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{')) {
                    return i;
                }
            }
        }
        if (!stack.isEmpty()) {
            return s.length();
        }

        return -1;
    }
}
