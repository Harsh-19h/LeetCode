class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                int f = map.get(key);
                map.put(key,f+1);
            }else{
                map.put(key,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char key = t.charAt(i);
            if(map2.containsKey(key)){
              int x = map2.get(key);
              map2.put(key,x+1);
            }else{
                map2.put(key,1);
            }
        }
        for(char key : map.keySet()){
            int val1 =map.get(key);
            if(!map2.containsKey(key)) return false;
            int val2 = map2.get(key);
            if(val1!=val2) return false;
        }
        return true;
    }
}