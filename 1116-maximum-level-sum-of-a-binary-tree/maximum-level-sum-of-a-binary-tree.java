
class Solution {
    public int maxLevelSum(TreeNode root) {
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       int level =1;
       int sum=0;
       int ans=0;
       int maxsum = Integer.MIN_VALUE;
       while(!q.isEmpty()){
        int levelsize = q.size();
        sum=0;
        for(int i=0;i<levelsize;i++){
            TreeNode temp = q.poll();
            sum+=temp.val;
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        if(sum>maxsum){
          maxsum = sum;
          ans = level;  
        } 
        level++;
       } 
       return ans;
    }
}