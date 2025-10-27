class Solution {
    public int strStr(String haystack, String needle) {
       int i=0;
        int j=needle.length()-1;
       while(j<haystack.length()){
            String s = haystack.substring(i,j+1);
            if(s.equals(needle)){
                return i;
            }else{
                i++;j++;
            }
        } 
       return -1;
    }
}