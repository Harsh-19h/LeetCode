class Solution {
    public boolean checkZeroOnes(String s) {
        int zero = 1;
        int one = 1;
        int maxz = Integer.MIN_VALUE;
        int maxo = Integer.MIN_VALUE;

        if(s.length()==1){
            if(s.charAt(0)=='1') return true;
            else return false;
        }

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='0'){
                zero++;
                continue;
            }
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i) == '1'){
                one ++;
                continue;
            }
            maxz = Math.max(zero,maxz);
            zero = 1;
            maxo = Math.max(one,maxo);
            one =1;
        }
        maxz = Math.max(zero,maxz);
        maxo = Math.max(one,maxo);
        return(maxo>maxz) ;
    }
}