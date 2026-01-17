package Codechallenge;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class code2 {

    // copy one list to another
   public static  Node copyList(Node head) {
        if (head == null) {
            return null;
        }
        Node L2 = new Node(head.data);
        Node tempOriginal = head.next;
        Node tempCopy = L2;
        while (tempOriginal != null) {
            Node newNode = new Node(tempOriginal.data);
            tempCopy.next = newNode;
            tempCopy = tempCopy.next;
            tempOriginal = tempOriginal.next;
        }
        return L2;
    }

}
