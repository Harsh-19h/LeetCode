class Solution {
    class pair implements Comparable<pair>{
        int val;
        double pro;
        pair(int val,double pro){
            this.val = val;
            this.pro = pro;
        }
        public int compareTo(pair p){
            if(p.pro == this.pro) return p.val-this.val;
            return Double.compare(p.pro,this.pro);
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<pair>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            list.get(a).add(new pair(b,succProb[i]));
            list.get(b).add(new pair(a,succProb[i]));
        }
        double ans[] = new double[n];
        Arrays.fill(ans,0);
        ans[start_node] = 1;
        
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(start_node,1));
        while(!pq.isEmpty()){
            pair top = pq.remove();
            for(int i=0;i<list.get(top.val).size();i++){
                pair p = list.get(top.val).get(i);
                double totalpro = top.pro * p.pro;
                if(totalpro>ans[p.val]){
                    ans[p.val] = totalpro;
                    pq.add(new pair(p.val,totalpro));
                }
            }
        }
        return ans[end_node];
    }
}