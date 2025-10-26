class Solution {
    public long removeZeros(long n) {
        long ans =0;
        while(n>0){
            long last = n%10;
            if(last!=0) ans = (ans*10)+ last;
            n=n/10;
        }
        long res = 0;
        while(ans>0){
            long l = ans%10;
            res = (res*10) + l;
            ans/=10;
        }
        return res;
    }
}