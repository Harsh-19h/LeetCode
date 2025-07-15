
class Solution {
    public ArrayList<Integer> bfs(TreeNode root, ArrayList<Integer> ans){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
             int max = Integer.MIN_VALUE;
            int levelsize =q.size(); 
            for(int i=0;i<levelsize;i++){
                TreeNode temp = q.remove();
                if(temp.val>max){
                    max =temp.val;
                }
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            }
            ans.add(max);
        }
        return ans;
    }

    public List<Integer> largestValues(TreeNode root) {
        ArrayList <Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        return bfs(root,ans);
        
    }
}