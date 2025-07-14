class Solution {
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int sum =0;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;
        }
        sum+=dfs(root.left);
        sum+=dfs(root.right);
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root);
    }
}