class Solution {
    class pair implements Comparable<pair>{
        int num;
        int freq;
        pair(int num,int freq){
            this.num = num;
            this.freq = freq;
        }
        public int compareTo(pair p){
            if(this.freq==p.freq) return this.num-p.num;
            return this.freq-p.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int [k];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int f = map.get(nums[i]);
                map.put(nums[i],f+1);
            }else map.put(nums[i],1);
        }
        for(int key: map.keySet()){
            int val = map.get(key);
            pq.add(new pair(key,val));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0;i<k;i++){
            pair pr = pq.remove();
            ans[i]=pr.num;
        }
        return ans;
    }
}