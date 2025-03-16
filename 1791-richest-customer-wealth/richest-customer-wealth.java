class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int rich = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
             wealth = 0;
            for(int j = 0;j<accounts[0].length;j++){
            wealth = wealth +accounts[i][j];
            }
            if(wealth>rich){
            rich = wealth;
            }
        }  
        return rich;
    }
}