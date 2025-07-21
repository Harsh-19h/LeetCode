
class Solution {
    public void inorder(TreeNode root, List<Integer>arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        long m1 = Long.MAX_VALUE;
        long m2 = Long.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<m1){
                m2 =m1;
                m1 =arr.get(i);
            }
            else if(arr.get(i)>m1 && arr.get(i)<m2){
                m2 =arr.get(i);
            }
        }
        if(m2 ==Long.MAX_VALUE) return -1;
        else return (int)m2;
    }
}