
class Solution {
    private int sum;
    void helper(TreeNode root, int low, int high){
        if(root==null) return ;
        helper(root.left,low,high);
        if(root.val>=low && root.val<=high) sum+=root.val;
        helper(root.right,low ,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        helper(root,low,high);
        return sum;
    }
}