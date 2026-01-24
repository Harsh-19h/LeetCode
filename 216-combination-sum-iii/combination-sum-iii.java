class Solution {
    public static void solve(int start, int k,int n, List<List<Integer>> ans, List<Integer> temp){
        if(n<0 || k<0 ) return;
        if(n==0 && k==0){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=start;i<=9;i++){
           temp.add(i);
           solve(i+1,k-1,n-i,ans,temp);
           temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(1,k,n,ans,temp);
        return ans;
    }
}