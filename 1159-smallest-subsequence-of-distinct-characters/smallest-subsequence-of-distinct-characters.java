class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        boolean vis[] = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vis[ch-'a']) continue;

            while(!st.isEmpty() && st.peek()>ch && map.get(st.peek())>i){
                vis[st.pop()-'a'] = false;
            }
                st.push(ch);
                vis[ch-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c: st) sb.append(c);
        return sb.toString();
    }
}