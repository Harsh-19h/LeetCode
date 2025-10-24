class Solution {
    class pair implements Comparable<pair>{
        int val;
        int freq;
        pair(int val, int freq){
            this.val = val;
            this.freq = freq;
        }
        public int compareTo(pair p){
            return this.freq-p.freq;
        }
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }
      PriorityQueue<pair> pq = new PriorityQueue<>();
      for(int key: map.keySet()){
        pq.add(new pair(key,map.get(key)));
      }
      while(k>0){
        pair curr = pq.remove();
        if(curr.freq>1) pq.add(new pair(curr.val,curr.freq-1));
        k--;
      }
      return pq.size();
    }
}