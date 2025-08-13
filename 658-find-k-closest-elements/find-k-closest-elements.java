class Solution {
    class pair implements Comparable<pair> {
        int element ;
        int diff ;
        pair(int element, int diff){
            this.element = element;
            this.diff = diff;
        }
        public int compareTo(pair p){
            if(this.diff==p.diff) return this.element-p.element;
            return this.diff-p.diff;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int diff = Math.abs(x-arr[i]);
            pq.add(new pair(arr[i],diff));
            if(pq.size()>k) pq.remove();
        }
        ArrayList ans = new ArrayList<>();
        while(pq.size()>0){
            pair rem = pq.remove();
            ans.add(rem.element);
        }
        Collections.sort(ans);
        return ans;
    }
}