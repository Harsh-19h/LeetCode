class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }

        boolean vis[] = new boolean[26];

        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(vis[c-'a']) continue;

            while( !st.isEmpty() && st.peek()>c && map.get(st.peek())>i){
                vis[st.pop()-'a'] = false;
            }
            st.push(c);
            vis[c-'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(char ch: st) sb.append(ch);
        return sb.toString();
    }
}