class Solution {
    public ListNode mergeNodes(ListNode head) {
       ListNode temp = head.next;
       int sum =0;
       ListNode ans = new ListNode(-1);
       ListNode temp2 = ans;

       while(temp!=null){
        if(temp.val!=0){
            sum+=temp.val;
        }else {
            temp2.next = new ListNode (sum);
            temp2 = temp2.next;
            sum =0;
        }
        temp = temp.next;
       }
       return ans.next; 
    }
}