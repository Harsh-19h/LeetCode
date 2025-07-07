class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
     int count = 0;
     if(root==null) return 0;
     if(root.val<=high && root.val>=low){
        count+=root.val;
     }  
     return count + rangeSumBST(root.left,low,high) +rangeSumBST(root.right,low,high); 
    }
}