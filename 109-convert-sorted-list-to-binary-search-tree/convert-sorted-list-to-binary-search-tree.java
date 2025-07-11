
class Solution {
    public TreeNode balance(ArrayList<Integer> arr, int low ,int high){
        if(low>high) return null;
        int mid = (low + high)/2;
         TreeNode root = new TreeNode(arr.get(mid));
        root.left = balance(arr,low,mid-1);
        root.right = balance(arr,mid+1,high);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
       ListNode temp = head;
       ArrayList<Integer> arr = new ArrayList<>();
       while(temp!=null){
        arr.add(temp.val);
        temp= temp.next;
       } 
      return balance (arr,0,arr.size()-1);
    }
}