
class Solution {
    private int count=0;
    public void inorder(TreeNode root,List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return;
    }
    public TreeNode gst(TreeNode root,List<Integer> arr){
        if(root==null) return null;
        if(count==arr.size()) return root;
        gst(root.left,arr);
        root.val = arr.get(count);
        count++;
        gst(root.right,arr);
        return root;
    }
    public TreeNode convertBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
       inorder(root,arr); 
       for(int i=arr.size()-2;i>=0;i--){
        arr.set(i,arr.get(i)+arr.get(i+1));
       }
        count=0;
       return gst(root,arr);
    }
}