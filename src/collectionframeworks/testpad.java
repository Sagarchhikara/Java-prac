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
}
