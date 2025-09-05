// OPTIMIZED CODE 
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
      }  
      for(int i=0;i<operations.length;i++){
        int oldvalue = operations[i][0];
        int newvalue = operations[i][1];
        int idx = map.get(oldvalue);
        nums[idx] = newvalue;
        map.remove(oldvalue);
        map.put(newvalue,idx);
      }
      return nums;
    }
}