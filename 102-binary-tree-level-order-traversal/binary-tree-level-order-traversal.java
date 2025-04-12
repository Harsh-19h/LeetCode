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
    public static int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.right),level(root.left));
    }
    public static List<Integer> levelorder(TreeNode root,int lvl, int n){
        List<Integer> list = new ArrayList<>();
        if(root==null) return list ;
        if(lvl==n){
            list.add(root.val);
        }else {
        list.addAll(levelorder(root.left,lvl+1,n));
        list.addAll(levelorder(root.right,lvl+1,n));
        }
        return list;
    }

    public  List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = level(root);
        for(int i=0;i<n;i++){
            ans.add(levelorder(root,0,i));
        }  
        return ans;     
    }
}