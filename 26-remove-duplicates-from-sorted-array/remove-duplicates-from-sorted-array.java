class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length<2){
        return nums.length;
       } 
       int length=0;
       nums[length]=nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[length]){
            nums[++length]= nums[i];
        }
       }
       return length+1;
    }
}