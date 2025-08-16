
class Solution {
    ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
    public void helper(TreeNode root,ArrayList<Integer> list){
        if(root==null) return ;
        ArrayList<Integer> newlist = new ArrayList<>(list);
        newlist.add(root.val);
        if(root.left==null && root.right==null){
            ans.add(newlist);
            return ;
        } 
        helper(root.left,newlist);
        helper(root.right,newlist);
    }
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root,list);
        int total = 0;
        for(int i=0;i<ans.size();i++){
            ArrayList temp = ans.get(i);
            int sum =0;
            for(int j=0;j<temp.size();j++){
                int t = (int)temp.get(j);
                sum = (sum*10) + t;
            }
            total +=sum;
        }
        return total;
    }
}