class Solution {
    public static int count(int arr[]){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) total++;
        }
        return total;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = -1;
        int max = Integer.MIN_VALUE;
        int ans[] = {1,-1};
        for(int i=0;i<mat.length;i++){
            int ones = count(mat[i]);
            if(ones>max){
                max = ones;
                row = i;
            }
        }
        ans[0] = row;
        ans[1] = max;
        return ans;
    }
}