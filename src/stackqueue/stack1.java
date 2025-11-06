package stackqueue;

import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class stack1{
    private int arr[];
    private int top;
    private int capacity;

    public stack1(int size){
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int x){
        if(top == capacity -1){
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed "+arr[top]);
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println("Popped "+arr[top]);
        return arr[top--];
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int size = sc.nextInt();
        stack1 stack = new stack1(size);

        int choice;
        do{
            System.out.println("\nStsck Operations Menu: ");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    System.out.println("Existing...");
                    break;

                default:
                    System.out.println("Invalid choice!" );
            }
        }while(choice !=3);
        sc.close();
    }
}