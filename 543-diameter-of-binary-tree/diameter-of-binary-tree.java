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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int rootdiameter= (level(root.left)+level(root.right)+1)-1;
        int leftdiameter = diameterOfBinaryTree(root.left);
        int rightdiameter = diameterOfBinaryTree(root.right);
        return Math.max(rootdiameter,Math.max(leftdiameter,rightdiameter));
    }
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(level(root.left),level(root.right));
    }
}