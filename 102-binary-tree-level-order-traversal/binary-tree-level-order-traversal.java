
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    if(root==null) return ans;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(q.size()!=0){
        int levelsize = q.size();
         ArrayList<Integer> level = new ArrayList<>();
        for(int i=0;i<levelsize;i++){
            TreeNode temp = q.remove();
           level.add(temp.val);
           if(temp.left!=null) q.add(temp.left);
           if(temp.right!=null) q.add(temp.right);
        }
        ans.add(level);
    }
    return ans;
    }
}