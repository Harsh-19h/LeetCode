class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double ans = Double.NEGATIVE_INFINITY;
        double sum = 0;
        for(int j=0;j<nums.length;j++){
            sum += nums[j];

            while(j-i+1>k){
                sum-=nums[i];
                i++;
            }

           if(j-i+1 ==k ) ans = Math.max(ans,(sum/k));
        }
        return ans;
    }
}