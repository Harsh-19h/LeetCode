class Solution {
    class pair implements Comparable<pair>{
        char ch ;
        int val;
        pair(char ch, int val){
            this.ch = ch;
            this.val = val;
        }
       public int  compareTo(pair p){
            if(this.val==p.val) return this.ch-p.ch;
            return this.val-p.val;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1);
            } else map.put(ch,1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(char key: map.keySet()){
            int freq = map.get(key);
            pq.add(new pair(key,freq));
        }
        StringBuilder ans = new StringBuilder();
        while(pq.size()!=0){
            pair temp = pq.remove();
             int count = temp.val;
             for(int i=0;i<count;i++){
                ans.append(temp.ch);
             }
        }
        return ans.toString();
    }
}