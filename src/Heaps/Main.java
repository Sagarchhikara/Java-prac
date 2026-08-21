package Heaps;

public class Main {
    public static void main(String[] args) throws  Exception{
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(42);
        heap.insert(30);
        heap.insert(65);
        heap.insert(89);
        heap.insert(76);
        System.out.println(heap.remove());
    }
}
