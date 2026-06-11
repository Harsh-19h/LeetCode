class Solution {
    public static ListNode reverse(ListNode curr){
        ListNode prev = null;
        while(curr!=null){
            ListNode n = curr.next;
            ListNode temp = curr;
            curr.next = prev;

            prev = temp;
            curr = n;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = reverse(slow);

        slow = head;
        while(slow!=null && curr!=null){
            if(slow.val != curr.val) return false;
            slow = slow.next;
            curr = curr.next;
        }
        return true;
    }
}