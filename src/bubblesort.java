import java.util.*;
public class bubblesort {
    public  static  void printsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(){
        int[] arr={1,12,4,6,87,3,2,9,};
        //bubblesort
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[j] > arr[j+1]) {
                    int tempt=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tempt;

                }

            }

        }
        printsort(arr);
    }
}
