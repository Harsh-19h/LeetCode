/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp = head;
        ListNode ans = new ListNode(0);
        ListNode temp2 = ans;
        while(temp!=null){
            if(set.contains(temp.val)){
                temp = temp.next;
            }else {
                temp2.next = new ListNode(temp.val);
                temp2 = temp2.next;
                temp= temp.next;
            }
        }
        return ans.next;
    }
}