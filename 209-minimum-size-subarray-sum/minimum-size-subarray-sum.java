class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int i=0;
        int sum =0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];

            while(sum>=target){
                 if(sum>=target) ans = Math.min(ans,(j-i+1));

                sum -=nums[i];
                i++;
            }

           
        }

        if(ans==Integer.MAX_VALUE) return 0;
        else return ans;
    }
}