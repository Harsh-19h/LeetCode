
class Solution {
    long maxP = 0;

    long totalSum(TreeNode root){
        if(root ==null) return 0;
         return root.val + totalSum(root.left) + totalSum(root.right);
    }
    long findMp(TreeNode root,long sum){
        if(root==null) return 0;

        long left = findMp(root.left,sum);
        long right = findMp(root.right,sum);
        long SubtreeSum = root.val + left + right;
        long remainingSum = sum -SubtreeSum;
        maxP = Math.max(maxP,SubtreeSum*remainingSum);
        return SubtreeSum;
    }
    public int maxProduct(TreeNode root) {
        if(root == null) return 0;
        long sum = totalSum(root);
        findMp(root,sum);
        return (int)(maxP%1000000007);
    }
}