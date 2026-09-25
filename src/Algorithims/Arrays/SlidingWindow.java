package Algorithims.Arrays;

public class SlidingWindow {
    // maximum subarray
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int right = k; right < n; right++) {
            windowSum = windowSum + arr[right] - arr[right - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
