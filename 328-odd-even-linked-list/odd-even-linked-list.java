
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even =new ListNode(0);

        ListNode s1 =odd;
        ListNode s2 = even;

        ListNode temp = head;

        int count = 1;
        while(temp!=null){
            if(count%2!=0){
                odd.next = temp;
                odd = odd.next;
            }
            else{
                even.next = temp;
                even = even.next;
            }
            temp = temp.next;
            count++;
        }
        even.next = null;

        s1= s1.next;
        s2 = s2.next;
        odd.next = s2;

        return s1;

        

    }
}