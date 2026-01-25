class Solution {
    public int myAtoi(String s) {
       s = s.trim();
       if(s.length()==0) return 0;

       StringBuilder ans = new StringBuilder();
       int idx =0;

       if(s.charAt(idx)=='-' || s.charAt(idx) == '+'){
        ans.append(s.charAt(idx));
        idx++;
       }
       while (idx < s.length() && s.charAt(idx) == '0'){
        idx++;
       }

       for(int i=idx;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch>='0' && ch<='9') ans.append(ch);
        else break;
       } 

       long res=0;
       boolean isnegative = false;
       if(ans.length()==0) return 0;

       for(int i=0;i<ans.length();i++){
            char c= ans.charAt(i);
            if(c=='-'){
                isnegative = true;
                continue;
            }
            if (c == '+') continue;

            int digit = c - '0';

            if (!isnegative && res > (Integer.MAX_VALUE - digit) / 10)
                return Integer.MAX_VALUE;

            if (isnegative && -res < (Integer.MIN_VALUE + digit) / 10)
                return Integer.MIN_VALUE;

            res = res * 10 + digit;
       }

       if(isnegative) res = -res;
       return (int) res;
    }
}