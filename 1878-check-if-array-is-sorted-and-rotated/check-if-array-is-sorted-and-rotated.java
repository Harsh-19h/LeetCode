class Solution {
    public void reverse(int nums[], int i ,int j){
        while(i<j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;

            i++;
            j--;
        }
        return ;
    }
    public boolean check(int[] nums) {
        int idx = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                idx = i;
                break;
            }
        }
        if(idx==-1) return true;
        reverse(nums,0,idx-1);
        reverse(nums,idx,nums.length-1);
        reverse(nums,0,nums.length-1);

        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
}