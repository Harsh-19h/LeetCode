class Solution {
    class pair implements Comparable<pair>{
        int val;
        int idx;
        pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
        public int compareTo(pair p){
            return this.val-p.val;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.add(new pair(score[i],i));
        }
        String ans[] = new String[score.length];
        int count = 1;
        for(int i=0;i<ans.length;i++){
            pair p = pq.remove();
            int idx =  p.idx;
            if(count==1){
                 ans[idx]="Gold Medal";
                 count++;
            } else if (count==2){
                ans[idx]= "Silver Medal";
                count++;
            }else if (count==3){
                ans[idx] = "Bronze Medal";
                count++;
            }else{
                String s =Integer.toString(count);
                ans[idx]= s;
                count++;
            }  
        }
        return ans;
    }
}