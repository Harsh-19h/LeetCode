// Binary exponentiation or fast exponentiation concept (very easy)

class Solution {
    static final int MOD = 1000000007;

    public static int pow(int a, long b){
        if(b==0) return 1;

        long half = pow(a,b/2); 
        long ans = (half*half) % MOD;

        if(b%2!=0) ans = (ans*a) % MOD;
        return (int)ans;
    }
    public int countGoodNumbers(long n) {
        long evenplaces = (n+1)/2;
        long oddplaces = n/2;

        long count = ( 1L* pow(5,evenplaces) * pow(4,oddplaces)) % MOD;
        return (int) count;
    }
}