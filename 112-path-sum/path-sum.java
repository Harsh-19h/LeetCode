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
    public static void sum(TreeNode root,int start,ArrayList<Integer> ans){
        if(root==null) return ;
        start+=root.val;
        if(root.left==null && root.right==null){
            ans.add(start);
            return;
        }
        sum(root.left,start,ans);
        sum(root.right,start,ans);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
     ArrayList<Integer> ans = new ArrayList<>();
     sum(root,0,ans);
     for(int i =0;i<ans.size();i++){
        if(ans.get(i)==targetSum) return true;
     } 
     return false;  
    }
}