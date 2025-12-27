package Linkedlists;

public class LinkedListpractice {
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
//    public void insertEnd(int data){
//        Node newNode= new Node(int data);
//        if(head==null){
//            head=newNode;
//        }
//    Node temp=head;
//    while(temp!=head){
//        temp=temp.next;
//
//    }
//    temp.next=newNode;
//    newNode.prev=temp;
//    }
//    public void insertatPostion(int data;int index){
//        if(index<=1){
//            insertEnd(data);
//
//        }
//        Node newNode= new Node(data);
//        Node temp=head;
//        for(int i=0)
//
//    }
//
//
//
//
//}
    public static void main(String[] args)  {     // Main method must have a return type and the parameters are defined in parentheses after its declaration, like: (args). Here we don’t need any arguments for our program. The class name should be same as file's directory or package structure if it is inside another project/package then use full path of that otherwise just 'HelloWorld'.
        System.out.println("Hello World");      // Print statement to print the string "Hello world" on console screen using system out and printing method in java, which prints output into standard (usually) computer monitor or terminal window for a particular program/user interface like command line interfaces of operating systems such as Windows Command Prompts etc.
    }   // Ending curly braces {} is mandatory when we are writing the main function to make sure that this code will be executed at last and not before it, otherwise our system may throw error or exception due to unclosed block statement in java programming language which can't compile successfully if there isn’t a closing brace.
}  // Ending curly braces {} is mandatory when we are writing the main function to make sure that this code will be executed at last and not before it, otherwise our system may throw error or exception due to unclosed block statement in java programming language which can't compile successfully if there isn’t a closing brace.
```  // Ending curly braces {} is mandatory when we are writing the main function to make sure that this code will be executed at last and not before it, otherwise our system may throw error or exception due to unclosed block statement in java programming language which can't compile successfully if there isn’t a closing brace.
