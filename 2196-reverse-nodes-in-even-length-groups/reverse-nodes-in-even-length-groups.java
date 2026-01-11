
class Solution {
    public ListNode rev(ListNode head, int secCount){
        ListNode curr = head;
        ListNode prev = null;
        while(secCount-- > 0 && curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        head.next = curr;
        return prev;
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int secCount = 1;
        ListNode dummy = new ListNode (0);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;

        while(curr!=null){
            int count = 0;
            ListNode temp = curr;
            while(count<secCount && temp!=null){
                temp = temp.next;
                count++;
            }
            if(count%2==0){
                prev.next = rev(curr,count);
                prev = curr;
                curr = curr.next;
            } else{
                for(int i=0;i<count;i++){
                    prev = curr;
                    curr = curr.next;
                }
            }
            secCount++;
        }
        return dummy.next;
    }
}