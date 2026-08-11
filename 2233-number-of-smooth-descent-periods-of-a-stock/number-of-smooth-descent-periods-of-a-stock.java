class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans =1;

        if(prices.length<2) return prices.length;
        int i =0;
        for(int j=1;j<prices.length;j++){
            if((prices[j-1]-prices[j])!=1){
                i = j;
            }

            ans += j-i+1;
        }
        return ans;

    }
}