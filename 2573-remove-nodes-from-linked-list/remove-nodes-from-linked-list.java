
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }

        Stack <Integer> st = new Stack<>();
        for(int i=list.size()-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(list.get(i));
            } else {
                if(list.get(i)>=st.peek()) st.push(list.get(i));
            }
        }

        ListNode ans = new ListNode(0);
        ListNode temp2 = ans;
        while(!st.isEmpty()){
            temp2.next = new ListNode(st.pop());
            temp2 = temp2.next;
        }
        return ans.next;
    }

}