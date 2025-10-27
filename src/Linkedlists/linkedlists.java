package Linkedlists;

public class linkedlists {
    private Node head;
    private Node tail;
    private int size;

    public linkedlists() {
        this.size = 0;
    }
    public void insert(int value) {
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int vale, Node next) {
            this.value = vale;
            this.next = next;
        }}
        public void insertlast(int value){
            if(tail==null){
                insert(value);
                return;
            }
            Node node=new Node(value);
            tail.next=node;
            tail=node;
            size++;

        }
        public void insertinbetween(int value,int index){

        }

    }



import java.util.Scanner;
import java.util.*;

// Do NOT change the class name
class Node {
    int data;
    Node next;
    
    // Constructor should be inside the Node class
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    Node head;
    
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "\t"); // Fixed missing + operator
            current = current.next;
        }
        System.out.println(); // Fixed missing semicolon
    }
    
    public static void main(String args[]) {
        Main list = new Main(); // Should be Main, not LinkedList
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.traverse();
    }
}