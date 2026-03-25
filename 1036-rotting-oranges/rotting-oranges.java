class Solution {
    class pair{
        int r;
        int c;
        int t;
        pair(int r,int c, int t){
            this.r = r;
            this.c = c;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<pair> q = new LinkedList<>();
        int fresh =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new pair(i,j,0));
                }
                if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;
        int time = 0;
        while(!q.isEmpty()){
            pair curr = q.remove();
            int r = curr.r;
            int c = curr.c;
            int t = curr.t;
            time = Math.max(time,t);
            if(r>0 && grid[r-1][c]==1 ){
                grid[r-1][c] =2;
                q.add(new pair(r-1,c,t+1));
                fresh--;
            }
            if(r<grid.length-1 && grid[r+1][c]==1){
                grid[r+1][c] = 2;
                q.add(new pair(r+1,c,t+1));
                fresh--;
            }
            if(c>0 && grid[r][c-1]==1){
                grid[r][c-1] = 2;
                q.add(new pair(r,c-1,t+1));
                fresh--;
            }
            if(c<grid[0].length-1 && grid[r][c+1]==1){
                grid[r][c+1] = 2;
                q.add(new pair(r,c+1,t+1));
                fresh--;
            }
        }
        if(fresh==0) return time;
        else return -1;  
    }
}