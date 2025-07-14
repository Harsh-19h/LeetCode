class Solution {
    public int numTrees(int n) { // this is the formula catalan number
        long res =1;
        for(int i=0;i<n;i++){
             res = res*(2L*n-i)/(i+1);
        }
        res = res/(n+1);
        return (int) res;
    }
}