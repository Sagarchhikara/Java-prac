public class linersearch {
    public static void main (String[] args) {
        int[] nums={23,11,1,3,6,8,-11,28,67};
        int target=19;
        int ans=linearsearch(nums,target);
        System.out.println(ans);


    }
    // search in the array: return the index if found
//    static int linearseacrh(int[] arr,int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for(int index=0;index<arr.length;index++){
//            int element=arr[index];
//            if(element==target){
//                return index;
//            }
//        }
//        // this line will exectue if target not found
//        return -1;
//    }
    static int linearsearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==target){
                return element;

            }
        }
        // this line will exectue if target not found
        return -1;
    }

}
