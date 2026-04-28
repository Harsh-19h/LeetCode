class Solution {
    public static void reverse(int nums[], int i, int j){
        while(i<j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;

            i++;j--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(k>nums.length) k= k % nums.length;

        if(nums.length<1) return ;

        int idx = nums.length -k-1;
        reverse(nums,0,idx);
        reverse(nums,idx+1,nums.length-1);
        reverse(nums,0,nums.length-1);

        return;
    }
}