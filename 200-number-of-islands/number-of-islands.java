// (DFS) APPROACH
class Solution {
   public void dfs(boolean visited[][] , char grid[][],int i, int j ){
        visited[i][j] = true;
        if(j>0 && grid[i][j-1]=='1' && visited[i][j-1]==false){
            dfs(visited, grid,i,j-1);
        } 
        if(j<grid[0].length-1 && grid[i][j+1]=='1' && visited[i][j+1]==false){
            dfs(visited,grid,i,j+1);
        } 
        if(i<grid.length-1 && grid[i+1][j]=='1' && visited[i+1][j]==false){
            dfs(visited,grid,i+1,j);
        }
        if(i>0 && grid[i-1][j]=='1' && visited[i-1][j]==false){ 
            dfs(visited,grid,i-1,j);
        }   
    }
    public int numIslands(char[][] grid) {
        int count = 0;
       boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    dfs(visited,grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}