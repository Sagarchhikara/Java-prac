package Linkedlists;

public class Main {
    public static void main(String[] args) {
        Linkedlist list= new Linkedlist();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertLast(100);
//        list.insert(12,3);
        list.deleteFirst();
        list.display();
    }
}
