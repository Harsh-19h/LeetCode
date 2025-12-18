class Solution {
    public int minDeletionSize(String[] strs) {
        int l = strs[0].length();
        int n = strs.length;
        char arr[][] = new char[n][l];
        for(int i=0;i<n;i++){
            String temp = strs[i];
            for(int j=0;j<l;j++){
                arr[i][j] = temp.charAt(j);
            }
        }
        //compairing
        int count =0;
        for(int j=0;j<l;j++){
            for(int i=1;i<n;i++){
                if(arr[i][j]<arr[i-1][j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}