class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       int ans[] ={-1,-1}; 
       ArrayList<Integer> list = new ArrayList<>();
       ListNode temp = head;
       ListNode prev = null;
       ListNode n = head.next;
       int count =1;

       while(temp.next!=null){
        if(prev!=null && n!=null){
            if(temp.val>prev.val && temp.val>n.val || temp.val<prev.val && temp.val<n.val) list.add(count);
        }
        count++;
        temp = temp.next;
        if(prev==null){
            prev = head;
        }else prev = prev.next;
        n =n.next;
       }

       if(list.size()<2) return ans;
       ans[1] = list.get(list.size()-1) -list.get(0);
       int min = Integer.MAX_VALUE;
       for(int i=1;i<list.size();i++){
        int currmin = list.get(i) - list.get(i-1);
        if(currmin<min) min = currmin;
       } 
       ans[0] = min;
       return ans;
    }
}