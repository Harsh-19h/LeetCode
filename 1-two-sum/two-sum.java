class Solution {
    public int[] twoSum(int[] nums, int target) {

        int ans[] = new int[2];

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
               int idx =  map.get(diff);
               if(idx!=i){
                    ans[0] = i; ans[1] = idx;
                    break;
               }
               
            }
        }
        return ans;
    }
}