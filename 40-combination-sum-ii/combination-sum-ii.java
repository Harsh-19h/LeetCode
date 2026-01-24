// for - loop backtracking method

class Solution {
    public static void solve(int start, int candidates[], int target,List<Integer> temp, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            temp.add(candidates[i]);
            solve(i+1,candidates,target-candidates[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       Arrays.sort(candidates);
       solve(0,candidates,target,temp,ans);
       return ans; 
    }
}