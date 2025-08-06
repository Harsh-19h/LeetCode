class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = target - nums[i];
            if(map.containsKey(key)){
                arr[1] = map.get(key);
                arr[0] = i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}