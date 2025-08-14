class Solution {
    class pair implements Comparable<pair> {
        int num;
        int freq;
        pair(int num,int freq){
            this.num = num;
            this.freq = freq;
        }
        public int compareTo(pair p){
            if(p.freq==this.freq) return p.num-this.num;
            return this.freq-p.freq;
        }
    }
    public int[] frequencySort(int[] nums) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i],freq+1);
            } else map.put(nums[i],1);
        }
        for(int key: map.keySet()){
            int val = map.get(key);
            pq.add(new pair(key,val));
        }
        int k=0;
        while(pq.size()!=0){
            pair p = pq.remove();
            int f = p.freq;
            for(int i=k;i<k+f;i++){
                nums[i]=p.num;
            }
            k+=f;
        }
        return nums;
    }
}