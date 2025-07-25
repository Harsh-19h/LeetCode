class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close =Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k= nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] +nums[k];
                 int diff =Math.abs(sum-target);
                if(diff<close){
                    close= diff;
                    ans = sum;
                }
                if(sum==target) return sum;

                else if(sum>target){
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return ans;
    }
}