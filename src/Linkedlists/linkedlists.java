package Linkedlists;

// Linkedlists.Node class for custom linked list
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Custom LinkedList class
class CustomLinkedList<T> {
    private Node<T> head;

    public CustomLinkedList() {
        this.head = null;
    }

    // Add element to the end
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method 1: Traverse using while loop
    public void traverse() {
        System.out.println("Traversing linked list:");
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method 2: Recursive traversal
    public void traverseRecursive() {
        System.out.println("Recursive traversal:");
        traverseRecursiveHelper(head);
        System.out.println("null");
    }

    private void traverseRecursiveHelper(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        traverseRecursiveHelper(node.next);
    }

    // Method 3: Traverse and return as string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }

    // Method 4: Traverse with index positions
    public void traverseWithIndex() {
        System.out.println("Traversal with indices:");
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            System.out.println("Index " + index + ": " + current.data);
            current = current.next;
            index++;
        }
    }
}

// Main class to test custom linked list
public class linkedlists {
    public static void main(String[] args) {
        CustomLinkedList<Integer> customList = new CustomLinkedList<>();

        // Add elements
        customList.add(10);
        customList.add(20);
        customList.add(30);
        customList.add(40);

        // Different traversal methods
        customList.traverse();
        customList.traverseRecursive();
        customList.traverseWithIndex();

        System.out.println("String representation: " + customList.toString());
    }
}