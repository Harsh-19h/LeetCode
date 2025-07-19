
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(cloned);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.val==target.val) return temp;
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        return null;
    }
}