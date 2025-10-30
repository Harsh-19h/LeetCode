class Solution {
    public boolean bfs(int visited[], int[][] graph,int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = 1;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int j=0;j<graph[curr].length;j++){
                int c = graph[curr][j];
                if(visited[c]==-1){
                    q.add(c);
                     if(visited[curr]==1) visited[c] = 0;
                    else if(visited[curr]==0) visited[c]=1;
                }else{
                    if(visited[curr]==visited[c]) return false;
                }    
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int visited[] =new int[n];
        Arrays.fill(visited,-1);
        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                if(!bfs(visited,graph,i)) return false;
            }
        }
        return true;
    }
}