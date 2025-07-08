
class Solution {
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return arr;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=arr.get(i-1)){
                return false;
            }
        }
        return true;
    }
}