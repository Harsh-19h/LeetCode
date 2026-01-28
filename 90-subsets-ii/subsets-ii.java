class Solution {
    public List<List<Integer>> ans = new ArrayList<>();

    public void solve(int start,List<Integer> curr, int nums[] ){
        ans.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            solve(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        solve(0,curr,nums);
        return ans;
    }
}