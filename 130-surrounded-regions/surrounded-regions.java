class Solution {
    class pair{
        int r;
        int c;
        pair(int r,int c){
            this.r = r;
            this.c = c;
        }
    }
    public void solve(char[][] board) {
        Queue<pair> q = new LinkedList<>();
        int visited[][] = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if((i==0 || i==board.length-1 || j==0 || j==board[0].length-1) && board[i][j]=='O'){
                    q.add(new pair(i,j));
                    visited[i][j] =1;
                }
            }
        }
        while(!q.isEmpty()){
            pair curr = q.remove();
            int r = curr.r;
            int c = curr.c;
            if(r>0 && board[r-1][c]=='O' && visited[r-1][c]==0){
                visited[r-1][c] = 1;
                q.add(new pair(r-1,c));
            }
            if(r<board.length-1 && board[r+1][c]=='O' && visited[r+1][c]==0){
                visited[r+1][c] = 1;
                q.add(new pair(r+1,c));
            }
            if(c>0 && board[r][c-1]=='O' && visited[r][c-1] ==0){
                visited[r][c-1] = 1;
                q.add(new pair(r,c-1));
            }if(c<board[0].length-1 && board[r][c+1]=='O' && visited[r][c+1]==0){
                visited[r][c+1] = 1;
                q.add(new pair(r,c+1));
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O' && visited[i][j]==0){
                    board[i][j] = 'X';
                }
            }
        }
    }
}