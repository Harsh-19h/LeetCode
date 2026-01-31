class Solution {
    List<List<String>> ans = new ArrayList<>();

    public boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!= s.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public void solve(int idx,String s,List<String> temp){
        if(idx==s.length()){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                solve(i+1,s,temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<String> temp = new ArrayList<>();
        solve(0,s,temp);
        return ans;
    }
}