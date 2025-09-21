import java.util.Arrays;



public class swap {
    public static void main(String[] args) {
        int [] arr={1,23,45,78};
        swapping(arr,0,3);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }

     static void swapping(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

}
