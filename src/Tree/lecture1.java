package Tree;


import java.util.Scanner;

public class lecture1 {
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    private Node root;

    //insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the value of root node");
        int data = sc.nextInt();
        root = new Node(data);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "?");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left of " + node.value);
            int data = sc.nextInt();
            node.left = new Node(data);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value + "?");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of " + node.value);
            int data = sc.nextInt();
            node.right = new Node(data);
            populate(sc, node.right);
        }
    }

    // Display the binary tree
    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public  void prettyDisplay() {
        prettyDisplay(this.root, "", true);
    }
     private void prettyDisplay(Node node, String indent, boolean last) {
        if (node != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }
            System.out.println(node.value);
            prettyDisplay(node.left, indent, false);
            prettyDisplay(node.right, indent, true);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lecture1 tree = new lecture1();
        tree.populate(sc);
        System.out.println("The binary tree is:");
        tree.display();
        System.out.println("Pretty display:");
        tree.prettyDisplay();
    }
}// ✓ Use the parameter 'data'