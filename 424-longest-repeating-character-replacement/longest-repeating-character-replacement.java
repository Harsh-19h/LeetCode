class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int high = 0;
        int max = 0;
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for( high=0;high<s.length();high++){
            char ch = s.charAt(high);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1);
            }else map.put(ch,1);
             max = Math.max(max,map.get(ch));
             if((high-low+1 )- max>k){
                char c = s.charAt(low);
                map.put(c,map.get(c)-1);
                low++;
             }
            ans = Math.max(ans,high-low+1);
        }
        return ans;
    }
}