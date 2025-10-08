class Solution {
    public String longestCommonPrefix(String[] strs) {
       String min=strs[0];
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            if( min.length()>s.length()){
                min = s;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int j=0;j<min.length();j++){
            boolean letter = true;
            for(int i=0;i<strs.length;i++){
                String st = strs[i];
                if(min.charAt(j)!=st.charAt(j)){
                letter =false;
                break;
                }
            }
            if(letter) ans.append(min.charAt(j));
            else break;
        }
        return ans.toString();
    }
}