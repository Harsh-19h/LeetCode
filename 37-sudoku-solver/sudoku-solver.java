class Solution {

    public boolean isValid(char[][] board, int row, int col, char k){
        for(int i=0;i<board.length;i++){
            if(board[row][i] == k) return false;
        }

         for(int i=0;i<board.length;i++){
            if(board[i][col] == k) return false;
        }

        int start_i = row/3 * 3;
        int start_j = col/3 * 3;
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
              if(board[start_i+i][start_j+j] ==k) return false;
            }
        }

        return true; 
    }

    public boolean solve(char board[][]){
         for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.') continue;
                else{
                    for(char k='1';k<='9';k++){
                        if(isValid(board,i,j,k)){
                            board[i][j] = k;
                            if(solve(board)==true) return true;
                            board[i][j] = '.';
                        }   
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
       solve(board);
    }
}