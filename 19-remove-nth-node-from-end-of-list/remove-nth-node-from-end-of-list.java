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
    public ListNode removeNthFromEnd(ListNode head, int n) {

       ListNode temp = head;
       int count =1;
       while(temp.next!=null){
            temp = temp.next;
            count++;
       } 
       
       if(count==1 && n==1) return null;
       int ns = count - n;
       if(ns==0) return head.next;
       ListNode curr = head;
       for(int i=1;i<ns;i++){
        curr = curr.next;
       }

       if(curr.next.next!=null) curr.next = curr.next.next;
       else curr.next = null;
       return head;
    }
}