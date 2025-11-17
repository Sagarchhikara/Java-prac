package stackqueue;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    private boolean isFull(){
        return ptr==data.length-1;
    };
    private boolean isEmpty(){
        return ptr==-1;
    }

    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
       this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;

        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[ptr];
    }



}
