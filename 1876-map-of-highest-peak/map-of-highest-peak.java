class Solution {
    class pair{
        int r;
        int c;
        int h;
        pair(int r,int c, int h){
            this.r = r;
            this.c = c;
            this.h = h;
        }
    }
    public int[][] highestPeak(int[][] w) {
        int visited[][] = new int[w.length][w[0].length];
        Queue<pair> q = new LinkedList<>();
        for(int i=0;i<w.length;i++){
            for(int j=0;j<w[0].length;j++){
                if(w[i][j]==1){
                    q.add(new pair(i,j,0));
                    w[i][j] = 0;
                    visited[i][j] = 1;
                }
            }
        }
        while(!q.isEmpty()){
            pair curr = q.remove();
            int r = curr.r;
            int c = curr.c;
            int h = curr.h;
            if(r>0 && w[r-1][c]==0 && visited[r-1][c]==0){
                q.add(new pair(r-1,c,h+1));
                visited[r-1][c] = 1;
                w[r-1][c] = h+1;
            }
            if(r<w.length-1 && w[r+1][c]==0 && visited[r+1][c]==0){
                q.add(new pair(r+1,c,h+1));
                visited[r+1][c] = 1;
                w[r+1][c] = h+1;
            }
            if(c>0 && w[r][c-1]==0 && visited[r][c-1]==0){
                q.add(new pair(r,c-1,h+1));
                visited[r][c-1] =1;
                w[r][c-1] = h+1;
            }
             if(c<w[0].length-1 && w[r][c+1]==0 && visited[r][c+1]==0){
                q.add(new pair(r,c+1,h+1));
                visited[r][c+1] =1;
                w[r][c+1] = h+1;
            }

        }
        return w;
    }
}