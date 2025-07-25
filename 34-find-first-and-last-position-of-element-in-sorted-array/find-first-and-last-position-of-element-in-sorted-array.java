class Solution {
    public int[] binarysearch(int[]arr,int[] nums, int start, int end,int target){
        if(start>end) return arr;
        int mid = (start+end)/2;
        
        if(nums[mid]==target){
            if(arr[0]==-1 || mid<arr[0]){
                arr[0]= mid;
            }
            if(arr[1]==-1|| arr[1]<mid){
                arr[1] =mid;
            }
            binarysearch(arr,nums,start,mid-1,target);
            binarysearch(arr,nums,mid+1,end,target);
        }
         else if(nums[mid]>target){
            return binarysearch(arr,nums,start,mid-1,target);
        }
        else{
           return binarysearch(arr,nums,mid+1,end,target);
        }
        return arr;
    }
    public int[] searchRange(int[] nums, int target) {
         int arr[] ={-1,-1};
     return binarysearch(arr,nums,0,nums.length-1,target);
    }
}