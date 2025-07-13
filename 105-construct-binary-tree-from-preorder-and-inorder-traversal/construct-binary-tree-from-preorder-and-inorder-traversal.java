
class Solution {
    public TreeNode helper(int[] preorder, int[] inorder, int pl, int ph, int il, int ih){
        if(pl>ph || il>ih) return null;
        TreeNode root = new TreeNode(preorder[pl]);
        int r=0;
        while(inorder[r]!=preorder[pl]) r++;
        int ls = r-il; //LST size
        root.left = helper(preorder,inorder,pl+1,pl+ls,il,r-1);
        root.right = helper(preorder,inorder,pl+ls+1,ph,r+1,ih);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
}