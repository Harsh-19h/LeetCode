class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }

        int idx = 0;
        for(int i=min;i<=max;i++){
            if(nums[idx]==i){
                idx++;
            }else{
                ans.add(i);
            }
        }

        return ans;
    }
}