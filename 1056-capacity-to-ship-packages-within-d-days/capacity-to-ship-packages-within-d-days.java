class Solution {
    public static int calculate(int weights[], int mid){
        int count = 0;
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            sum+= weights[i];
            if(sum>mid){
                count++;
                sum = weights[i];
            }
            else if(sum == mid){
                count++;
                sum = 0;
            }
            else{
                continue;
            }
        }
        if(sum>0) count++;
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s = 0;
        int e = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<weights.length;i++){
            s = Math.max(s,weights[i]);
            e += weights[i];
        }

        while(s<=e){
            int mid = (s+e)/2;
            int d = calculate(weights, mid);

            if(d<=days){
                ans = Math.min(ans,mid);
                e = mid-1;
            }else {
                s = mid+1;
            }
        }
        return ans;
    }
}