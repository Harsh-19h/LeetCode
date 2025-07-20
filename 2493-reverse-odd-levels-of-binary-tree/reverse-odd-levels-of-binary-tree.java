
class Solution {
    public void helper(TreeNode left, TreeNode right, int level){
        if(left==null || right==null) return ;
        if(level%2!=0){
          int temp = left.val;
          left.val = right.val;
          right.val = temp;  
        }
        helper(left.left,right.right,level+1);
        helper(left.right,right.left,level+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
    helper(root.left, root.right, 1);
    return root;  
    }
}