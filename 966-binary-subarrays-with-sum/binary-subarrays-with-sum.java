class Solution {
    public int subarrays(int nums[],int goal){
        if(goal<0) return 0;
         int low = 0;
       int count = 0;
       int sum =0;
       for(int high=0;high<nums.length;high++){
        sum+=nums[high];
        while(sum>goal){
            sum-=nums[low];
            low++;
        }
        count+= high-low+1;
       } 
       return count;
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) {
       return subarrays(nums,goal) - subarrays(nums,goal-1);
    }
}