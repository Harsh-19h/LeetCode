class Solution {
    public int findLHS(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i],freq+1);
            } else map.put(nums[i],1);
        }
        Integer prevkey = null;
        for(Integer key: map.keySet()){
            if(prevkey!=null) {
                if(key - prevkey ==1){
                    int v1 = map.get(key);
                    int v2 = map.get(prevkey);
                    int currmax = v1+v2;
                    max = Math.max(currmax,max);
                }
            }
            prevkey=key;
        }
        if(max ==Integer.MIN_VALUE) return 0;
        else return max;
    }
}