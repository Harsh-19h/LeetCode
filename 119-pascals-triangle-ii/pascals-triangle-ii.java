class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            ArrayList<Integer> curr = new ArrayList<>();
            if(i==0) curr.add(1);
            else if(i==1){
                for(int j=0;j<=i;j++){
                    curr.add(1);
                }
            }else{
                List<Integer> prev =ans.get(ans.size()-1);
                curr.add(1);
                for(int k=0;k<prev.size()-1;k++){
                    int val = prev.get(k) + prev.get(k+1);
                    curr.add(val);
                }
                curr.add(1);
            }
            ans.add(curr);
        }
        return ans.get(ans.size()-1);
    }
}