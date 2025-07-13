// OPTIMIZED (REVERSE PREORDER O(1) SPACE)
class Solution {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}