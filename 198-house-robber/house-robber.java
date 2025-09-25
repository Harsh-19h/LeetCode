// MEMOIZATION (DP)
class Solution {
    public int amount(int nums[], int idx,int dp[]){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take = nums[idx] + amount(nums,idx+2,dp);
        int skip = amount(nums,idx+1,dp);
        return dp[idx] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return amount(nums,0,dp);
    }
}