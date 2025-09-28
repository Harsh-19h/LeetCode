// MEMOIZATION (DP)
class Solution {
    public int helper(int nums[],int dp[], int start ,int end){
        if(start >end) return 0;
        if(dp[start] !=-1) return dp[start];
        int take = nums[start] + helper(nums,dp,start+2,end);
        int skip = helper(nums,dp,start+1,end);
        dp[start] = Math.max(take,skip);
        return dp[start];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int dp1[] = new int [n];
        int dp2[] = new int [n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
       int case1  = helper(nums,dp1,0,n-2);
       int case2 = helper(nums,dp2,1,n-1);
       return Math.max(case1,case2);
    }
}