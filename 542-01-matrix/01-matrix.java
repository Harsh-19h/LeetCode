class Solution {
    class pair{
        int r;
        int c;
        int d;
        pair(int r,int c, int d){
            this.r = r;
            this.c =c;
            this.d = d;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int ans[][] = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ans[i][j] = mat[i][j];
            }
        }

        int visited[][] = new int[mat.length][mat[0].length];
        Queue<pair> q = new LinkedList<>();
        int dist =0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new pair(i,j,dist));
                    visited[i][j] = 1;
                    ans[i][j] = 0;
                }
            }
        }
        while(!q.isEmpty()){
            pair curr = q.remove();
            int r = curr.r;
            int c = curr.c;
            int d = curr.d;
            if(r>0 && mat[r-1][c]==1 && visited[r-1][c]==0){
                q.add(new pair(r-1,c,d+1));
                ans[r-1][c] = d+1;
                visited[r-1][c] = 1;
            }
            if(r<mat.length-1 && mat[r+1][c]==1 && visited[r+1][c]==0){
                q.add(new pair(r+1,c,d+1));
                ans[r+1][c] = d+1;
                visited[r+1][c] = 1;
            }
            if(c>0 && mat[r][c-1]==1 && visited[r][c-1]==0){
                q.add(new pair(r,c-1,d+1));
                ans[r][c-1] = d+1;
                visited[r][c-1] = 1;
            }
            if(c<mat[0].length-1 && mat[r][c+1]==1 && visited[r][c+1]==0){
                q.add(new pair(r,c+1,d+1));
                visited[r][c+1] = 1;
                ans[r][c+1] = d+1;
            }
        }
        return ans;
    }
}