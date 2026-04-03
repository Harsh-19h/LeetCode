class Solution {
    public boolean dfs(int[] visited, int[] pathvi,int safe[], int[][] graph,int start){
        visited[start] = 1;
        pathvi [start] =1;
        for(int val: graph[start]){
            if(visited[val]==1){
                if(pathvi[val]==1) return true;
            } else{
                if(dfs(visited,pathvi,safe,graph,val)==true) return true;
            }
        }
        safe[start] = 1;
        pathvi[start] = 0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int visited[] = new int[graph.length];
        int pathvi[] = new int[graph.length];
        int safe[] = new int[graph.length];
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(visited[i]==0){
                dfs(visited,pathvi,safe,graph,i);
            }
        }
        for(int i=0;i<graph.length;i++){
            if(safe[i]==1) ans.add(i);
        }
        return ans;
    }
}