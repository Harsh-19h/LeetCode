class Solution {

    public int findGcd(int a, int b){
        if(b==0) return a;
        return findGcd(b,a%b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;

        while(curr!=null){
            int a = prev.val;
            int b = curr.val;
            int gcd = findGcd(a,b);
            ListNode temp = new ListNode(gcd);
            prev.next = temp;
            temp.next = curr;

            prev = curr;
            curr= curr.next;
        }
        return head;
    }
}