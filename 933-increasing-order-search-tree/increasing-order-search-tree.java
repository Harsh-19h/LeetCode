
class Solution {
    private int count =0;
    public void inorder(TreeNode root, List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }

    public TreeNode helper(List<Integer> arr){
        if(count>=arr.size()) return null;
        TreeNode temp = new TreeNode(arr.get(count++));      
        temp.left = null;
        temp.right= helper(arr);
        return temp;
    }
    public TreeNode increasingBST(TreeNode root) {
        count = 0;
        List<Integer> arr= new ArrayList<>();
        inorder(root,arr);
        return helper(arr);
    }
}