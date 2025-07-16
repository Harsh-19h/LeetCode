
class Solution {
    public List<List<Integer>> helper(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int levelsize = q.size();
            List<Integer> levelans = new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode temp = q.remove();
                levelans.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            ans.add(levelans);
        }
        List<List<Integer>> finalans = new ArrayList<>();
        for(int i=ans.size()-1;i>=0;i--){
            finalans.add(ans.get(i));
        }
        return finalans;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return helper(root);
    }
}