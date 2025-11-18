package stackqueue;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    private boolean isFull(){
        return ptr==data.length-1;
    };
    private boolean isEmpty(){
        return ptr==-1;
    }

    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
       this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;

        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[ptr];
    }
}
// Custom STack code with tested main
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
class Main{
    public static void main(String[] args) {
        System.out.println("Testing ArrayStack with size 3");
        arraystack stack = new arraystack(3);

        // Test 1: Check initial state
        System.out.println("\n--- Test 1: Initial State ---");
        stack.display();
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());

        // Test 2: Push elements
        System.out.println("\n--- Test 2: Pushing Elements ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // Should overflow

        // Test 3: Check state after pushes
        System.out.println("\n--- Test 3: After Pushing ---");
        stack.display();
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());
        System.out.println("Peek: " + stack.peek());

        // Test 4: Pop elements
        System.out.println("\n--- Test 4: Popping Elements ---");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Should underflow

        // Test 5: Check state after pops
        System.out.println("\n--- Test 5: After Popping ---");
        stack.display();
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());

        // Test 6: Interleaved push and pop
        System.out.println("\n--- Test 6: Interleaved Operations ---");
        stack.push(100);
        System.out.println("Peek: " + stack.peek());
        stack.pop();
        stack.push(200);
        stack.display();
    }
}