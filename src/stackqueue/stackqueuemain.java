package stackqueue;

public class stackqueuemain {
    public static void main(String[] args) {
        customStack stack = new customStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.peek();
    }
}
