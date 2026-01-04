package Linkedlists;

public class doublelikedlist {
    Node head;

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int data) {
        Node node = new Node(data);
        Node last = head;
        node.next=null;
        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last=last.next;
        }
        last.next = node;
        node.prev=last;
    }
    

    public void display(){
        Node node = head;
        Node last=null;
    while( node!=null){
        System.out.print(node.val+"-->");
        last=node;
        node=node.next;
    }
    System.out.println("END");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
// Implementation of Doubly inlked lists
class DoublyLinkedList {

    // Node class for DLL
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at a specific position (1-based index)
    public void insertAtPosition(int data, int position) {
        if (position <= 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            insertAtEnd(data);
            return;
        }

        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        newNode.prev = temp;
        temp.next = newNode;
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Delete at end
    public void deleteAtEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Delete at specific position (1-based index)
    public void deleteAtPosition(int position) {
        if (head == null) return;

        if (position == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position; i++) {
            temp = temp.next;
        }

        if (temp == null) return;  // position out of bounds

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
//
//        if (temp.prev != null) {
//            temp.prev.next = temp.next;
//        }
    }

    // Forward traversal
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ↦ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Backward traversal
    public void displayBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ↤ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Search an element
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // Reverse the DLL
    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }
}
