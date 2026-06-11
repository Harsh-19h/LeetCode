public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

      ListNode tempA = headA;
      ListNode tempB = headB;

      int c1 = 0;
      while(tempA!=null){
        tempA = tempA.next;
        c1++;
      }

      int c2 = 0;
      while(tempB!=null){
        tempB = tempB.next;
        c2++;
      }

      int diff = Math.abs(c1-c2);
      tempA = headA;
      tempB = headB;

      if(c1>c2){
        for(int i=0;i<diff;i++){
            tempA = tempA.next;
        }
      }else{
        for(int i=0;i<diff;i++){
            tempB = tempB.next;
        }
      }

      while(tempA!=null && tempB!=null){
        if(tempA == tempB) return tempA;
        tempA = tempA.next;
        tempB = tempB.next;
      }

      return null;

    }
}