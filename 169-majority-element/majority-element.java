class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<2) return nums[0];
        Arrays.sort(nums);
        int count =1;
        int ans= -1;
       for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }else count=1;
            if(count>(nums.length/2)){
                ans = nums[i];
            }
       } 
       return ans;
    }
}