package Linkedlists;

public class middleLinkedlists {
    public static class Linkedlist {
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
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            size++;
        }

        public int findMiddle() {
            if (head == null) {
                throw new IllegalStateException("List is empty");
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next; // Move slow by 1
                fast = fast.next.next;
            }

            return slow.value;
        }
    }

    public static void main(String[] args) {
        Linkedlist newList = new Linkedlist();
        newList.insertFirst(1);
        newList.insertFirst(2);
        newList.insertFirst(3);
        newList.insertFirst(4);
        newList.insertFirst(5);
        System.out.println("Middle element: " + newList.findMiddle());
    }
}
