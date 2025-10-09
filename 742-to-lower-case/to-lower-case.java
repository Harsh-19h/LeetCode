class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){
                int val = ascii+32;
                 ch =(char) val;
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}