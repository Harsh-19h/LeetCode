// MEMOIZATION (DP)
class Solution {
    public int tri(int n,int dp[]){
        if(n<=1) return n;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = tri(n-1,dp) + tri(n-2,dp) + tri(n-3,dp);
    }
    public int tribonacci(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0; dp[1]=1; dp[2] =1;
        return tri(n,dp);
    }
}