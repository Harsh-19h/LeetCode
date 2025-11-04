class Solution {
    public boolean dfs(boolean visited[],List<List<Integer>> list, boolean path[],int i){
        visited[i] = true;
        path[i] = true;
        for(int j=0;j<list.get(i).size();j++){
            int curr = list.get(i).get(j);
            if(path[curr]==true) return false;
            else{
                if(visited[curr]==false){
                    if(dfs(visited,list,path,curr)==false) return false;
                }
            }
        }
        path[i] = false;
        return true;
    }
    public boolean canFinish(int n, int[][] pre) {
         List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
      
        for(int i=0;i<pre.length;i++){
            int a = pre[i][0];
            int b = pre[i][1];
            list.get(b).add(a);
        }
        boolean visited[] = new boolean[n];
        boolean path[] = new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i]==false){
                 if(dfs(visited,list,path,i)==false) return false;
            } 
        }
        return true;
    }
}