class Solution {
    public int minMirrorPairDistance(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int minDistance = Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        int digit = nums[i];
          if(map.containsKey(digit)){
            minDistance = Math.min(minDistance,i-map.get(digit));
        }
        int rev = 0;
        while(digit>0){
            int lastdigit = digit%10;
            rev = rev*10 + lastdigit;
            digit/=10;
        }
        map.put(rev,i);
      } 
      return (minDistance==Integer.MAX_VALUE)? -1 : minDistance;
    }
}