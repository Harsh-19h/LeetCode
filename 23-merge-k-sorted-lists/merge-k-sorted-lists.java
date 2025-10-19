
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
         ListNode curr = lists[i];
            while(curr!=null){
                pq.add(curr);
                curr =  curr.next;
            }
        } 
        if(pq.isEmpty()) return null;
           
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            node.next = null;
            temp.next = node;
            temp = temp.next;
        }
        return head.next;
    }
}