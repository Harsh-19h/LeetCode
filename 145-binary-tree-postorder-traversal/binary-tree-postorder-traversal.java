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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Postorder(root,ans);
        return ans;
    }
    public void Postorder(TreeNode root, ArrayList<Integer> ans){
        if(root == null){
            return ;
        }
        Postorder(root.left,ans);
        Postorder(root.right,ans);
        ans.add(root.val);
        return;
    }
}