
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }

        if(head==null) return null;

        if(k>=count) k%=count;

        if(k==0) return head;

        temp = head;
        for(int i =1;i<count-k;i++){
            temp = temp.next;  
        }

        ListNode start = temp.next;
        temp.next = null;

        ListNode curr = start;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = head;

        return start;
    }
}