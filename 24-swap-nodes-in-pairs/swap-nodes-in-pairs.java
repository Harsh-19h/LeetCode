
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode temp = head;
        ListNode n = temp.next;
        ListNode start = n;
        ListNode prev = null;

        while(temp!=null && temp.next!=null){
            n = temp.next;
            temp.next = n.next;
            n.next = temp;

            if(prev!=null) prev.next = n;
            prev = temp;
            temp = temp.next;
           
        }
        return start;
    }
}