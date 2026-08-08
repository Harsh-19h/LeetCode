class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int ans = 0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                int idx = map.get(s.charAt(j));
                while(i<=idx){
                    map.remove(s.charAt(i));
                    i++;
                }
                map.put(s.charAt(j),j);
            }else {
                ans = Math.max(ans,(j-i+1));
                map.put(s.charAt(j),j);
            }
        }

        return ans;
    }
}