class Solution {
    public long maxMatrixSum(int[][] matrix) {
      int negCount =0;
      long sum =0;
      long minabs =Long.MAX_VALUE;
      for(int rows[] : matrix){
        for(int val: rows){
            if(val<0) negCount++;
            sum+=Math.abs(val);
            if(Math.abs(val)<minabs) minabs = Math.abs(val);

        }
      } 
      if(negCount%2==0) return sum;
      else return sum-2*minabs; 
    }
}