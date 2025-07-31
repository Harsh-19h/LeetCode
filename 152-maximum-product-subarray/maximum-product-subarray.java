class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int pre1 =1;
        int pre2 =1;
        for(int i=0;i<nums.length;i++){
            pre1 = pre1*nums[i];
            if(pre1>max1){
                max1=pre1;
            }
             if(nums[i]==0){
                pre1=1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
             pre2 = pre2*nums[i];
            if(pre2>max2){
                max2 = pre2;
            }
            if(nums[i]==0){
                pre2=1;
            }
        }
        return Math.max(max1,max2);
    }
}