/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    public static boolean preorder(TreeNode root){
        if(root==null) return true;
        if(Math.abs(levels(root.left)-levels(root.right))>1){
            return false;
        }
       return (preorder(root.left) && preorder(root.right));
    }
    public boolean isBalanced(TreeNode root) {
       boolean ans= preorder(root);
       return ans;
    }
}