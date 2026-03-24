class Solution {
    class pair{
        int r;
        int c;
         pair(int r , int c){
            this.r = r;
            this.c = c;
        }
    }
    public void bfs(char[][] grid,int i, int j, boolean visited[][]){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i,j));
        visited[i][j] = true;
        while(!q.isEmpty()){
            pair curr = q.remove();
            int row = curr.r;
            int col = curr.c;
            if(row>0 && grid[row-1][col]=='1' && visited[row-1][col]==false){
                q.add(new pair(row-1,col));
                visited[row-1][col] = true;
            }
            if( row< grid.length-1 && grid[row+1][col]=='1' && visited[row+1][col]==false){
                q.add(new pair(row+1,col));
                visited[row+1][col] = true;
            }
            if(col>0 && grid[row][col-1]=='1' && visited[row][col-1] ==false){
                q.add(new pair(row,col-1));
                visited[row][col-1] = true;
            }
              if(col<grid[0].length-1 && grid[row][col+1]=='1' && visited[row][col+1] ==false){
                q.add(new pair(row,col+1));
                visited[row][col+1] = true;
            }
        }
    }
    public int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int ans =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]== '1' && visited[i][j]==false){
                    bfs(grid,i,j,visited);
                    ans++;
                }
            }
        }
        return ans;
    }
}