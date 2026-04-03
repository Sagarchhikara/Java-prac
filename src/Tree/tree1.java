package Tree;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class tree1 {
    
    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // ✅ Pre-order: Root → Left → Right
    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // ✅ Search: returns true if key found in tree
    static boolean search(Node root, int key) {
        if (root == null) return false;          // Base case: not found
        if (root.data == key) return true;       // Found!
        // Search in left subtree, if not found then search right
        return search(root.left, key) || search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left        = new Node(20);
        root.right       = new Node(30);
        root.left.left   = new Node(40);
        root.left.right  = new Node(50);
        root.right.left  = new Node(60);
        root.right.right = new Node(70);

        System.out.print("Pre-order  : ");
        preOrder(root);
        System.out.println();

        System.out.print("Post-order : ");
        postOrder(root);
        System.out.println();

        // Search
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter value to search: ");
        int key = sc.nextInt();

        if (search(root, key)) {
            System.out.println(key + " FOUND in the tree ✓");
        } else {
            System.out.println(key + " NOT FOUND in the tree ✗");
        }
    }
}