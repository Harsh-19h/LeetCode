class Solution {
    public static int calculate(int weights[], int mid){
        int time = 0;
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum==mid){
                time++;
                sum = 0;
            }
            if(sum>mid){
                time++;
                sum = weights[i];
            }
        }
        if(sum>0) time++;
        return time;
    }
    public int shipWithinDays(int[] weights, int days) {
        int e = 0;
        int s = Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            e += weights[i];
            s = Math.max(s,weights[i]);
        }

        int ans = Integer.MAX_VALUE;

        while(s<=e){
            int mid = s+(e-s)/2;
            int time = calculate(weights,mid);

            if(time<=days){
                ans = Math.min(ans,mid);
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
}