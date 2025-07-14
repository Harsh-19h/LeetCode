 class Solution {
    public int height(TreeNode root){
        int count = 0;
        while(root!=null){
            root =root.left;
            count++;
        }
        return count;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        if(leftheight==rightheight){
            int leftNodes = (int)Math.pow(2,leftheight);
            return leftNodes + countNodes(root.right);
        }
        else{
            int rightNodes = (int)Math.pow(2,rightheight);
            return rightNodes+countNodes(root.left);
        }
    }
}