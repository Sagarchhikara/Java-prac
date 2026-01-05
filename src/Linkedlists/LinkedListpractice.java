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
//    public static Node findNLast(Node head, int n) {
//        if (head == null) return null ;
//        Node temp = head;
//        int count = 0;
//        while (temp.next != null) {
//            temp = temp.next;
//            count++;
//        }
//        int x= count - n;
//        for (int i = 0; i < x; i++) {
//            temp = temp.next;
//        }
//        return temp;
//    }

}
