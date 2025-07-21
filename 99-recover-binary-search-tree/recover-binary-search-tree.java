
class Solution {
    public void inorder(TreeNode root, List<TreeNode> arr){
        if(root==null) return ;
        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right,arr);
    }
    public void recoverTree(TreeNode root) {
        List<TreeNode> arr= new ArrayList<>();
       inorder(root,arr); 
       TreeNode x =null , y=null;
       for(int i=0;i<arr.size()-1;i++){
        if(arr.get(i).val>arr.get(i+1).val){
            y = arr.get(i+1);
            if(x==null) x = arr.get(i);
            else{
                break;
            }
        }
       }
       int temp = x.val;
       x.val=y.val;
       y.val=temp;
    }
}