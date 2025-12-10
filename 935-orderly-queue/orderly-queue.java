class Solution {
    public String orderlyQueue(String s, int k) {
        if(k==1){
        String temp = s;
            for(int i=1;i<s.length();i++){
                String t = s.substring(1,s.length())+ s.charAt(0);
                int val = t.compareTo(temp);
                if(val<0) temp =t;
                s = t;
            }
        return temp;
        }
        else{
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            StringBuilder st = new StringBuilder();
            for(char c: arr){
                st.append(c);
            }
            String ans = st.toString();
            return ans;
        }
    }
}