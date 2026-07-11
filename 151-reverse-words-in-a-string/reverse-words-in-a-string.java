class Solution {
    public String reverseWords(String s) {

        s = s.trim();

        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '){
                if(sb.length()!=0){
                    st.push(sb.toString());
                    sb = new StringBuilder();
                } 
            }
            else sb.append(s.charAt(i));
        }

        if(sb.length()!=0)st.push(sb.toString());
        s="";
        
        while(!st.isEmpty()){
            if(st.size()==1){
                s+= st.pop();
                break;
            }
            s+= st.pop() + " ";
        }
        return s;
    }
}