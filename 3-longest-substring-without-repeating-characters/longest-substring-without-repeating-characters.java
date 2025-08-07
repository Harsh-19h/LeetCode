class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int len = 0;
        int maxlen = 0;
        int i=0,j=0;
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                i=map.get(ch)+1;
            }
            map.put(ch,j);
            maxlen = Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}