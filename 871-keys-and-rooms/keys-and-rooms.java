class Solution {
    public void dfs(int idx ,List<List<Integer>> rooms, boolean canopen[]){
        canopen[idx] = true;
        for(int i=0;i<rooms.get(idx).size();i++){
            int curr = rooms.get(idx).get(i);
            if(!canopen [curr]) dfs(curr,rooms,canopen);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean ans = false;
        int n = rooms.size();
        boolean canopen[] = new boolean[n];
        dfs(0,rooms,canopen);
        for(int i=0;i<canopen.length;i++){
            if(canopen[i]==false) return false;
        }
        return true;
    }
}