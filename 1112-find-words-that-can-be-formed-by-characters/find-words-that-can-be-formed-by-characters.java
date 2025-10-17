class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[] = new int[26];
        for(char ch: chars.toCharArray()){
            freq[ch-'a']++;
        }
        int ans = 0;
        for(String st: words){
            int temp[] = new int[26];
            boolean present = true;
            for(char ch: st.toCharArray()){
                temp[ch-'a']++;
                if(temp[ch-'a']>freq[ch-'a']){
                    present = false;
                    break;
                }
            }
            if(present ==true)  ans+=st.length();
        }
        return ans;
    }
}