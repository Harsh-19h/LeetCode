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
    public ListNode sortList(ListNode head) {
      PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val);
      ListNode temp = head;
      while(temp!=null){
        pq.add(temp); 
        temp= temp.next;
      } 
      ListNode ans = new ListNode(0);
      ListNode temp2 = ans;
      while(!pq.isEmpty()){
        ListNode key = pq.poll();
        temp2.next = key;
        temp2 = temp2.next;
      } 
      temp2.next = null;
      return ans.next;
    }
}