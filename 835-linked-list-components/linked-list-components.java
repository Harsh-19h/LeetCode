class Solution {
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp = head;
        int count =0;
        HashSet<Integer> set = new HashSet<>();
        for(int value:nums) set.add(value);

        while(temp!=null){
            if(set.contains(temp.val) && (temp.next==null || !set.contains(temp.next.val))) count++;
            temp = temp.next;
        }
        return count;
    }
}