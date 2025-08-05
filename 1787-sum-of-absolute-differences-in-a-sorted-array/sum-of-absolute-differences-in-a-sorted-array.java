class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int ans [] = new int[n];
        int totalsum = 0;
        int leftsum = 0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<n;i++){
           ans[i] = ((nums[i]*i)-leftsum) + ((totalsum-leftsum)-(nums[i]*(n-i)));
           leftsum+=nums[i];
        }
        return ans;
    }
}