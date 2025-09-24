// MEMOIZATION (DP)
class Solution {
    public int mincost(int cost[],int i,int dp[]){
        if(i<=1) return cost[i];
        if(dp[i] != -1) return dp[i];
        dp[i] = cost[i] + Math.min(mincost(cost,i-1,dp),mincost(cost,i-2,dp));
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int idx = cost.length;
        int dp[] = new int[idx];
        Arrays.fill(dp,-1);
       return Math.min(mincost(cost,idx-1,dp),mincost(cost,idx-2,dp));
    }
}