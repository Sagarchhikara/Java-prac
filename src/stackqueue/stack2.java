package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack2 {
    public  static  void main(String[] args){
//        Stack<Integer> stack=new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
       // Queue in java
        Queue<Integer> queue= new LinkedList<>();
        queue.add(3);
        queue.add(23);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
