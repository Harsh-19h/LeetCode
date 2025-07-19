// not to compare by value , compare nodes 
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(original);
        q2.add(cloned);
        while(!q1.isEmpty()){
            TreeNode temp1 =q1.poll();
            TreeNode temp2 = q2.poll();
            if(temp1==target) return temp2;
            if(temp1.left!=null){
                    q1.add(temp1.left);
                    q2.add(temp2.left);
            }
            if(temp1.right!=null){
                    q1.add(temp1.right);
                    q2.add(temp2.right);
            }
        }
        return null;
    }
}