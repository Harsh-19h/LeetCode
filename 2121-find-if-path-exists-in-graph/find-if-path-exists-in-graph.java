// (DFS) APPROACH
class Solution {
    public void dfs(List<List<Integer>> list,int source, boolean visited[]){
        visited[source] = true;
        for(int i=0;i<list.get(source).size();i++){
            int curr = list.get(source).get(i);
            if(visited[curr]==false) dfs(list,curr,visited);
        }
        
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0;i<edges.length;i++){
            int a = edges[i][0]; int b = edges[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        boolean visited[] = new boolean[n];
        visited[source] =true;
        dfs(list,source,visited);
        if(visited[destination]== false) return false;
        return true;
    }
}