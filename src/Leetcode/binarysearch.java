package Leetcode;

public class binarysearch {
    public static void main(String[] args) {
    }
        // binary search questions
        // Q744 https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        public char nextGreatestLetter(char[] letters, char target) {
            int start =0;
            int end=letters.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<letters[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return letters[start%letters.length];
        }
        //Q34 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
        public int[] searchRange(int[] nums, int target) {

            int[] ans = {-1, -1};
            // check for first occurrence if target first
            ans[0] = search(nums, target, true);
            if (ans[0] != -1) {
                ans[1] = search(nums, target, false);
            }
            return ans;
        }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
// Q 852 https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Q 165
        public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // You are in decreasing part of array this may be the answwer bu tlook at left
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }
 //    https://leetcode.com/problems/find-in-mountain-array/description/

    class Solution {
        public int findInMountainArray(int target, MountainArray mountainArr) {
            int length = mountainArr.length();
            int peakIndex = findPeak(mountainArr, length);

            int result = findTarget(mountainArr, 0, peakIndex, target, true);
            if (result != -1) {
                return result;
            }

            return findTarget(mountainArr, peakIndex + 1, length - 1, target, false);
        }

        private int findTarget(MountainArray mountainArr, int left, int right, int target, boolean isUpside) {
            while (left <= right) {
                int mid = (left + right) / 2;
                int midVal = mountainArr.get(mid);

                if (midVal == target) {
                    return mid;
                }

                if (isUpside) {
                    if (target > midVal) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (target > midVal) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }

            return -1;
        }

        private int findPeak(MountainArray mountainArr, int length) {
            int left = 0;
            int right = length - 1;

            while (left < right) {
                int mid = (left + right) / 2;
                if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return left;
        }
    }
    // Q 33 https://leetcode.com/problems/find-in-mountain-array/

        static  int binarySearchpivot(int[] nums, int target) {
            int pivot=findpivot(nums);
            // if you did not find a pivot means the araay is not roate
            if(pivot==-1){
                // normal BS
                return binarysearch(nums,target,0,nums.length-1);

            }
            if(nums[pivot]==target){
                return pivot;
            }


        }
        static int binarysearch(int[] arr ,int target,int start,int end){
//        int start =0;
//        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
        static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // 4 cases
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
        }
    }

