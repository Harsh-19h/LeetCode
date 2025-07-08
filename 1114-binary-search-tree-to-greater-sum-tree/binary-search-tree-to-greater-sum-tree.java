// SPACE OPTIMIZED   (reverse inorder traversal)
class Solution {
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
       if(root==null) return root;
       bstToGst(root.right);
       root.val+=sum;
       sum=root.val;
       bstToGst(root.left);
       return root; 
    }
}