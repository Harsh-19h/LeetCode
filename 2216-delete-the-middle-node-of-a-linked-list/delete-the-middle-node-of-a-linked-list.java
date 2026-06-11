
class Solution {
    public ListNode deleteMiddle(ListNode head) {

       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode temp = dummy;

       ListNode slow = head;
       ListNode fast = head;

       while(fast!=null && fast.next!=null ){
        slow = slow.next;
        fast = fast.next.next;
        temp = temp.next;
       } 

       temp.next = temp.next.next;

       return dummy.next;

    }
}