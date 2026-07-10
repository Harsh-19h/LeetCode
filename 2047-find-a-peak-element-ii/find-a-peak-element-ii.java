class Solution {
    public static int calculate(int arr[]){
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                idx = i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int s =0;
        int e = mat.length-1;
        int ans[] = {-1,-1};
        while(s<=e){
            int mid = s+(e-s)/2;
            int maxidx= calculate(mat[mid]);
            int top = mid-1>=0 ? mat[mid-1][maxidx] : -1;
            int bottom = mid+1<=mat.length-1 ? mat[mid+1][maxidx]:-1;

            if(mat[mid][maxidx]> top && mat[mid][maxidx]>bottom){
                ans[0] = mid;
                ans[1] = maxidx;
                return ans;
            }
            else if(mat[mid][maxidx]<top) e = mid-1; 
            else s=mid+1;
        }
        return ans;
    }
}