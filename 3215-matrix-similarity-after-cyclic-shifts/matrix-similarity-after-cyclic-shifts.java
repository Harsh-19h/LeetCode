class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k = k%n;
        int ans[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    ans[i][j] = mat[i][(j+k)%n];
                }else{
                    ans[i][j] = mat[i][(j-k+n)%n];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != ans[i][j]) return false;
            }
        }
        return true;
    }
}