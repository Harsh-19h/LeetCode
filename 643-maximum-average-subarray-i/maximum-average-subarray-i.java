class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg = sum/k;
        int low = 0;
        int high = k;
        while(high<nums.length){
            sum = sum +nums[high]-nums[low];
            double curravg = sum/k;
            avg = Math.max(avg,curravg);
            high++;
            low++;
        }
        return avg;
    }
}