
class Solution {
        int mx ;
  public int pathsum(TreeNode root){
    if(root==null) return 0;
    int leftmax = Math.max(0,pathsum(root.left));
    int rightmax = Math.max(0,pathsum(root.right));
    int  total = leftmax+rightmax+root.val;
    mx = Math.max(mx,total);
    return (Math.max(leftmax,rightmax) + root.val);
  }
    public int maxPathSum(TreeNode root) {
      mx = Integer.MIN_VALUE;
        pathsum(root); 
        return mx;
    }
}