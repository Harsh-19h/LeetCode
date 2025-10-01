class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
         if(numBottles<numExchange) return numBottles;
        while(numBottles>=numExchange){
            int ex = numBottles/numExchange;
            ans+=ex;
            numBottles = (numBottles%numExchange) +ex;
        }
        return ans;
    }
}