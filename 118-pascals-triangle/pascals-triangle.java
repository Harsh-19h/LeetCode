class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> curr = new ArrayList<>();
            if(i<2){
                for(int j =0;j<i;j++){
                    curr.add(1);
                }
            }else{
                List<Integer> prev = ans.get(ans.size()-1);
                curr.add(1);
                for(int k=0;k<prev.size()-1;k++){
                    int val = prev.get(k) + prev.get(k+1);
                    curr.add(val);
                }
                curr.add(1);
            }
            ans.add(curr);
        }
        return ans;
    }
}