class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans[][] = new int[n][m];

        for(int i=0;i<n;i++){
            Arrays.fill(ans[i], Integer.MAX_VALUE);
        }

        if(grid[0][0]==1 || grid[n-1][m-1]==1) return -1;

        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)-> x[0]-y[0]);

        ans[0][0] = 1;  
        pq.add(new int[]{1,0,0}); 

        while(!pq.isEmpty()){
            int curr[] = pq.remove();
            int d = curr[0];
            int i = curr[1];
            int j = curr[2];

            if(i==n-1 && j==m-1) return d;

            if(i>0 && grid[i-1][j]==0 && d+1 < ans[i-1][j]){
                ans[i-1][j] = d+1;
                pq.add(new int[]{ans[i-1][j],i-1,j});
            }

            if(i<n-1 && grid[i+1][j]==0 && d+1 < ans[i+1][j]){
                ans[i+1][j] = d+1;
                pq.add(new int[]{ans[i+1][j],i+1,j});
            }

            if(j>0 && grid[i][j-1]==0 && d+1 < ans[i][j-1]){
                ans[i][j-1] = d+1;
                pq.add(new int[]{ans[i][j-1],i,j-1});
            }

            if(j<m-1 && grid[i][j+1]==0 && d+1 < ans[i][j+1]){
                ans[i][j+1] = d+1;
                pq.add(new int[]{ans[i][j+1],i,j+1});
            }

            if(i>0 && j>0 && grid[i-1][j-1]==0 && d+1 < ans[i-1][j-1]){
                ans[i-1][j-1] = d+1;
                pq.add(new int[]{ans[i-1][j-1],i-1,j-1});
            }

            if(i<n-1 && j<m-1 && grid[i+1][j+1]==0 && d+1 < ans[i+1][j+1]){
                ans[i+1][j+1] = d+1;
                pq.add(new int[]{ans[i+1][j+1],i+1,j+1});
            }

            if(i>0 && j<m-1 && grid[i-1][j+1]==0 && d+1 < ans[i-1][j+1]){
                ans[i-1][j+1] = d+1;
                pq.add(new int[]{ans[i-1][j+1],i-1,j+1});
            }

            if(i<n-1 && j>0 && grid[i+1][j-1]==0 && d+1 < ans[i+1][j-1]){
                ans[i+1][j-1] = d+1;
                pq.add(new int[]{ans[i+1][j-1],i+1,j-1});
            }
        }

        return -1;
    }
}