class Solution {
    public int countAsterisks(String s) {
        int pair = 0;
        int count1 = 0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='|') pair ++;
            if(ch=='*' && pair%2!=0) count2++;
            if(pair%2==0) count2=0;
            if(ch=='*' && pair%2==0) count1++;
        }
        return count1 +count2;
    }
}