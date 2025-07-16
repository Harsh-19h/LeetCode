
class Solution {
    public  List<Double> helper(TreeNode root, List<Double> arr){
        if(root==null) return arr;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            double sum = 0.0;
            for(int i=0;i<levelsize;i++){
                TreeNode temp = q.remove();
                sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            double avg = sum/levelsize;
            arr.add(avg);
        }
        return arr;
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr = new ArrayList<>();
        return helper( root, arr); 
    }
}