class Solution {

    public long calculate(int piles[], int mid){
        long totalTime = 0;

        for(int i=0;i<piles.length;i++){
            totalTime += (int)Math.ceil( (double) piles[i]/mid);
        }

        return totalTime;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<piles.length;i++){
            max = Math.max(piles[i],max);
        }

        int s = 1;
        int e = max;
        while(s<=e){
            int mid = s+(e-s)/2;

            long time = calculate(piles,mid);
            if(time<=h){
                ans = Math.min(ans,mid);
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
}