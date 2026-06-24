class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int arr[] = new int[n+1];

        arr[0] = 0;
        int val = 0;
        int max = 0;
        for(int i=1;i<n+1;i++){
            arr[i] = val + gain[i-1];
            val = arr[i];
            max = Math.max(val,max);
        }
        return max;
    }
}