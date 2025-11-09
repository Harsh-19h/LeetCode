class Solution {
    class pair{
        int node;
        int cost;
        pair(int node, int cost){
            this.node = node;
            this.cost = cost;
        }
    }
    class triplet {
        int val;
        int cost;
        int stops;
        triplet(int val,int cost, int stops){
            this.val = val;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
     List<List<pair>> list = new ArrayList<>();
     for(int i=0;i<n;i++){
        list.add(new ArrayList<>());
     }  
     for(int i=0;i<flights.length;i++){
        int a = flights[i][0];
        int b = flights[i][1];
        int c = flights[i][2];
        list.get(a).add(new pair(b,c));
     }
     int ans[] = new int[n];
     ans[src] =0;
     Arrays.fill(ans,Integer.MAX_VALUE);
     
     Queue<triplet> pq = new LinkedList<>();
     pq.add(new triplet(src,0,0));
     while(!pq.isEmpty()){
        triplet top = pq.remove();
        if(top.stops==k+1) continue;
        for(pair p: list.get(top.val)){
            int totalcost = top.cost + p.cost;
            if(totalcost< ans[p.node]){
                ans[p.node] = totalcost;
                pq.add(new triplet(p.node,totalcost,top.stops+1));
            }
        }
     }
     if(ans[dst]==Integer.MAX_VALUE) return -1;
     return ans[dst]; 
    }
}