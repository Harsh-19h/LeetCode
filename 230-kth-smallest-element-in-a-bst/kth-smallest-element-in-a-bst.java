// space and time optimized
class Solution {
    private int count =0;
    private int ans = -1;
    public void inorder(TreeNode root, int k){
        if(root==null) return ;
        inorder(root.left,k);
        count++;
        if(count==k){
            ans = root.val;
            return;
        }
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
}