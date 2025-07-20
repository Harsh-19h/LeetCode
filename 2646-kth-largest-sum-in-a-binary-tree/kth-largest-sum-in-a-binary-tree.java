
class Solution {
    public long helper(TreeNode root, int k){
        List<Long> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        long sum=0;
        while(!q.isEmpty()){
            int levelsize = q.size();
            sum=0;
            for(int i=0;i<levelsize;i++){
                TreeNode temp = q.poll();
                sum += temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            arr.add(sum);
        }
        Collections.sort(arr);
        if(k>arr.size()) return -1;
        return(arr.get(arr.size()-k));
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        return helper(root,k);
    }
}