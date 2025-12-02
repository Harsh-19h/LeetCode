class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> positive = new LinkedList<>();
        Queue<Integer> negative = new LinkedList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0) positive.add(nums[i]);
        else negative.add(nums[i]);
       } 
       int k=0;
       for(int i=0;i<nums.length/2;i++){
        nums[k++] = positive.remove();
        nums[k++] = negative.remove();
       }
       return nums;
    }
}