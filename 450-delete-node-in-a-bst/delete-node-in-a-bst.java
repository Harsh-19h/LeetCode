
class Solution {
    public TreeNode iop(TreeNode root){
        TreeNode pred = root.left;
        while(pred.right!=null) pred = pred.right;
        return pred;
    }
    public TreeNode Parent(TreeNode root,TreeNode pred){
        if(root.left==pred || root.right==pred) return root;
        TreeNode pp = root.left;
        while(pp.right!=pred) pp=pp.right;
        return pp;

    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null || root.right==null){
                if(root.left==null) return root.right;
                else return root.left;
            }
            else{
                TreeNode pred = iop(root);
                TreeNode predParent = Parent(root,pred);
                if(root==predParent){
                    pred.right = root.right;
                    return pred;
                }
                predParent.right = pred.left;
                pred.left = root.left;
                pred.right = root.right;
                return pred;
            }

        }
        else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else{
            root.left = deleteNode(root.left,key);
        }
        return root;
    }
}