class Solution {
    public static int[] reverse(int[] arr, int left , int right){
        while(left<right){
            int temp = arr[left];
            arr [left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
    public boolean check(int[] nums) {
        int n= nums.length;
        int k=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
                k++;
            }else{
                break;
            }
        }
        int x = n-k-1;
        reverse(nums,0,k);
        reverse(nums,k+1,n-1);
        reverse(nums,0,n-1);
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
}