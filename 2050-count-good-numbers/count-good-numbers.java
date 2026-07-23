class Solution {

    static final long MOD = 1_000_000_007;

    public static long calculate(long x, long y) {
        if (y == 0)
            return 1;

        if (y % 2 == 0)
            return calculate((x * x) % MOD, y / 2);

        return (x * calculate((x * x) % MOD, (y - 1) / 2)) % MOD;
    }

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = (calculate(5, even) * calculate(4, odd)) % MOD;

        return (int) ans;
    }
}