
class Solution {
    public ListNode reverse(ListNode temp){
        ListNode prev = null;
        ListNode curr = temp;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode t =  reverse(slow.next);
        slow.next = null;

        ListNode start =head;
        while(t!=null){
            ListNode temp1 = start.next;
            ListNode temp2 = t.next;
            start.next = t;
            t.next = temp1;
            start = temp1;
            t = temp2;
        }
        return;
    }
}

