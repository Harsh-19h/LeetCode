
class Solution {
    public void inorder(TreeNode root, List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            int diff = (arr.get(i)-arr.get(i-1));
            if(diff<ans) ans =diff;
        }
        return ans;
    }
}