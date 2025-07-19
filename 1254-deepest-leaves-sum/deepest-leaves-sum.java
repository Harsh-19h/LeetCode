
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public int helper(TreeNode root, int l){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum=0;
        int count=1;
        while(!q.isEmpty()){
            int levelsize = q.size();
            for(int i=0;i<levelsize;i++){
                TreeNode temp = q.poll();
                if(count==l && temp.left==null && temp.right==null) sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
             count++;
        }
        return sum;
    }
    public int deepestLeavesSum(TreeNode root) {
     int l =levels(root);
     return helper(root,l);  
    }
}