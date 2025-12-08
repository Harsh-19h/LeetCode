class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c = 'a' ; c <= 'z'; c++){
            map.put(c,0);
        }
        for(char c: sentence.toCharArray()){
            int freq = map.get(c);
            map.put(c,freq+1); 
        }
        for(char key: map.keySet()){
            if(map.get(key)==0) return false;
        }
        return true;
    }
}