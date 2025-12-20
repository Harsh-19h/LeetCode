class Solution {
    public boolean isSubsequence(String s, String t) {
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(t.indexOf(c)==-1) return false;
            int idx = t.indexOf(c);
            String temp = t.substring(idx+1);
            t =temp;
        }
        return true;
    }
}