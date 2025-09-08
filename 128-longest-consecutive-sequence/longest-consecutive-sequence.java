class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count = 1;
        int max = 1;
        Integer prev = null;
        for(Integer key : set){
            if(prev!=null){
                if(prev+1==key) count++;
                else{
                    count = 1;
                }
                max = Math.max(count,max);
            }
            prev = key;

        }
       return max;
    }
}