class Solution {

    public static int helper(int nums[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int n = nums.length;

        int i =0 ;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.size()>k){
                count += n-j;
               
                int freq = map.get(nums[i]);
                if(freq==1) map.remove(nums[i]);
                else map.put(nums[i],freq-1);

                i++;
            }
        }
        return count; 
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
      int count1 = helper(nums,k);
      int count2 = helper(nums,k-1);

      return count2-count1;
    }
}