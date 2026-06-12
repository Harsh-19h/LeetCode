class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry =0;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val;
            sum+=carry;

            if(sum>=10) {
                carry = sum/10;
                sum = sum%10;
            }
            else carry = sum/10;

            temp.next = new ListNode(sum);
            temp  = temp.next;

            l1 = l1.next;
            l2 = l2.next;
            
        }

        while(l1!=null){
           int sum = l1.val+ carry;
           if(sum>=10){
            carry = sum/10;
            sum = sum%10;
           }
           else carry = sum/10;
           temp.next = new ListNode(sum);
           temp = temp.next;
           l1 = l1.next;
        }

        while(l2!=null){
           int sum = l2.val+ carry;
           if(sum>=10){
            carry = sum/10;
            sum = sum%10;
           }
           else carry = sum/10;
           temp.next = new ListNode(sum);
           temp = temp.next;
           l2 = l2.next;
        }

        if(carry>0){
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        return dummy.next;

    }
}