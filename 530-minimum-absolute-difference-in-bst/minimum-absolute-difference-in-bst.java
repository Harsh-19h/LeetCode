
class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
        return;
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            int diff =Math.abs(arr.get(i)-arr.get(i-1));
            if(diff<ans){
             ans = diff;
            }
        }
        return ans;
    }
}