class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int diff = k-nums[i];
            //used wrapper class because it can return null but primitive int cant store null will give NPE
            Integer diffcount = map.get(diff);
            if(diffcount!=null && diffcount>0){
                count++;
                map.put(diff,map.get(diff)-1);
            }else{
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else map.put(nums[i],1);
            }
        }
        return count;
    }
}