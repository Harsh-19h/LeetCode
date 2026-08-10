class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int i = 0;
        int cost = 0;

        for(int j=0;j<s.length();j++){
            if(s.charAt(j)!=t.charAt(j)){
                cost += Math.abs (s.charAt(j)- t.charAt(j));
            }

            while(cost>maxCost){
                cost -= Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }
            
            ans = Math.max(ans,j-i+1);
        }

        return ans;
    }
}