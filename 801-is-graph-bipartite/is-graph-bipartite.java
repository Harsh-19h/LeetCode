class Solution {
    public static boolean dfs(int visited[], int color[] , int start, int graph[][]){
       for(int val: graph[start]){
            if(visited[val]==1){
                if(color[val]==color[start]) return false;
            }
            else{
                visited[val] =1;
                color[val] = (color[start]==1)?0:1;
                if(!dfs(visited,color,val,graph)) return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int visited[] = new int[graph.length];
        int color[]  = new int [graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(visited[i]==0){
                visited[i] = 1; color[i] =0;
                if(!dfs(visited,color,i,graph)) return false;
            }
        }
        return true;
    }
}