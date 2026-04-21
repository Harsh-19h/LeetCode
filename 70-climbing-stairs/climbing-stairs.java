class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int dp[] = new int[n+1];
        dp[1] =1;
        dp[2] = 2;
        int prev = 2;
        int prev2 = 1;
        for(int i=3;i<=n;i++){
            dp[i] = prev + prev2;
            prev2 = prev;
            prev = dp[i];
        }
        return prev;
    }
}