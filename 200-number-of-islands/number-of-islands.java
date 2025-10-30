class Solution { 
    class pair{
        int row;
        int col;
        pair(int row ,int col){
            this.row = row ;
            this.col = col;
        }
    }
    public void bfs(boolean visited[][] , char grid[][],int i, int j ){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i,j));
        visited[i][j] = true;
        while(!q.isEmpty()){
            pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            
            if(c>0 && grid[r][c-1]=='1' && visited[r][c-1]==false){
                q.add(new pair(r,c-1));
                visited[r][c-1] = true;
            } 
            if(c<grid[0].length-1 && grid[r][c+1]=='1' && visited[r][c+1]==false){
                q.add(new pair(r,c+1));
                visited[r][c+1] = true;
            } 
            if(r<grid.length-1 && grid[r+1][c]=='1' && visited[r+1][c]==false){
                q.add(new pair(r+1,c));
                visited[r+1][c] = true;
            }
            if(r>0 && grid[r-1][c]=='1' && visited[r-1][c]==false){
                 q.add(new pair(r-1,c)); 
                 visited[r-1][c] = true;
            }   
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
       boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    bfs(visited,grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}