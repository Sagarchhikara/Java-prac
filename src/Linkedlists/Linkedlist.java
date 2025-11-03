package Linkedlists;

public class Linkedlist {
    Node head;
    Node tail;
    int size;
    public Linkedlist() {
        head = null;
        tail = null;
        this.size = 0;

    }

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;

        }
    }
    public void insertFirst(int value) {
        Node newNode= new Node(value);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=newNode;
        }
        size++;
    }
    public void insertLast(int value) {
        Node newNode= new Node(value);
        if(tail==null){
            insertFirst(value);
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public  void insert(int value,int index) {
        if(index==0){
            insertFirst(value);
            return;
        }
        else if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        
    }
    public void display() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }



}