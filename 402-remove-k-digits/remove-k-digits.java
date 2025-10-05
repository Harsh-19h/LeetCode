class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        if(k>0){
            while(k!=0 && !st.isEmpty()){
                st.pop();
                k--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        while(ans.length()>0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        if(ans.length()==0) return "0";
        else return ans.toString();
    }
}