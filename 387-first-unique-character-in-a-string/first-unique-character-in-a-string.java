class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            } else map.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length();i++){
            int val = map.get(s.charAt(i));
            if(val==1) return i;
        }
        return -1;
    }
}