
class Solution {
    public List<List<Integer>> helper(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count =1;
        while(!q.isEmpty()){
            int levelsize = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode temp = q.remove();
                level.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            if(count%2==0) Collections.reverse(level);
            count++;
            ans.add(level);
        }
        return ans;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return helper(root);
    }
}