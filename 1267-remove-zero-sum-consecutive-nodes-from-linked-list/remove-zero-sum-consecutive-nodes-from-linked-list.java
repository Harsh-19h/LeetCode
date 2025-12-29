
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {

        ListNode dummy = new ListNode (0);
        dummy.next = head;

        HashMap<Integer,ListNode> map = new HashMap<>();
        int prefix =0;
        map.put(0,dummy);

        while(head!=null){
            prefix += head.val;
            if(map.containsKey(prefix)){
                ListNode start = map.get(prefix);
                ListNode temp = start;
                int psum = prefix;
                while(temp!=head){
                    temp = temp.next;
                    psum+=temp.val;
                    if(temp!=head)
                    map.remove(psum);
                }
                start.next = head.next;
            } else{
                map.put(prefix,head);
            }
            head = head.next;
        }

        return dummy.next;
    }
}