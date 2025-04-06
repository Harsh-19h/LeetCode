/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean exists(TreeNode root,TreeNode p){
        if(root==null) return false;
        if(root==p) return true;
        if(exists(root.left,p)==true)return true;
        if(exists(root.right,p)==true) return true;
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root ||q==root) return root;
        boolean pliesinLST = exists(root.left,p);
        boolean qliesinLST = exists(root.left,q);
        if(pliesinLST==true && qliesinLST==true) return lowestCommonAncestor(root.left,p,q);
        if(pliesinLST==false && qliesinLST==false) return lowestCommonAncestor(root.right,p,q);
        if(pliesinLST==true && qliesinLST==false) return root;
        if(pliesinLST==false && qliesinLST==true) return root;
        else return root;
    }
}