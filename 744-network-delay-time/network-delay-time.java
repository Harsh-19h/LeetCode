class Solution {
    class pair implements Comparable<pair>{
        int node;
        int time;
        pair(int node ,int time){
            this.node = node;
            this.time = time;
        } 
        public int compareTo(pair p){
            if(p.time==this.time) return this.node-p.node;
            return this.time-p.time;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
       List<List<pair>> list = new ArrayList<>();
       for(int i=0;i<=n;i++){
        list.add(new ArrayList<>());
       }
       for(int i=0;i<times.length;i++){
        int u = times[i][0];
        int v = times[i][1];
        int w = times[i][2];
        list.get(u).add(new pair(v,w));
       }
        int ans[] = new int[n+1];
       Arrays.fill(ans,Integer.MAX_VALUE);
       ans[k] = 0;

       PriorityQueue<pair> pq = new PriorityQueue<>();
       pq.add(new pair(k,0));
       while(!pq.isEmpty()){
            pair top = pq.remove();
            int node = top.node;
            int time = top.time;
            if(top.time > ans[node])continue;
            for(pair p: list.get(node)){
                int totaltime = p.time + top.time;
                if(totaltime< ans[p.node]){
                    ans[p.node] = totaltime;
                    pq.add(new pair(p.node,totaltime));
                }
            }
       }
       int max =-1;
       for(int i=1;i<ans.length;i++){
        max =Math.max(max,ans[i]);
       }
       if(max==Integer.MAX_VALUE) return -1;
       return max;

    }
}