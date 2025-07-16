
class Solution {
    public boolean equal(TreeNode root, TreeNode subRoot){
      if(root==null && subRoot==null) return true;
      if(root==null|| subRoot==null) return false;
      if(root.val!=subRoot.val) return false;
      return (equal(root.left,subRoot.left) && equal(root.right,subRoot.right));
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        boolean match = false;
          if(root.val ==subRoot.val){
           match = equal(root,subRoot);
        }
        if(match==true) return true;
        return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));
    }
}