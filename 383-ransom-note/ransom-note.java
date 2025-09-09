class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                int freq = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i),freq+1);
            } else map.put(magazine.charAt(i),1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
           if(!map.containsKey(ch)) return false;
           else{
            int freq = map.get(ch);
            if(freq ==1) map.remove(ch);
            else map.put(ch,freq-1);
           }
        }
        return true;
    }
}