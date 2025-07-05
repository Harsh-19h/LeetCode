
class Solution {
    static int max =0;
    public static int levels(TreeNode root){
        if(root==null) return 0;
        int lst = levels(root.left);
        int rst = levels(root.right);
        int ans = lst+rst;
        if(ans>max){
            max = ans;
        }
        return 1+Math.max(lst,rst);
    }
    public int diameterOfBinaryTree(TreeNode root) {
      max=0;
      levels(root);
      return max;  
    }
}