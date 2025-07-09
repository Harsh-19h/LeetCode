// optimized (dont create another tree modify this only (in-place))
class Solution {
    public void inorder(TreeNode root, List<TreeNode> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }

    public TreeNode balanced( List<TreeNode> list,int low,int high){
        if(low>high) return null;
        int mid = (low+high)/2;
        TreeNode root=list.get(mid);
        root.left = balanced(list,low,mid-1);
        root.right= balanced(list,mid+1,high);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
      List<TreeNode> list = new ArrayList<>();
      inorder(root,list); 
      return balanced(list,0,list.size()-1); 
    }
}