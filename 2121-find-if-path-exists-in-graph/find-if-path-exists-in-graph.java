class Solution {
    public void bfs(List<List<Integer>> list,int source, boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int front = q.poll();
            for(int i=0;i<list.get(front).size();i++){
                int curr = list.get(front).get(i);
                if(visited[curr]==false){
                    q.add(curr);
                    visited[curr] =true;
                }
            }
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
        bfs(list,source,visited);
        if(visited[destination]== false) return false;
        return true;
    }
}