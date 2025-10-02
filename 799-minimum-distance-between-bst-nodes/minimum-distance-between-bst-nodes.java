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
   public TreeNode prev;
    public int ans;
    public int helper(TreeNode root){
        if(root==null) return ans;
        helper(root.left);
        if(prev!=null){
            int min = Math.abs(root.val - prev.val);
            ans = Math.min(ans,min);
        } 
        prev = root;
        helper(root.right);
        return ans;
    }
    public int minDiffInBST(TreeNode root) {
         prev = null;
         ans = Integer.MAX_VALUE;
      return helper(root) ; 
    }
}