class Solution {
    public static void bfs(boolean visited[],List<List<Integer>> rooms,int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int val: rooms.get(curr)){
                if(visited[val]==false){
                    q.add(val);
                    visited[val] = true;
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean [rooms.size()];
        bfs(visited,rooms,0);
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
}