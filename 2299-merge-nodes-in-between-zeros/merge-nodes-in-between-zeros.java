// optimize in-place way
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = head;
        ListNode curr = head.next;
        int sum =0;

        while(curr!=null){
            if(curr.val!=0) sum+=curr.val;
            else{
                ans.val = sum;
                ans.next = curr.next;
                ans = ans.next;
                sum =0;
            }
            curr = curr.next;
        }
        return head;
    }
}