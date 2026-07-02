class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s =0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(mid%2==0){
                if(mid-1>=0 && nums[mid-1] == nums[mid]) e = mid-1;
                else if( mid+1<nums.length && nums[mid+1] == nums[mid]) s= mid+1;
                else return nums[mid];
            }
            else {
                if(mid-1>=0 && nums[mid-1] == nums[mid]) s = mid+1;
                else if(mid+1<nums.length && nums[mid+1] == nums[mid]) e = mid-1;
                else return nums[mid];
            } 
        }
        return -1;
    }
}