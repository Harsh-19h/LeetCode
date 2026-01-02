
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count =1;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        ListNode a = head;
        for(int i=1;i<k;i++) a = a.next;
        ListNode b = head;
        for(int i=1;i<=count-k;i++) b = b.next;
        int temp2 = a.val;
        a.val = b.val;
        b.val = temp2;
        return head;
    }
}