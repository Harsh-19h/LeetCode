class Solution {

    public static int calculate(int nums[], int i){
        int sum = 0;
        int count = 0;
        for(int j=0;j<nums.length;j++){
            if(sum + nums[j]>i){
                count++;
                sum = nums[j];
            }
            else sum+=nums[j];
        }
        if(sum>0) count++;
        return count;
    }

    public int splitArray(int[] nums, int k) {

        int s = Integer.MIN_VALUE;
        int e = 0;

        for(int i=0;i<nums.length;i++){
            s = Math.max(nums[i],s);
            e += nums[i];
        }

        int ans =Integer.MAX_VALUE;

        while(s<=e){
            int mid = s +(e-s)/2;

            int count = calculate(nums,mid);
            if(count<=k){
                ans = Math.min(mid,ans);
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
}