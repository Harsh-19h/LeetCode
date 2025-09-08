// OPTIMIZED APPROACH (O(n))
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count = 1;
        int max = 0;
        for(int key: set){
            if(!set.contains(key-1)){
                int curr = key;
                count = 1;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}