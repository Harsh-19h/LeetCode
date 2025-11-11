class Solution {
    public int findTheCity(int n, int[][] edges, int threshold) {
     int[][] dist = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            dist[u][v] = w;
            dist[v][u] = w;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j==k) continue;
                    if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!= Integer.MAX_VALUE){
                        dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        int mincity = -1;
        int mincount = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(dist[i][j]<=threshold) count++;
            }
            if(count<=mincount){
                mincount = count;
                mincity = i;
            }
        }
        return mincity;
    }
}