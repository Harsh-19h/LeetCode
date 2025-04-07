/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void sum(TreeNode root,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){
        if(root==null) return ;
        ArrayList<Integer> newList = new ArrayList<>(list);
        newList.add(root.val);
        if(root.right==null && root.left==null){
        ans.add(newList);
        return; 
        }
        sum(root.left,newList,ans);
        sum(root.right,newList,ans);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();
        sum(root,list,ans);
        List<List<Integer>> finalans = new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            int total=0;
            ArrayList<Integer> subList = ans.get(i);
            for(int j=0;j<subList.size();j++){
                total=total+subList.get(j);
            }
            if(total==targetSum) 
           finalans.add(subList);
        }
        return finalans;
    }
}