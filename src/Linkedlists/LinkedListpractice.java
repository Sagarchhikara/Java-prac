package Linkedlists;

public class LinkedListpractice {
    class Node{
         int data;
         Node next,prev;

         Node(int data){
             this.data=data;
             this.next=null;
             this.prev=null;
         }
    }
     public void insertFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void insertEnd(int data){
        Node newNode= new Node(int data);
        if(head==null){
            head=newNode;
        }
    Node temp=head;
    while()
    }




}
 