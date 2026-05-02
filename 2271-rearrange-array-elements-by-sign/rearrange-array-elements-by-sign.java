class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 1;
        int ans[] = new int[nums.length];
        if(nums.length==1) return nums;
        for(int val: nums){
            if(val>0){
                ans[i] = val;
                i+=2;
            }else{
                ans[j] = val;
                j+=2;
            }
        }
        return ans;
    }
}