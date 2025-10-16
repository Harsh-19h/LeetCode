class Solution {
    class pair implements Comparable<pair>{
        int val;
        int l;
        pair(int val,int l){
            this.val = val;
            this.l=l;
        }
        public int compareTo(pair p){
            if(this.val==p.val) return this.l-p.l;
            return p.val-this.val;
        }
    }
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0;i<values.length;i++){
            pq.add(new pair(values[i],labels[i]));
        }
        int count = 0;
        while(!pq.isEmpty()){
            pair p = pq.poll();
            int level = p.l;
            if(map.containsKey(level)){
                int freq = map.get(level);
                if(freq<useLimit){
                    sum+= p.val;
                    count++;
                    map.put(level,freq+1);
                }
            }
             else {
                 map.put(level,1);
                 sum+=p.val;
                 count++;
            }
            if(count==numWanted) break;
        }
        return sum;
    }
}