class Solution {
    public static int calculate(int nums[], int mid){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+= (int) Math.ceil((double)nums[i]/mid);
        }
        return sum;

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1;
        int e = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            e = Math.max(nums[i],e);
        }

        while(s<=e){
            int mid = s +(e-s)/2;
            int sum = calculate(nums,mid);

            if(sum<= threshold){
                ans = Math.min(ans,mid);
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
}