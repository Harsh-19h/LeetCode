class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ele){
                count++;
            } else count --;
            if(count ==0){
                ele = nums[i];
                count = 1;
            }
        }
        int c = 0;
        for(int val: nums){
            if(val==ele){
                c++;
            }
        }
        if(c>nums.length/2) return ele;
        else return -1;
    }
}