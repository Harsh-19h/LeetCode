class Solution {
    class triplet implements Comparable<triplet>{
        int node;
        int parent;
        int cost;
        triplet(int node, int parent, int cost){
            this.node = node;
            this.parent = parent;
            this.cost = cost;
        }
        public int compareTo(triplet t){
            return this.cost - t.cost;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        pq.add(new triplet(0,-1,0));
        int sum = 0;
        boolean visited[] = new boolean [points.length];
        while(!pq.isEmpty()){
          triplet top = pq.remove();
          if(visited[top.node]==true) continue;
          sum+= top.cost;
          visited[top.node] =true;  
          for(int i=0;i<points.length;i++){
            if(i==top.node || i== top.parent) continue;
            if(visited[i]==true) continue;
            int x1 = points[top.node][0];
            int y1 = points[top.node][1];
            int x2 = points[i][0];
            int y2 = points[i][1];
            int distance = Math.abs(x1-x2)+ Math.abs(y1-y2);
            pq.add(new triplet(i,top.node,distance));
          }
        }
        return sum;
    }
}