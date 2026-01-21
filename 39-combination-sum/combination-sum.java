class Solution {
    public void solve(int start, int []candidates, int target, List<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0 || start==candidates.length)  return;

        temp.add(candidates[start]);
        solve(start,candidates,target-candidates[start],ans,temp);
        
        temp.remove(temp.size()-1);
        solve(start+1,candidates,target,ans,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0,candidates,target,ans,temp);
        return ans;
    }
}