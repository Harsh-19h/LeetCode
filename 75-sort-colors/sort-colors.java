class Solution {
    public void sortColors(int[] nums) {

       int i = 0;
       int j= nums.length-1;
       int k=0;
       while(k<=j){
        if(k<i){
            k++;
            continue;
        }
        if(nums[k]==1){
            k++;
            continue;
        } 
        if(nums[k]==0){
            int t = nums[k];
            nums[k] = nums[i];
            nums[i] = t;
            i++;
        }
        if(nums[k]==2){
            int temp = nums[k];
            nums[k] = nums[j];
            nums[j] = temp;
            j--;
        }
       }
    }
}