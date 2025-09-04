class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int max = 0;
        int zero = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0) zero++;
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            int length = right-left+1;
            max = Math.max(length,max);
        }
        return max;
    }
}