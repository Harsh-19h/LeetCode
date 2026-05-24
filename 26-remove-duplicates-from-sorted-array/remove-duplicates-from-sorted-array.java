class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        if(n==0) return 0;

        int idx =1;
        int count =1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])continue;
            else{
                nums[idx++] = nums[i];
                count++;
            }
        }
        return count;
    }
}