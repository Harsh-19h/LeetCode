class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = new TreeNode(val);
        if(root==null) return temp;
        if(val<root.val){
            if(root.left==null){
                root.left=temp;
            }else{
                insertIntoBST(root.left,val);
            }
        }
        if(val>root.val){
            if(root.right==null){
                root.right=temp;
            }else{
                insertIntoBST(root.right,val);
            }
        }
        return root;
    }
}