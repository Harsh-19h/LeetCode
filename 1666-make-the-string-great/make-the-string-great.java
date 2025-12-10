class Solution {
    public String makeGood(String s) {
        Stack <Character> st =new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }
            char c = st.peek();
            if(Math.abs(s.charAt(i)- c)==32) st.pop();
            else st.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for(char c: st){
            sb.append(c);
        }
        return sb.toString();
    }
}