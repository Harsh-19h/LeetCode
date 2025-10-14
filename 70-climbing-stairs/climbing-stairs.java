// MEMOIZATION (DP)
class Solution {
    int helper(int n,int dp[], int idx ){
        if(idx >n) return 0; 
        if(idx==n) return 1;
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx] = helper(n,dp,idx+1) + helper(n,dp,idx+2);
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
         return helper(n,dp,0);
    }
}