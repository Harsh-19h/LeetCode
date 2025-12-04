/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry =0;
        while(l1!=null && l2!=null){
            int value = (l1.val +l2.val);
            temp.next = new ListNode((value + carry)%10);
            carry = (value+carry)/10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            temp.next = new ListNode ((l1.val+carry)%10);
            carry = (l1.val+carry)/10;
            l1 = l1.next;
            temp= temp.next;
        }
        while(l2!=null){
            temp.next = new ListNode ((l2.val+carry)%10);
            carry = (l2.val+carry)/10;
            l2 = l2.next;
            temp = temp.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
        }
        ans = ans.next;
        return ans;
    }
}