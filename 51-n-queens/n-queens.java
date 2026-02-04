class Solution {
    List<List<String>> ans = new ArrayList<>();
    
    public boolean isValid(List<String> board, int row, int col,int n){
        for(int i=row-1;i>=0;i--){
            if(board.get(i).charAt(col) == 'Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n; i--,j++){
            if(board.get(i).charAt(j)=='Q') return false;
        }
        for(int i= row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board.get(i).charAt(j)=='Q') return false;
        }

        return true;
    }
    public void solve(List<String> board, int row,int n){
        if(row>=n){
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int col = 0;col<n;col++){
            if(isValid(board,row,col,n)){
                StringBuilder newRow = new StringBuilder( board.get(row));
                newRow.setCharAt(col,'Q');
                board.set(row,newRow.toString());

                solve(board,row+1,n);

                newRow.setCharAt(col,'.');
                board.set(row,newRow.toString());
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        if(n==0) return ans;
        List<String> board = new ArrayList<>();
        for(int i =0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(".");
            }
            board.add(sb.toString());
        }

        solve(board,0,n);
        return ans;
    }
}