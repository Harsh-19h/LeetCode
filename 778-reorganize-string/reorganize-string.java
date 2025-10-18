class Solution {
    class pair implements Comparable<pair>{
        char c;
        int val;
        pair(char c, int val){
            this.c = c;
            this.val = val;
        }
        public int compareTo(pair p){
            if(this.val==p.val) return this.c - p.c;
            return p.val - this.val;
        }
    }

    public String reorganizeString(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       } 

       PriorityQueue<pair> pq = new PriorityQueue<>();
       for(char key : map.keySet()){
        pq.add(new pair(key,map.get(key)));
       }

       StringBuilder ans = new StringBuilder();
       pair prev = null;
       while(!pq.isEmpty()){
        pair curr = pq.poll();
        ans.append(curr.c);
        curr.val--;

        if(prev!=null && prev.val!=0){
            pq.add(prev);
        }
        prev = curr;
       }

            if (prev != null && prev.val > 0) {
            return ""; // impossible to reorganize
        }
        
       for(int i=1;i<ans.length();i++){
        if(ans.charAt(i)==ans.charAt(i-1)) return "";
       }
       return ans.toString();
    }
}