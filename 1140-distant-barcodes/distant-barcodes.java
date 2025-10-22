class Solution {
    class pair implements Comparable<pair>{
        int data;
        int freq;
        pair(int data , int freq){
            this.data = data;
            this.freq = freq;
        }
        public int compareTo(pair p){
            if(p.freq==this.freq) return this.data - p.data;
            return p.freq-this.freq;
        }
    }
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<barcodes.length;i++){
            map.put(barcodes[i],map.getOrDefault(barcodes[i],0)+1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int key: map.keySet()){
            pq.add(new pair(key,map.get(key)));
        }
        int ans[] = new int[barcodes.length];
        pair prev = null;
        int i=0;
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            ans[i++] = curr.data;
            curr.freq--;
            if(prev!=null && prev.freq!=0){
                pq.add(prev);
            }
            prev = curr;
        }
        return ans;
    }
}