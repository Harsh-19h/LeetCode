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
        return 1+Math.max(levels(root.left),levels(root.right));
    }

    public static void preorder(TreeNode root, int level, List<Integer> arr){
        if(root == null){
            return;
        }
        arr.set(level,root.val);
        preorder(root.left,level+1,arr);
        preorder(root.right,level+1,arr);
    }

    public List<Integer> rightSideView(TreeNode root) {
        int n= levels(root);
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(0);
        }
        preorder(root,0,arr);
        return arr;
    }

}