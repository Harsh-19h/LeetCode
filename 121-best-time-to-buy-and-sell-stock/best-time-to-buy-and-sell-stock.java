class Solution {
    public int maxProfit(int[] nums) {
        int max = 0;
        int buy = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>buy){
                int profit = nums[i] - buy;
                max = Math.max(profit,max);
            }
            else  buy = nums[i];
        }
        return max;
    }
}