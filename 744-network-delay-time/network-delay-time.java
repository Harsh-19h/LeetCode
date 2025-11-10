// using Bellman Ford Algorithm
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int ans[] = new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k] =0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<times.length;j++){
               int a = times[j][0];
               int b = times[j][1];
               int c = times[j][2];
               if(ans[a] == Integer.MAX_VALUE) continue;
               else { 
                    if(ans[a]+c < ans[b]){
                    ans[b] = ans[a]+c;
                    }
                }
            }
        }
        int min=0;
        for(int i=1;i<ans.length;i++){
            min = Math.max(ans[i],min);
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}