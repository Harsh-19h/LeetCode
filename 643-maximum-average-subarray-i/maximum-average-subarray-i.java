class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double avg = Double.NEGATIVE_INFINITY; // only for floating values
     double sum = 0;
     int low = 0;
     for(int high=0;high<nums.length;high++){
        sum+=nums[high];
        if(high-low+1==k){          // o based index ki wajah se
            double curravg = sum/k;
            avg = Math.max(avg,curravg);
            sum -=nums[low];
            low++;
        }
     } 
     return avg;  
    }
}