class Solution {
    public String reverseWords(String s) {

        s = s.trim();

        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '){
                if(sb.length()!=0){
                    st.push(sb);
                    sb = new StringBuilder();
                } 
            }
            else sb.append(s.charAt(i));
        }

        if(sb.length()!=0)st.push(sb);
        StringBuilder ans = new StringBuilder();
        
        while(!st.isEmpty()){
            if(st.size()==1){
                ans.append(st.pop());
                break;
            }
            ans.append(st.pop());
            ans.append(" ");
        }
        return ans.toString();
    }
}