class Solution {

    public static int calculate(int bloomDay[], int mid, int m, int k){
        int count =0;
        int totalbq = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(mid>=bloomDay[i]) count++;
            else{
                totalbq += count/k;
                count = 0;
            }
        }
        totalbq += count/k;

        return totalbq;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k) return -1;

        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<bloomDay.length;i++){
            s = Math.min(s,bloomDay[i]);
            e = Math.max(e,bloomDay[i]);
        }

        while(s<=e){
            int mid = s+ (e-s)/2;
            int total = calculate(bloomDay,mid,m,k);

            if(total>=m){
                ans = Math.min(ans,mid);
                e = mid-1;
            }else s = mid+1;
        }
         return ans;
    }
}