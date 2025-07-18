
class Solution {
     ArrayList<Integer> arr = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
        return;
    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int f=0;
        int l=arr.size()-1;
        while(f<l){
            int sum = (arr.get(f)+arr.get(l));
            if(sum==k) return true;
            if(sum<k) f++;
            else l--; 
        } 
        return false;
    }
}