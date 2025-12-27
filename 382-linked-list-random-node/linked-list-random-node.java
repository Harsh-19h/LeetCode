
class Solution {
    Random rand ;
    ArrayList<Integer> list;

    public Solution(ListNode head) {
        ListNode temp = head;
         list = new ArrayList<>();
         rand = new Random();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
    }
    
    public int getRandom() {
        int random_index = rand.nextInt(list.size());
        return list.get(random_index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */