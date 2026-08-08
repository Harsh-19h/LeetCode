class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;

        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int diff = sum - goal;

            if(map.containsKey(diff)){
                count += map.get(diff);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}