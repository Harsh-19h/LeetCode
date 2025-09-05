class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
      for(int i = 0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int freq = map.get(nums[i]);
            map.put(nums[i],freq+1);
        } else map.put(nums[i],1);
      }  
      int sum = 0;
      for(int key: map.keySet()){
        int freq = map.get(key);
        if(freq==1) sum+= key;
      }
      return sum;
    }
}