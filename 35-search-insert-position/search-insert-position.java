class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mindiff = Integer.MAX_VALUE;
        int index =0;
        while(start<=end){
             int mid = (start+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end = mid-1;
            else {
                int diff =Math.abs(nums[mid]-target);
                if(diff<mindiff){
                    mindiff = diff;
                    index = mid+1;
                }
                start = mid+1;
            }
        }
        return index;

    }
}