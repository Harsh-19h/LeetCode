class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> fmap = new HashMap<>();
        HashMap<Character,Integer> lmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!fmap.containsKey(ch)) fmap.put(ch,i);
            lmap.put(ch,i);
        }
        int count = 0;
        for(char ch: fmap.keySet()){
            int firstidx = fmap.get(ch);
            int lastidx = lmap.get(ch);
            HashSet<Character> set = new HashSet<>();
            for(int i=firstidx+1;i<=lastidx-1;i++){
                set.add(s.charAt(i));
            }
            count+=set.size();
        }
        return count;
    }
}