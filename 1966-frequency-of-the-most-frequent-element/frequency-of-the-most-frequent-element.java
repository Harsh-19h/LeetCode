// Sliding Window Approach (optimized)
class Solution {
    public int maxFrequency(int[] nums, int k) {
         Arrays.sort(nums);
        int l = 0;
        int result = 0;
        long currSum = 0;
        for(int r=0;r<nums.length;r++){
            currSum += nums[r];
            while ((long)(r - l + 1) * nums[r] - currSum > k) {
                currSum -= nums[l];
                l++;
            }
            result = Math.max(result,(r-l+1));
        }
        return result;
    }
}