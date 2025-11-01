class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        int indegree[] = new int[n];
        for(int i=0;i<pre.length;i++){
            int a = pre[i][0];
            int b = pre[i][1];
            list.get(b).add(a);
            indegree[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
             q.add(i);
        }
        int count =0;
        while(!q.isEmpty()){
            int curr = q.poll();
            count++;
            for(int i=0;i<list.get(curr).size();i++){
                int top = list.get(curr).get(i);
                indegree[top]--;
                if(indegree[top]==0){
                    q.add(top);
                } 
            }
        }
        if(count<n) return false;
        return true;
    }
}