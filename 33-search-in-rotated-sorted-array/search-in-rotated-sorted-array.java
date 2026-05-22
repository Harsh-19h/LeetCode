class Solution {

    public int bs(int nums[],int start, int end,int target){
        while(start<=end){
             int mid = (start + end)/2;
             if(nums[mid]==target) return mid;
             else if(nums[mid]<target)start++;
             else end--;
        }
        return -1;

    }
    public int search(int[] nums, int target) {
        int ans = -1;

        if(nums.length==1){
            return (nums[0]==target)?0:-1;
        }

        int idx = -1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) {
                idx = i;
                break;
            }
        }

        if(idx == -1) return bs(nums,0,nums.length-1,target);

        else{
            ans = bs(nums,0,idx,target);
            if(ans==-1) ans = bs(nums,idx+1,nums.length-1,target);
        }

        return ans;
    }
}