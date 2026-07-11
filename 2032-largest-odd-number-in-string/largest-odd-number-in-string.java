class Solution {
    public String largestOddNumber(String num) {
        int idx = -1;
        for(int i=num.length()-1;i>=0;i--){
            int val = num.charAt(i)-'0';
            if(val%2!=0){
                idx = i;
                break;
            }
        }
        if(idx==-1) return "";
        String ans = num.substring(0,idx+1);
        return ans;
    }
}