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
    ArrayList<Integer> arr = new ArrayList<>();
    private int count =1;
    public void preorder(TreeNode root){
       if(root==null) return ;
       arr.add(root.val);
       preorder(root.left);
       preorder(root.right);
       return ;
    }
    public void helper(TreeNode root){
        if(root==null) return;
        if(count==arr.size()) return;
        root.left =null;
        root.right = new TreeNode (arr.get(count));
        count++;
        helper(root.right);
        return;
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        preorder(root);
        helper(root);
        return;
    }
}