class Solution {
    public boolean isValid(char[][] board, int row, int col){
        for(int i=0;i<9;i++){
            if( i!=col && board[row][i] == board[row][col]) return false;
        }

        for(int i=0;i<9;i++){
            if(i!=row && board[i][col]== board[row][col]) return false;
        }

        int start_i = row/3 *3;
        int start_j = col/3 *3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if( (start_i+i!=row || start_j+j!=col) && board[start_i+i][start_j+j] == board[row][col] ) return false;
            }
        }

        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                else{
                    if(isValid(board,i,j)==false) return false;
                }
            }
        }
        return true;
    }
}