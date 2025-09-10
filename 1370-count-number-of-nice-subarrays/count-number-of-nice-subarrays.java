// ATMOST CONCEPT (maths based)
class Solution {
    public int atmostk(int nums[],int k){
        if(k<0) return 0;
          int low = 0;
        int count = 0;
        int total = 0;
        for(int high = 0;high<nums.length;high++){
            if(nums[high]%2!=0) count++;
            while(count>k){
                if(nums[low]%2!=0) count--;
                low++;
            }
            total += high-low+1;
        }
        return total;
    }
    public int numberOfSubarrays(int[] nums, int k) {
      return atmostk(nums,k) - atmostk(nums,k-1);
    }
}