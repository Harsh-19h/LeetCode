// Include - exclude backtracking technique
class Solution {
    public static void solve(int start, int candidates[], int target,List<Integer> temp, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0 || start>=candidates.length) return ;

        temp.add(candidates[start]);
        solve(start+1,candidates, target-candidates[start],temp,ans);

        temp.remove(temp.size()-1);
        int nextIndex = start+1;
        while(nextIndex<candidates.length && candidates[nextIndex]==candidates[start]){
            nextIndex++;
        }
        solve(nextIndex,candidates,target,temp,ans);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       Arrays.sort(candidates);
       solve(0,candidates,target,temp,ans);
       return ans; 
    }
}