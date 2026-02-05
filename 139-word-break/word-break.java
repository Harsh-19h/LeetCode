class Solution {
    Boolean dp[];
    public boolean solve(int idx, String s,HashSet<String> set){
        if (idx==s.length()){
            return true;
        }

        if(dp[idx] != null) return dp[idx];

        for(int i=idx;i<s.length();i++){
            String temp = s.substring(idx,i+1);
            if(set.contains(temp) && solve(i+1,s,set)){
                return dp[idx] = true;
            }
        }
        return dp[idx] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        dp = new Boolean[s.length()];
        for(String st: wordDict){
            set.add(st);
        }
         return solve(0,s,set);
    }
}