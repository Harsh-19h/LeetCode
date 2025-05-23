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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
       return isEqual(root.left , root.right);
    }
    public boolean isEqual(TreeNode a,TreeNode b){
        if(a==null && b==null) return true;
        if(a==null && b!=null) return false;
        if(a!=null && b==null) return false;
        if(a.val!=b.val) return false;
        if(isEqual(a.left,b.right)==false) return false;
        if(isEqual(a.right,b.left)==false)return false;
        return true;
    }
}