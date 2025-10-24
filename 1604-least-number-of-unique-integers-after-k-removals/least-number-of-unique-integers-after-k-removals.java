// OPTIMIZED APPROACH
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

     HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }

      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
      pq.addAll(map.keySet());

      while(k>0 && !pq.isEmpty()){
        int top = pq.poll();
        int freq = map.get(top);
        if(freq<=k){
           k-=freq;
           map.remove(top); 
        } else break;
      }
      return map.size();
    }
}