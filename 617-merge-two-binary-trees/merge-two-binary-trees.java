
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
      if(root1==null && root2==null) return null;
      int newval = 0;
      if(root1!=null) newval+=root1.val;
      if(root2!=null) newval+=root2.val;
      TreeNode merge = new TreeNode(newval);

      TreeNode left1 = null;
      if(root1!=null && root1.left!=null)  left1 = root1.left;
      TreeNode left2 =null;
      if(root2!=null && root2.left!=null) left2 = root2.left;
      merge.left = mergeTrees(left1,left2);

        TreeNode right1 = null;
      if(root1!=null && root1.right!=null)  right1 = root1.right;
      TreeNode right2 =null;
      if(root2!=null && root2.right!=null) right2 = root2.right;
      merge.right = mergeTrees(right1,right2);
      return merge;
    }
}