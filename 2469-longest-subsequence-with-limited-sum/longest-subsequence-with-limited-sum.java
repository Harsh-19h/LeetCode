class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
       int ans[] = new int[queries.length];
       Arrays.sort(nums);
       int prefix[] = new int[nums.length];
       prefix[0] = nums[0];
       for(int i=1;i<nums.length;i++){
        prefix[i] = prefix[i-1]+nums[i];
       } 
       for(int i=0;i<queries.length;i++){
        int low = 0;
        int high = nums.length;
            while(low<high){
                int mid = (low + high)/2;
                if( prefix[mid]<=queries[i] ){
                    low=mid+1;
                }
                else high = mid;
            }
        ans[i] = low;
        }
        return ans;
    }
}