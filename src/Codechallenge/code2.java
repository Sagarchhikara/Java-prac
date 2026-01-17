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
    // move the smallest to first  and lrgest to last
    static Node shiftSmallLarge(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node smallest = head;
        Node largest = head;
        Node prevSmallest = null;
        Node prevLargest = null;
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            if (curr.data < smallest.data) {
                smallest = curr;
                prevSmallest = prev;
            }
            if (curr.data >= largest.data) {
                largest = curr;
                prevLargest = prev;
            }
            prev = curr;
            curr = curr.next;
        }
        if (prevSmallest == null && largest.next == null) {
            return head;
        }
        if (prevSmallest != null) {
            if (smallest == largest) {
                largest = prevSmallest;
                prevLargest = prevSmallest;
            }
            prevSmallest.next = smallest.next;
            smallest.next = head;
            head = smallest;
        }
        if (largest.next != null) {
            curr = head;
            prev = null;
            while (curr != largest) {
                prev = curr;
                curr = curr.next;
            }
            if (prev != null) {
                prev.next = largest.next;
            } else {
                head = largest.next;
            }
            curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = largest;
            largest.next = null;
        }
        return head;
    }


}
