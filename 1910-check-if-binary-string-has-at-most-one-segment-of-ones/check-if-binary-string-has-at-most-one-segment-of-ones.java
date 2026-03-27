class Solution {
    public boolean checkOnesSegment(String s) {
        int count =0;
        for(int i=0;i<s.length()-1;i++){
         if( s.charAt(i)=='1' && s.charAt(i)==s.charAt(i+1)) {
            continue;
         } else if(s.charAt(i) == '1' && s.charAt(i)!=s.charAt(i+1)) count++;
        }
        if(s.charAt(s.length()-1)=='1') count++;
        return(count==1) ? true: false;
    }
}