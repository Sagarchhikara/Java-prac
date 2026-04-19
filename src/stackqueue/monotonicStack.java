package stackqueue;
import java.util.*;
public class monotonicStack {
    public int[] nextGreaterElements2(int[] arr) {

        int n = arr.length;
        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        // Preload stack for circular behavior
        for (int i = n - 1; i >= 0; i--) {
            st.push(arr[i]);
        }

        // Process elements
        for (int i = n - 1; i >= 0; i--) {

            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0) nge[i] = -1;
            else nge[i] = st.peek();

            st.push(arr[i]);
        }

        return nge;
    }
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ng = new HashMap<>();
        Deque<Integer> st = new ArrayDeque<>();

        for (int num : nums2) {
            while (!st.isEmpty() && st.peek() < num) {
                ng.put(st.pop(), num);
            }
            st.push(num);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = ng.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}
