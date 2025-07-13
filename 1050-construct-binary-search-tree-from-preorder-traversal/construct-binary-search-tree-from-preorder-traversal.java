
class Solution {
    public TreeNode helper(int[] inorder, int[] preorder, int il,int ih, int pl, int ph){
        if(il>ih || pl>ph) return null;
        int r = il;
        while(inorder[r]!=preorder[pl]) r++;
        int ls = r-il;
        TreeNode root = new TreeNode (preorder[pl]);
        root.left = helper(inorder,preorder,il,r-1,pl+1,pl+ls);
        root.right = helper(inorder,preorder,r+1,ih,pl+ls+1,ph);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int [] inorder = Arrays.copyOf(preorder, n);
        Arrays.sort(inorder);
        return helper(inorder,preorder,0,n-1,0,n-1);
    }
}