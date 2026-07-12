class Solution {
    class pair{
        char key;
        int val;
        pair(char key, int val){
            this.key = key;
            this.val = val;
        }
    }
    public String frequencySort(String s) {
       StringBuilder ans = new StringBuilder();

       HashMap<Character, Integer> map = new HashMap<>();
       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }

       PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->b.val-a.val);
       for(char Key: map.keySet()){
        int v = map.get(Key);
        pq.add(new pair(Key,v));
       }

       while(!pq.isEmpty()){
        pair curr = pq.remove();
            for(int i=0;i<curr.val;i++){
                ans.append(curr.key);
            }
       }
       return ans.toString();
    }
}