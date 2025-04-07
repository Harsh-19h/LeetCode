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
    public void paths(TreeNode root,String s,ArrayList<String> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
        }
        paths(root.left,s +root.val +"->",ans);
        paths(root.right,s +root.val +"->",ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
       ArrayList<String> ans = new ArrayList<>();
       paths(root,"",ans);
       return ans; 
    }
}