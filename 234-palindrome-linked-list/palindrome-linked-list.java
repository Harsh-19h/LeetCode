
class Solution {
    public static ListNode reverse(ListNode curr){
        ListNode prev = null;
        ListNode temp = curr;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
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
        while(slow!=null && curr !=null){
            if(slow.val != curr.val) return false;
            slow = slow.next;
            curr = curr.next;
        }
        return true;
    }
}