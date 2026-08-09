class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int i=0;
        int max = 0;
        int ans = 0;
        for(int j=0;j<s.length();j++){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            max = Math.max(max,map.get(s.charAt(j)));

            while((j-i+1)-max >k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);

                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                i++;
            }

            ans = Math.max(ans,(j-i+1));
        }
        return ans;
    }
}