class Solution {
    public void bfs(int idx ,List<List<Integer>> rooms, boolean canopen[]){
        canopen[idx] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        while(!q.isEmpty()){
            int front = q.poll();
            for(int i=0;i<rooms.get(front).size();i++){
                int curr = rooms.get(front).get(i);
                if(canopen[curr]==false){
                q.add(curr);
                canopen[curr] = true;
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean ans = false;
        int n = rooms.size();
        boolean canopen[] = new boolean[n];
        bfs(0,rooms,canopen);
        for(int i=0;i<canopen.length;i++){
            if(canopen[i]==false) return false;
        }
        return true;
    }
}