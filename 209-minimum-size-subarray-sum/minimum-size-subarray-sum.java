// VARIABLE WINDOW (SLIDING WINDOW)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength = Integer.MAX_VALUE;
        int sum = 0;
        int low = 0;
        int high = 0;
        while(high<nums.length){
            sum+=nums[high++];
            while(sum>=target){
                int length = high -low;
                minlength = Math.min(length,minlength);
                sum-=nums[low];
                low++;
            }
        }
        if(minlength==Integer.MAX_VALUE) return 0;
        return minlength;
    }
}