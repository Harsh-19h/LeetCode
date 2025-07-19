
class Solution {
    public int deepestLeavesSum(TreeNode root) {
     Queue<TreeNode> q = new LinkedList<>();
     q.add(root);
     int sum=0;
     while(!q.isEmpty()){
        int levelsize = q.size();
         sum =0;
        for(int i=0;i<levelsize;i++){
            TreeNode temp = q.poll();
            sum+=temp.val;
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
     }   
     return sum;
    }
}