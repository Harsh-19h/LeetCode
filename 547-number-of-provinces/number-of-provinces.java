class Solution {
    public static void bfs(int idx,boolean visited[],int [][] isConnected){
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        visited[idx] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[curr][i]==1 &&  visited[i]==false){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] = new boolean [n];
        int ans = 0;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                bfs(i,visited,isConnected);
                ans++;
            }
        }
        return ans;    
    }
}