package recursion;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }
        //recursive call
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }

    static boolean linersearch(int[] arr, int taget, int index) {
        if (index == arr.length -1) {
            return false;
        }
        return arr[index] == taget || linersearch(arr, taget, index + 1);
    }

    static int findindex(int[] arr, int taget, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == taget) {
            return index;
        }

        return findindex(arr, taget, index + 1);
    }
}
