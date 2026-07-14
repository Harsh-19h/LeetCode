class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        boolean positive =true;
        int idx =0;
        while(idx<s.length() && s.charAt(idx)==' ') idx++;
          if(idx==s.length()) return (int)ans;

        if (idx < s.length() && s.charAt(idx) == '-') {
        positive = false;
        idx++;
        } else if (idx < s.length() && s.charAt(idx) == '+') {
            idx++;
        }

        while(idx<s.length() && s.charAt(idx)=='0' ) idx++;
        
        if(idx==s.length()) return (int)ans;

        int limit = positive?7:8;

        for(int i =idx;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int curr =  s.charAt(i)-'0';

                if(ans > Integer.MAX_VALUE/10 || ans ==Integer.MAX_VALUE/10 && curr>limit){
                    return positive ? Integer.MAX_VALUE: Integer.MIN_VALUE;
                }

                ans = ans*10 + curr;
            }else break;
        }
        if(positive) return (int )ans;
        else return (int)-ans;
    }
}