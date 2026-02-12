package stackqueue;

public class stack1 {
    class arraystack {
    private int top;
    private int[] stack;
    private int maxsize;

    public arraystack(int size) {
        this.top = -1;
        this.stack = new int[size];
        this.maxsize = size; // Fixed: Assign parameter 'size' to 'maxsize'
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxsize - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return; // Added: Exit after overflow message
        }
        stack[++top] = value;
        System.out.println(value + " is pushed"); // Fixed: Added space in message
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int value = stack[top--]; // Fixed: Store value before decrementing top
        System.out.println(value + " is popped"); // Added: Print popped value
        return value;
    }

    public int peek() {
        if (isEmpty()) { // Fixed: Added parentheses for method call
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public void display() {
        if (isEmpty()) { // Fixed: Use isEmpty() method
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack Elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
}
