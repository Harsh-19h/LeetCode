class Solution {
    int m;
    int n;
    int dp[][];

    public int solve(int[]nums1, int[] nums2, int i, int j){
        if(i==m || j==n) return -1000_000_00;
        
        if(dp[i][j]!=-1000_000_00) return dp[i][j];

        int val = nums1[i]*nums2[j];
        int take_i_j =  nums1[i]*nums2[j] + solve(nums1,nums2,i+1,j+1);
        int take_i = solve(nums1,nums2,i,j+1);
        int take_j = solve(nums1,nums2,i+1,j);

        return dp[i][j] =Math.max(Math.max(val,take_i_j),Math.max(take_i,take_j));
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        m = nums1.length;
        n = nums2.length;
        dp = new int [m+1][n+1];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1000_000_00);
        }

        return solve(nums1,nums2,0,0);
    }
}