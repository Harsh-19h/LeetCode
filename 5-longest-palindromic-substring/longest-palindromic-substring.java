class Solution {
    public static boolean Palindrome(String curr){
        int i = 0;
        int j = curr.length()-1;
        while(i<=j){
            if(curr.charAt(i)!=curr.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans="";
        int length = 0;

        if(s.length()==1) return s;
        
        for(int i=0;i<s.length()-1;i++){
            for (int j=i;j<s.length();j++){
                boolean check = Palindrome(s.substring(i,j+1));
                if(check){
                    if(j-i+1>length) {
                        ans = s.substring(i,j+1);
                        length = j-i+1;
                    }
                }
            }
        }
        return ans;
    }
}