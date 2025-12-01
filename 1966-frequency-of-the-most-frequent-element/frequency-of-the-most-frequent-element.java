// BINARY SEARCH + PREFIX SUM APPROACH
class Solution {

     public  int bs(int i,long prefix[], int nums[],int k){
            int start = 0;
            int end = i;
            int best_idx = i;
            while(start<=end){
                int mid = start + (end-start)/2;
                long totaldigit = i-mid+1;
                long totalsum = nums[i]*totaldigit;
                long currsum = prefix[i] - prefix[mid] + nums[mid];

                int op = (int) (totalsum-currsum);
                if(op>k){
                    start = mid+1;
                } else{
                    best_idx = mid;
                    end = mid-1;
                }
            }
              return i - best_idx +1;
        }

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        long prefix[] = new long[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int ans =0;
        for(int i=0;i<nums.length;i++){
            int freq = bs(i,prefix,nums,k);
            ans = Math.max(freq,ans);
        }
        return ans;
    }
}