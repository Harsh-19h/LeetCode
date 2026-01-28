class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    public void solve(int nums[],List<Integer> curr){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(i)) continue;
             if(i>0 && (nums[i]==nums[i-1] && !set.contains(i-1))) continue;
            set.add(i);
            curr.add(nums[i]);
            solve(nums,curr);
            curr.remove(curr.size()-1);
            set.remove(i);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,temp);
        return ans;
    }
}