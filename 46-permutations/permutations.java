class Solution {
    HashSet<Integer> set;
    public void solve(int nums[], List<List<Integer>> ans, List<Integer> temp){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                temp.add(nums[i]);
                solve(nums,ans,temp);

                temp.remove(temp.size()-1);
                set.remove(nums[i]);
            } 
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        set = new HashSet<>();
        solve(nums,ans,temp);
        return ans;
    }
}