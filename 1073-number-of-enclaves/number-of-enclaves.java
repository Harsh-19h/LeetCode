class Solution {
    class pair{
        int r;
        int c;
        pair(int r,int c){
            this.r = r;
            this.c = c;
        }
    }
    public int numEnclaves(int[][] grid) {
        int visited[][] = new int [grid.length][grid[0].length];
        Queue<pair> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if((i==0 || i==grid.length-1 || j==0 || j==grid[0].length-1) && grid[i][j]==1){
                    q.add(new pair(i,j));
                    visited[i][j] = 1;
                }
            }
        }
        while(!q.isEmpty()){
            pair curr = q.remove();
            int r = curr.r;
            int c = curr.c;
            if(r>0 && grid[r-1][c]==1 && visited[r-1][c]==0){
                visited[r-1][c] = 1;
                q.add(new pair(r-1,c));
            }
            if(r<grid.length-1 && grid[r+1][c]==1 && visited[r+1][c]==0){
                visited[r+1][c] = 1;
                q.add(new pair(r+1,c));
            }
            if(c>0 && grid[r][c-1]==1 && visited[r][c-1]==0){
                visited[r][c-1] = 1;
                q.add(new pair(r,c-1));
            } 
            if(c<grid[0].length-1 && grid[r][c+1]==1 && visited[r][c+1]==0){
                visited[r][c+1] = 1;
                q.add(new pair(r,c+1));
            }
        }
        int ans =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && visited[i][j]==0) ans++;
            }
        }
        return ans;
    }
}