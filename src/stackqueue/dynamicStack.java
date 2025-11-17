package stackqueue;

public class dynamicStack extends customStack{
    public dynamicStack(int size){
        super(size);
    }
    public dynamicStack(){
        super();
    }
//    @Override
//    public boolean push(int item){
//        if(this.isFull()){
//            int[] temp = new int [data.length*2];
//            for (int i = 0; i <data.length; i++) {
//                temp[i] = data[i];
//
//            }
//            data=temp;
//        }
//
//    }
}
