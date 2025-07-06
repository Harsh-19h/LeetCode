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
    public static void dfs(TreeNode root,int remainingsum,ArrayList<Integer> path, List<List<Integer>> result){
        if(root==null) return;
        ArrayList<Integer> newPath = new ArrayList<>(path);
         newPath.add(root.val);
        if(root.left==null && root.right==null && remainingsum==root.val){
            result.add(newPath);
            return;
        }
        dfs(root.left,remainingsum-root.val,newPath,result);
        dfs(root.right,remainingsum-root.val,newPath,result);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), result);
        return result;
    }
}