
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean nullchild = false;
        while(q.size()!=0){
            TreeNode temp = q.remove();

            if(temp.left!=null){
                if(nullchild) return false;
                q.add(temp.left);
            }else nullchild = true;

            if(temp.right!=null){
                if(nullchild) return false;
                q.add(temp.right);
            } else nullchild = true;
        }
        return true;
    }
}