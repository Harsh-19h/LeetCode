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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        ListNode temp = head;
        for(int i=0;i<k;i++){
            if(temp==null) return head;
            temp =temp.next;
        }
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;
        int count = 0;
        for(int i=0;i<k;i++){
            next = curr.next;
           curr.next=prev;
           prev = curr;
           curr = next; 
           count++;
        }
        head.next = reverseKGroup(curr,k);
        return prev;
    }
}