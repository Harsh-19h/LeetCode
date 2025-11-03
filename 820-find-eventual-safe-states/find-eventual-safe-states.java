class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
     List<List<Integer>> list = new ArrayList<>();
     for(int i=0;i<graph.length;i++){
        list.add(new ArrayList<>());
     }
     int outdegree[] = new int[graph.length];   
     for(int i=0;i<graph.length;i++){
        for(int j=0;j<graph[i].length;j++){
            int a = graph[i][j];
            list.get(a).add(i);
            outdegree[i]++;
        }
     }
     ArrayList<Integer> ans = new ArrayList<>();
     Queue<Integer> q = new LinkedList<>();
     for(int i=0;i<graph.length;i++){
        if(outdegree[i]==0){
            q.add(i);
            ans.add(i);
        } 
     }
     while(!q.isEmpty()){
        int top = q.remove();
        for(int i=0;i<list.get(top).size();i++){
            int curr = list.get(top).get(i);
            outdegree[curr]--;
            if(outdegree[curr]==0) {
                q.add(curr);
                ans.add(curr);
            }
        }
     }
      Collections.sort(ans);
      return ans;
    }
}