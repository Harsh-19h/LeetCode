class Solution {
    class pair{
        int i ;
        int j;
        pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<pair> q = new LinkedList<>();
        if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1]==1) return -1;
        else{
            q.add(new pair(0,0));
            grid[0][0] = 1;
        }
        int level = 0;
        while(!q.isEmpty()){
            int n = q.size();
            while(n-->0){
                pair curr =q.remove();
                int i = curr.i;
                int j = curr.j;

                if(i==grid.length-1 && j==grid[0].length-1) return level+1;
                if(i>0 && grid[i-1][j]==0){
                    q.add(new pair(i-1,j));
                    grid[i-1][j] = 1;
                }
                 if(i<grid.length-1 && grid[i+1][j]==0){
                    q.add(new pair(i+1,j));
                    grid[i+1][j] = 1;
                }
                 if(j>0 && grid[i][j-1]==0){
                    q.add(new pair(i,j-1));
                    grid[i][j-1] = 1;
                }
                 if(j<grid[0].length-1 && grid[i][j+1]==0){
                    q.add(new pair(i,j+1));
                    grid[i][j+1] = 1;
                }
                 if(i>0 && j>0 && grid[i-1][j-1]==0){
                    q.add(new pair(i-1,j-1));
                    grid[i-1][j-1] = 1;
                }
                 if(i<grid.length-1 && j<grid[0].length-1 &&  grid[i+1][j+1]==0){
                    q.add(new pair(i+1,j+1));
                    grid[i+1][j+1] = 1;
                }
                if(i>0 && j<grid[0].length-1 && grid[i-1][j+1]==0){
                    q.add(new pair(i-1,j+1));
                    grid[i-1][j+1] = 1;
                }
                if(i<grid.length-1 && j>0 && grid[i+1][j-1]==0){
                    q.add(new pair(i+1,j-1));
                    grid[i+1][j-1] = 1;
                }
            }
            level++;
        }
        return -1;
        
    }
}