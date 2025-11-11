package stackqueue;

import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class stack1{
    static int SIZE=10;
    static  int[] front=-1;
    static int rear=-1;
    static int array[]=new int[SIZE];
    // method to add item to the queue
    void enqueue(int item){
        if(rear==SIZE-1){
            System.out.println("Queue is full");
            return;
        }
        if(front ==-1){
            front=rear=0;
        }
        else
            rear++;
        array[rear]=item;
        System.out.println(item+"enqueued to queque");
    }


}
