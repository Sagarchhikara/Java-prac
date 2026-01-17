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
    static Node reverse(Node head) {
        Node curr = head, prev = null;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static int checkPalindrome(Node head) {
        if(head == null || head.next == null) return 1;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow);
        Node temp1 = head;
        Node temp2 = secondHalf;
        while(temp2 != null) {
            if(temp1.data != temp2.data) return 0;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return 1;
    }


}
