package Linkedlists;

public class linkedlists {
    private Node head;
    private Node tail;
    private int size;

    public linkedlists() {
        this.size = 0;
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
        }
    }
}


