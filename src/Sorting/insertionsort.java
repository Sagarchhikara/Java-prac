package Sorting;

import static Sorting.swap.swapping;

public class insertionsort {
    public static void main(String[] args){

    }
    static void insertion(int[] arr){
        for(int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swapping(arr,j,j-1);
                }
                else{
                    break;
                }

            }

        }
    }

}
