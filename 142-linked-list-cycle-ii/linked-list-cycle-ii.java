
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; 

            if(slow==fast){
                slow = head;
                cycle = true;
                break;
            }
        }

        if(cycle){
            while(fast!=slow){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } 
        
         return null;
    }
}