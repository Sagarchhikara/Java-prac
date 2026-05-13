package Tree;
import java.util.*;
public class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    private Node root;
    public BST() {

    }
    public void insert(int value) {
        root=insert(value,root);
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void display(){
        display(root,"Root Node:");
    }
    public void display(Node node,String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left Child of "+node.getValue()+":");
        display(node.right,"Right Child of "+node.getValue()+":");
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
    public Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right)) + 1;
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public  void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length-1);
    }
    public void populateSorted(int[] nums,int low,int high){
        if(low<high){
            return;

        }
        int mid = (low+high)/2;
        this.insert(nums[mid]);
        this.populateSorted(nums,low,mid-1);
        this.populateSorted(nums,mid+1,high);
    }

    public void populate(Node node){}
    public static void main(String[] args) {
        BST tree = new BST();
        tree.populate(new int[]{10,5,15,3,7,12,18});
        tree.display();
        tree.prettyDisplay(tree.root,"--",true);
    }

}