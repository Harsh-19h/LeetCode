class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i] = -1;
        }

        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            sum += nums[i];

            if(sum ==0) ans = Math.max(ans,(i+1));
            else if(map.containsKey(sum)){
                int idx = map.get(sum);
                ans = Math.max(ans,i-idx);
            }
             else map.put(sum,i);
        }
        return ans;
    }
}