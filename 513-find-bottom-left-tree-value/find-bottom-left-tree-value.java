
class Solution {
    public int bfs(TreeNode root){
        Queue <TreeNode> q = new LinkedList<>();
        int ans = 0;
        if(root!=null) q.add(root);
        while(q.size()>0){
            TreeNode temp = q.remove();
            if(temp.right!=null) q.add(temp.right);
            if(temp.left!= null) q.add(temp.left);
            ans = temp.val;
        }
        return ans;
    }
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
      return bfs(root);   
    }
}