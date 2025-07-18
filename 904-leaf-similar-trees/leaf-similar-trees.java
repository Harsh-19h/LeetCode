
class Solution {
    public void helper(TreeNode root1, List<Integer> arr){
        if(root1==null) return;
        if(root1.left==null && root1.right==null) arr.add(root1.val);
        helper(root1.left,arr);
        helper(root1.right,arr);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr =new ArrayList<>();
        helper(root1,arr);
        helper(root2,brr);
        return arr.equals(brr);
    }
}