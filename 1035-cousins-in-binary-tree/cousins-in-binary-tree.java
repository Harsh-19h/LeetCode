
class Solution {
    int levelofx = 0, levelofy = 0;
    TreeNode parentofx = null, parentofy=null;

    public void helper(TreeNode root,int level, int x, int y){
        if(root==null) return ;
        if(root.left!=null){
            if(root.left.val==x){
                levelofx = level+1 ;
                parentofx = root;
            }
            else if(root.left.val==y){
                levelofy=level+1;
                parentofy=root;
            }
        }
        if(root.right!=null){
            if(root.right.val==y){
                levelofy =level+1;
                parentofy = root;
            }
            else if(root.right.val==x){
                levelofx =level+1; 
                parentofx = root;
            }
        }
        helper(root.left,level+1,x,y);
        helper(root.right,level+1,x,y);
        return;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        levelofx = -1;
        levelofy = -1;
        parentofx = null;
        parentofy = null;
        int level =0;
        helper(root,level,x,y);
        return ((levelofx ==levelofy) && (parentofx!=parentofy));
    }
}