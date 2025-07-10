
class Solution {
    private int count=1;
    private int max = 0;
    private Integer prev = null;
    ArrayList<Integer> ans = new ArrayList<>();

    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!= null){
            if(root.val==prev){
                count++;
            } else{
                count=1;
            }
        }
        if(count>max){
            max = count;
            ans.clear();
            ans.add(root.val);
        }else if(count==max){
            ans.add(root.val);
        }
        prev = root.val;
        inorder(root.right);
        return;
    }
    public int[] findMode(TreeNode root) {
       inorder(root); 
       int mode[] = new int[ans.size()];
       for(int i=0;i<mode.length;i++){
        mode[i]= ans.get(i);
       }
       return mode;
    }
}