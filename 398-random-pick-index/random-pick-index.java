class Solution {
HashMap<Integer,List<Integer>> map;
Random rand;
    public Solution(int[] nums) {
        map = new HashMap<>();
        rand = new Random();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            } 
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> list = map.get(target);
        int random_index = rand.nextInt(list.size());
        return list.get(random_index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */