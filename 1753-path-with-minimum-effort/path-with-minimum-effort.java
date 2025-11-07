class Solution {
    class triplet implements Comparable<triplet> {
        int row;
        int col;
        int effort;
        triplet(int row,int col,int effort){
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
        public int compareTo(triplet t){
            if(this.effort == t.effort) return this.row -t.row;
            return this.effort - t.effort;
        }
    }
    public int minimumEffortPath(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int ans[][] = new int[r][c];
        for(int i=0;i<r;i++){
            Arrays.fill(ans[i],Integer.MAX_VALUE);
        }
        ans[0][0] = 0;
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        pq.add(new triplet(0,0,0));
        while(!pq.isEmpty()){
            triplet curr = pq.remove();
            int row = curr.row;
            int col =curr.col;
            int effort = curr.effort;
            if(row==r-1 && col==c-1) break;
            if(row>0){  
                int e = Math.abs(arr[row][col]-arr[row-1][col]);
                e = Math.max(effort,e);
                if(e<ans[row-1][col]){
                    ans[row-1][col]=e;
                    pq.add(new triplet(row-1,col,e));
                }
            }
            if(col>0){
                int e = Math.abs(arr[row][col]-arr[row][col-1]);
                e = Math.max(effort,e);
                if(e<ans[row][col-1]){
                    ans[row][col-1]=e;
                    pq.add(new triplet(row,col-1,e));
                }
            }
             if(row<r-1){
                int e = Math.abs(arr[row][col]-arr[row+1][col]);
                e = Math.max(effort,e);
                if(e<ans[row+1][col]){
                    ans[row+1][col]=e;
                    pq.add(new triplet(row+1,col,e));
                }
            }
            if(col<c-1){
                int e = Math.abs(arr[row][col]-arr[row][col+1]);
                e = Math.max(effort,e);
                if(e<ans[row][col+1]){
                    ans[row][col+1]=e;
                    pq.add(new triplet(row,col+1,e));
                }
            }

        }
        return ans[r-1][c-1];
    }
}