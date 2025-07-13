
class Solution {
    public TreeNode helper(int[] inorder, int[] postorder, int il, int ih, int pl,int ph){
        if(il>ih || pl<ph) return null;
        int r =0;
        while(inorder[r]!= postorder[pl]) r++;
        int ls= r-il;
        TreeNode root = new TreeNode(postorder[pl]);
        root.left = helper(inorder,postorder,il,r-1,ph+ls-1,ph);
        root.right = helper(inorder,postorder,r+1,ih,pl-1,ph+ls);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(inorder,postorder,0,n-1,n-1,0);
    }
}