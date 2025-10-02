class Solution {
    public int maxFrequencyElements(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int freq = map.get(nums[i]);
            map.put(nums[i],freq+1);
        } else map.put(nums[i],1);
      } 
      int max = Integer.MIN_VALUE;
      for( int ele: map.keySet()){
        int val = map.get(ele);
       max = Math.max(max,val);
      }
      int maxfreq = 0;
      for( int ele: map.keySet()){
        int val = map.get(ele);
       if(val==max) maxfreq+=val;
      }
      return maxfreq;
    }
}