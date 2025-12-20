// OPTIMIZED basic improvement
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        if(s.equals(goal)){
            int freq[] = new int[26];
            for(char curr: goal.toCharArray()){
                if(++freq[curr-'a']>1) return true;
            }
            return false;
        }

        int idx1=-1;
        int idx2 =-1;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(idx1==-1) idx1=i;
                else if(idx2==-1) idx2=i;
                else return false;
            }
        }

         if(idx2==-1) return false;
        return (s.charAt(idx2)==goal.charAt(idx1) && s.charAt(idx1)==goal.charAt(idx2));
    }
}