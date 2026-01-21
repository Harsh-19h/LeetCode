class Solution {
    public void solve(int start, int k, int n, ArrayList<Integer> temp, List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        if(start>n) return;
        temp.add(start);
        solve(start+1,k-1,n,temp,ans);
        temp.remove(temp.size()-1);
        solve(start+1,k,n,temp,ans);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        solve(1,k,n,temp,ans);
        return ans;
    }
}