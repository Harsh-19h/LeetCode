class Solution {
    public static boolean bfs(int visited[], int color[] , int start, int graph[][]){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 1;
        color[start] = 0;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int val : graph[curr]){
                if(visited[val]==1){
                    if(color[val] == color[curr]) return false;
                }else{
                    visited[val] =1;
                    q.add(val);
                    color[val] = (color[curr]==1)?0:1;
                }
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
                if(!bfs(visited,color,i,graph)) return false;
            }
        }
        return true;
    }
}