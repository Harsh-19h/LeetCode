class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max = 0;
        int count;
        for(int val: set){
            count = 1;
            if(set.contains(val-1)) continue;
            else{
                while(set.contains(val+1)){
                    count++;
                    val =  val+1;
                }
                max = Math.max(max,count);
            }
        }

        return max;
    }
}