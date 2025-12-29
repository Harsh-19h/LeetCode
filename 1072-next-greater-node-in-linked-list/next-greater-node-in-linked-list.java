class Solution {
    public int[] nextLargerNodes(ListNode head) {
     ArrayList<Integer> list = new ArrayList<>();
     ListNode temp = head;
     while(temp!=null){
        list.add(temp.val);
        temp = temp.next;
     } 

     int ans[] = new int [list.size()];
     Stack<Integer>st = new Stack<>();

     for(int i=0;i<list.size();i++){
        while(!st.isEmpty() && list.get(i)>list.get(st.peek())){
            int idx = st.pop();
            ans[idx] = list.get(i);
        }
        st.push(i);
     } 
     return ans; 
    }
}