class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int ans[][]  = new int[n][m];

        for(int i=0;i<n;i++){
            Arrays.fill(ans[i],Integer.MAX_VALUE);
        }
        ans[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)-> x[0]-y[0]);
        pq.add(new int[]{0,0,0});

        while(!pq.isEmpty()){
            int curr[] = pq.remove();
            int effort = curr[0];
            int i=curr[1];
            int j=curr[2];
            if(i==n-1 && j==m-1) break;

            if(i>0){
                int e = Math.abs(heights[i][j] - heights[i-1][j]);
                e = Math.max(e,effort);
                if(e<ans[i-1][j]){
                    ans[i-1][j] = e;
                    pq.add(new int[]{e,i-1,j});
                }
            }
            if(i<n-1){
                int e = Math.abs(heights[i][j]- heights[i+1][j]);
                e = Math.max(e,effort);
                if(e<ans[i+1][j]){
                    ans[i+1][j] = e;
                   pq.add(new int[]{e,i+1,j});
                }
            }
            if(j>0){
                int e = Math.abs(heights[i][j] - heights[i][j-1]);
                e = Math.max(e,effort);
                if(e<ans[i][j-1]){
                    ans[i][j-1] = e;
                   pq.add(new int[]{e,i,j-1});
                }
            }
            if(j<m-1){
                int e = Math.abs(heights[i][j]- heights[i][j+1]);
                e = Math.max(e,effort);
                if(e<ans[i][j+1]){
                    ans[i][j+1] = e;
                    pq.add(new int[]{e,i,j+1});
                }
            }
        }
        return ans[n-1][m-1];

    }
}