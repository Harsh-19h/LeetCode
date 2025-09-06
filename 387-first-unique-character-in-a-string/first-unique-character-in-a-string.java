class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder st = new StringBuilder(s);
        for(int i =0;i<st.length();i++){
            if(map.containsKey(st.charAt(i))){
                int freq = map.get(st.charAt(i));
                map.put(st.charAt(i),freq+1);
            } else map.put(st.charAt(i),1);
        }
        HashSet<Character> set = new HashSet<>();
        for(char key: map.keySet()){
            int val = map.get(key);
            if(val==1) set.add(key);
        }
        for(int i =0;i<st.length();i++){
            if(set.contains(st.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}