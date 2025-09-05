class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<operations.length;i++){
            if(map.containsKey(operations[i][0])){
                int freq = map.get(operations[i][0]);
                map.put(operations[i][1],freq);
                map.remove(operations[i][0]);
            }
        }
        
        int ans[] = new int[nums.length];
        for(int key: map.keySet()){
            int idx = map.get(key);
            ans[idx] = key;
        }
        return ans;
    }
}