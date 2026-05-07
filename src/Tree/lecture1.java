package Tree;


import java.util.Scanner;

public class lecture1 {
     private static class Node{
        int value;
        Node  left;
        Node  right;
        public Node(int data){
            this.value= value;
        }
    }
    private Node root;
    //insert elements
    public void populate(Scanner sc){
        System.out.println("Enter the value of root node");
        int data = sc.nextInt();
        root = new Node(data);
        populate( sc,root);
    }
    private void populate(Scanner sc,Node node){
        System.out.println("Do you want to enter left of "+node.value+"?");
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of "+node.value);
            int data = sc.nextInt();
            node.left = new Node(data);
            populate(sc,node.left);
        }
    }

}
