class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ans[] = new int[queries.length];
        Arrays.sort(nums);
        int prefix [] = new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=0;i<queries.length;i++){
            int j=0;
            while(prefix[j]<=queries[i]){
                j++;
                if(j==prefix.length) break;
            }
            ans[i] =j;
        }
        return ans;
    }
}