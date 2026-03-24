class Solution {
    public static void bfs(boolean visited[],int source,List<List<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int val: adj.get(curr)){
                if(visited[val]==false){
                    q.add(val);
                    visited[val] = true;
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean visited[] = new boolean [n];
        bfs(visited,source,adj);
        if(visited[destination]==false) return false;
        return true;
    }
}