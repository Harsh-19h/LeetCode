class Solution {
    public static boolean Bs(int[][] matrix, int target,int ans){
         int low = 0;
        int high = matrix[0].length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[ans][mid]==target) return true;
            else if(matrix[ans][mid]>target) high = mid-1;
            else low = mid+1;
        }
        return false;  
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==1) return Bs(matrix,target,0);

        int s = 0;
        int e = matrix.length-1;
        int ans = Integer.MAX_VALUE;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(matrix[mid][0]==target) return true;
            else if(matrix[mid][0]>target){
                ans = Math.min(ans,mid);
                e = mid-1;
            }
            else s = mid+1;
        }
        if(ans==Integer.MAX_VALUE) return Bs(matrix,target,matrix.length-1);
        else if(ans==0) return false;
        else return Bs(matrix ,target,ans-1);
    }
}