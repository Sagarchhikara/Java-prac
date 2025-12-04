package stackqueue;

public class customQueue {
//    private int[] data;
//
//    private static final int DEFAULT_SIZE = 10;
//
//    int end = 0;
//
//    public customQueue(){
//        this(DEFAULT_SIZE);
//    }
//
//    public customQueue(int size) {
//        this.data = new int[size];
//    }
//
//    public boolean isFull() {
//        return end == data.length; // ptr is at last index
//    }
//
//    public boolean isEmpty() {
//        return end == 0;
//    }
//
//    public boolean insert(int item) {
//        if (isFull()) {
//            return false;
//        }
//        data[end++] = item;
//        return true;
//    }
//
//    public int remove() throws Exception {
//        if (isEmpty()) {
//            throw new Exception("Queue is empty");
//        }
//
//        int removed = data[0];
//
//        // shift the elements to left
//        for (int i = 1; i < end; i++) {
//            data[i-1] = data[i];
//        }
//        end--;
//        return removed;
//    }
//
//    public int front() throws Exception{
//        if (isEmpty()) {
//            throw new Exception("Queue is empty");
//        }
//        return data[0];
//    }
//    public void display() {
//        for (int i = 0; i < end; i++) {
//            System.out.print(data[i] + "-->");
//        }
//        System.out.println("ILoveYou:)");
//    }
private int maxSize;
    private int[] queue;
    private int front;
    private int rear;

    public customQueue(int size) {
        this.maxSize = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        queue[++rear] = value;
        System.out.println(value + " enqueued.");
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        return queue[front++];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue Elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
//    // Array queue tested and code
//import java.util.Scanner;
//
//// Queue using arrays
//class ArrayQueue {
//    private int front;
//    private int rear;
//    private int[] queue;
//    private int maxsize;
//
//    public ArrayQueue(int size) {
//        this.maxsize = size;
//        this.queue = new int[size];
//        this.front = 0;
//        this.rear = -1;
//    }
//
//    public void enqueue(int value) {
//        if (rear == maxsize - 1) {
//            System.out.println("Queue is Full!");
//            return;
//        }
//        queue[++rear] = value;
//        System.out.println("Enqueued " + value); // Fixed: Added space
//    }
//
//    public int dequeue() {
//        if (isEmpty()) { // Fixed: Use isEmpty() method instead of rear>front
//            System.out.println("Queue is Empty!");
//            return -1;
//        }
//        int value = queue[front++];
//        System.out.println("Dequeued " + value); // Added: Print dequeued value
//        return value;
//    }
//
//    public boolean isEmpty() {
//        return front > rear;
//    }
//
//    public boolean isFull() {
//        return rear == maxsize - 1;
//    }
//
//    public void display() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty!");
//            return;
//        }
//        System.out.print("Queue Elements: ");
//        for (int i = front; i <= rear; i++) {
//            System.out.print(queue[i] + " ");
//        }
//        System.out.println();
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Testing ArrayQueue with size 3");
//        ArrayQueue queue = new ArrayQueue(3);
//
//        // Test 1: Check initial state
//        System.out.println("\n--- Test 1: Initial State ---");
//        queue.display();
//        System.out.println("Is Empty: " + queue.isEmpty());
//        System.out.println("Is Full: " + queue.isFull());
//
//        // Test 2: Enqueue elements
//        System.out.println("\n--- Test 2: Enqueue Elements ---");
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40); // Should show "Queue is Full!"
//
//        // Test 3: Check state after enqueues
//        System.out.println("\n--- Test 3: After Enqueues ---");
//        queue.display();
//        System.out.println("Is Empty: " + queue.isEmpty());
//        System.out.println("Is Full: " + queue.isFull());
//
//        // Test 4: Dequeue elements
//        System.out.println("\n--- Test 4: Dequeue Elements ---");
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue(); // Should show "Queue is Empty!"
//
//        // Test 5: Check state after dequeues
//        System.out.println("\n--- Test 5: After Dequeues ---");
//        queue.display();
//        System.out.println("Is Empty: " + queue.isEmpty());
//        System.out.println("Is Full: " + queue.isFull());
//
//        // Test 6: Interleaved enqueue and dequeue
//        System.out.println("\n--- Test 6: Interleaved Operations ---");
//        queue.enqueue(100);
//        queue.enqueue(200);
//        queue.dequeue();
//        queue.enqueue(300);
//        queue.display();
//
//        // Test 7: Multiple operations with display
//        System.out.println("\n--- Test 7: Multiple Operations ---");
//        queue.enqueue(400);
//        queue.display();
//        queue.dequeue();
//        queue.dequeue();
//        queue.display();
//        queue.enqueue(500);
//        queue.enqueue(600);
//        queue.display();
//
//        //     // Test 8: Interactive testing
//        //     System.out.println("\n--- Test 8: Interactive Testing ---");
//        //     int choice;
//        //     do {
//        //         System.out.println("\nQueue Operations:");
//        //         System.out.println("1. Enqueue");
//        //         System.out.println("2. Dequeue");
//        //         System.out.println("3. Display");
//        //         System.out.println("4. Check Empty");
//        //         System.out.println("5. Check Full");
//        //         System.out.println("6. Exit");
//        //         System.out.print("Enter your choice: ");
//        //         choice = scanner.nextInt();
//
//        //         switch (choice) {
//        //             case 1:
//        //                 System.out.print("Enter value to enqueue: ");
//        //                 int value = scanner.nextInt();
//        //                 queue.enqueue(value);
//        //                 break;
//        //             case 2:
//        //                 queue.dequeue();
//        //                 break;
//        //             case 3:
//        //                 queue.display();
//        //                 break;
//        //             case 4:
//        //                 System.out.println("Is Empty: " + queue.isEmpty());
//        //                 break;
//        //             case 5:
//        //                 System.out.println("Is Full: " + queue.isFull());
//        //                 break;
//        //             case 6:
//        //                 System.out.println("Exiting...");
//        //                 break;
//        //             default:
//        //                 System.out.println("Invalid choice!");
//        //         }
//        //     } while (choice != 6);
//
//        //     scanner.close();
//    }
//}

