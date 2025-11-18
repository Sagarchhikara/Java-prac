package stackqueue;

public class ququemain {
    public static void main(String[] args) {
        customQueue queue=new customQueue();
        queue.insert(5);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);
        queue.display();
        System.out.println(queue.remove());
    }
}
