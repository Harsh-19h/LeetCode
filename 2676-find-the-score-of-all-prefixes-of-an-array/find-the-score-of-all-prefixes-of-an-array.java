class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long conver[] = new long[n];
        conver[0] = 2*nums[0];
        long premax[]= new long[n];
        premax[0]=nums[0];
        for(int i=1;i<n;i++){
            premax[i] = Math.max(premax[i-1],nums[i]);
            conver[i] = nums[i] + premax[i];
        }

        long score[] = new long[n];
        score[0] = conver[0];
        for(int i=1;i<n;i++){
            score[i] = score[i-1] + conver[i];
        }
        return score;
    }
}