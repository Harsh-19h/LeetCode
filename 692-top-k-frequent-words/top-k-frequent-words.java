class Solution {
    class pair implements Comparable<pair> {
        String s;
        int val;
        pair(String s, int val){
            this.s = s;
            this.val = val;
        }
        public int compareTo(pair p){
            if(p.val==this.val) return this.s.compareTo(p.s);
            return p.val-this.val;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                int freq = map.get(words[i]);
                map.put(words[i],freq+1);
            } else map.put(words[i],1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(String key: map.keySet()){
            pair p = new pair(key,map.get(key));
            pq.add(p);
        }
       ArrayList<String> ans = new ArrayList<>();
       for(int i=0;i<k;i++){
        pair curr = pq.poll();
        ans.add(curr.s);
       }
        return ans;
    }
}