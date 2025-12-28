
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       Stack<Integer> st = new Stack<>();
       Stack<Integer> st2 = new Stack<>();
       while(l1!=null){
        st.push(l1.val);
        l1=l1.next;
       } 
       while(l2!=null){
        st2.push(l2.val);
        l2 = l2.next;
       }

       int carry =0;
       ListNode head = null;

       while( !st.isEmpty() || !st2.isEmpty() || carry!=0){
        int sum = carry;
        if(!st.isEmpty())sum+=st.pop();
        if(!st2.isEmpty())sum+=st2.pop();
        ListNode curr = new ListNode(sum%10);
        curr.next = head;
        head =curr;
        carry = sum/10;
       }
       return head;
    }
}