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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val);
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null) pq.add(lists[i]);
        }

        if(pq.isEmpty()) return null;

        ListNode dummy = new ListNode(0);
        ListNode start = dummy;
        while(!pq.isEmpty()){
            ListNode curr = pq.remove();
            if(curr.next!=null) pq.add(curr.next);
            start.next = curr;
            start = start.next;
        }

        return dummy.next;
    }
}