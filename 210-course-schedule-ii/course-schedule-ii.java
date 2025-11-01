class Solution {
    public int[] findOrder(int n, int[][] pre) {
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
        int ans[] = new int[n];
        int idx =0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
                ans[idx++] = i;
            } 
        }
        while(!q.isEmpty()){
            int top = q.poll();
            for(int i=0;i<list.get(top).size();i++){
                int curr = list.get(top).get(i);
                indegree[curr]--;
                if(indegree[curr]==0){
                    q.add(curr);
                    ans[idx++]=curr;
                }
            }
        }
        
        if(idx<n) return new int[0];
        return ans;
    }
}