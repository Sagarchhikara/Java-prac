public class binarysearch {
    public static void main(String[] args){
    int[] arr={-18,-12,-4,0,2,3,5,7,9,12,17,14,56,89,90,200};
    int target=-4;
    int ans=orderbinary(arr,target);
        System.out.println(ans);
    }
//    static int binarysearch(int[] arr ,int target){
//        int start =0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(target<arr[mid]){
//                end=mid-1;
//            }
//            else if(target>arr[mid]){
//                start=mid+1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;
//    }
    static int orderbinary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        // find weather arra is in ascend or descend
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;}
            if(isAsc){
            if(target<arr[mid]){
                end=mid-1;
            }}
            else{
                if(target>arr[mid]){
                start=mid+1;
            }
            else{
                start=mid+1;
                }


        }

    }
        return -1;
    }
}

