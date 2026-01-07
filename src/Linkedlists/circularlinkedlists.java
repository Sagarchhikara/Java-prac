package Linkedlists;

public class circularlinkedlists {


        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head = null;

        // Insert at beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }

            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }

        // Insert at end
//        public void insertAtEnd(int data) {
//            Node newNode = new Node(data);
//
//            if (head == null) {
//                head = newNode;
//                newNode.next = head;
//                return;
//            }
//
//            Node temp = head;
//            while (temp.next != head) {
//                temp = temp.next;
//            }
//
//            temp.next = newNode;
//            newNode.next = head;
//        }
//
//        // Delete at beginning
//        public void deleteAtBeginning() {
//            if (head == null) return;
//
//            if (head.next == head) {
//                head = null;
//                return;
//            }
//
//            Node temp = head;
//            while (temp.next != head) {
//                temp = temp.next;
//            }
//
//            head = head.next;
//            temp.next = head;
//        }
//
//        // Delete at end
//        public void deleteAtEnd() {
//            if (head == null) return;
//
//            if (head.next == head) {
//                head = null;
//                return;
//            }
//
//            Node temp = head;
//            Node prev = null;
//
//            while (temp.next != head) {
//                prev = temp;
//                temp = temp.next;
//            }
//
//            prev.next = head;
//        }
//
//        // Delete by value
//        public void deleteByValue(int val) {
//            if (head == null) return;
//
//            // Case: single node
//            if (head.data == val && head.next == head) {
//                head = null;
//                return;
//            }
//
//            Node curr = head, prev = null;
//
//            do {
//                if (curr.data == val) {
//                    if (prev == null) {
//                        deleteAtBeginning();
//                    } else {
//                        prev.next = curr.next;
//                    }
//                    return;
//                }
//                prev = curr;
//                curr = curr.next;
//            } while (curr != head);
//        }
//
//        // Search
//        public boolean search(int key) {
//            if (head == null) return false;
//
//            Node temp = head;
//            do {
//                if (temp.data == key) return true;
//                temp = temp.next;
//            } while (temp != head);
//
//            return false;
//        }
//
//        // Traversal
//        public void display() {
//            if (head == null) {
//                System.out.println("List is empty!");
//                return;
//            }
//
//            Node temp = head;
//            System.out.print("CLL: ");
//
//            do {
//                System.out.print(temp.data + " → ");
//                temp = temp.next;
//            } while (temp != head);
//
//            System.out.println("(back to head)");
//        }
//    }


