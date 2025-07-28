class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int idx2=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
                idx = i;
                break;
            }
            
        }
        if(idx==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[idx]) {
                idx2 =i;
                int temp = nums[idx];
                nums[idx] = nums[idx2];
                nums[idx2] = temp;
                break;
            }
        }
       Arrays.sort(nums,idx+1,nums.length);
       return ;
    }
}