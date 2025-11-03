class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int max = neededTime[0];
        for(int i=1;i<colors.length();i++){
            char c =colors.charAt(i);
            if(c==colors.charAt(i-1)){
                ans += Math.min(neededTime[i],max);
                max = Math.max(neededTime[i],max); 
            }else{
                  max = neededTime[i];
            } 
        }
        return ans;
    }
}