package stackqueue;

import  java.util.*;
public class inbuilteg {
    public static void main(String[] args){
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(10);
        stack.push(12);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        Queue<Integer> queue= new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(6);
        queue.add(9);
        System.out.println(queue.peek());

    }
}

