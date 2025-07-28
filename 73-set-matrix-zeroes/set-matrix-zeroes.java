class Solution {
    public static boolean search(int val,ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==val) return true;
        }
        return false;
    }
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                boolean present =search(i,row);
                boolean present2 = search(j,col);
                if(present || present2 ==true){
                    matrix[i][j]=0;
                }
            }
        }
    }
}