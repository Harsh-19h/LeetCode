class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        int ans =0;
        for(int i=0;i<words.length;i++){
            String curr = words[i];
            boolean present = true;
            HashMap<Character,Integer> map2 = new HashMap<>(map);
            for(int j=0;j<curr.length();j++){
                if(map2.containsKey(curr.charAt(j))){
                    int freq = map2.get(curr.charAt(j));
                    if(freq==1) map2.remove(curr.charAt(j));
                    else map2.put(curr.charAt(j),freq-1);

                }else {
                    present = false;
                    break;
                }
            }
            if(present==true) ans+=curr.length();
        }
        return ans;
    }
}