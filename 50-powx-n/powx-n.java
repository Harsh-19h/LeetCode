class Solution {
    public static double calculate(double x, long m){
        if(m == 0 ) return 1;
        if(m<0) return calculate(1/x, -m);
        if(m%2==0) return calculate(x*x,m/2);

        return x*calculate(x*x,(m-1)/2);
    }
    public double myPow(double x, int n) {
        long m = n;
        return calculate(x,m);
    }
}