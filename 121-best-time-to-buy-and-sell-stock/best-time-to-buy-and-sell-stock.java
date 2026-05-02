class Solution {
    public int maxProfit(int[] prices) {

        Stack<Integer> st = new Stack<>();

        int max = Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            if(st.isEmpty()) st.push(prices[i]);

            else if(prices[i]<st.peek()){
                st.push(prices[i]);
            }
            else{
                max = Math.max(max,prices[i]-st.peek());
            }
        }
        return(max==Integer.MIN_VALUE)? 0: max;
    }
}