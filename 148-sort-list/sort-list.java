class Solution {
    public ListNode sortList(ListNode head) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val);

        ListNode temp = head;
        while(temp!=null){
            pq.add(temp);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode point = dummy;
      
        while(!pq.isEmpty()){
            dummy.next = pq.remove();
            dummy = dummy.next;
        }
        dummy.next = null;

        return point.next;       
    }
}