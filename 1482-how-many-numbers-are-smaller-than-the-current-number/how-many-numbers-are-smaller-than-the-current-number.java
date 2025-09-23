// OPTIMIZED APPROACH
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
     int arr[] = new int[nums.length];
     for(int i=0;i<nums.length;i++){
        arr[i] = nums[i];
     }   
     Arrays.sort(arr);
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],i);
        }
     }
     int ans[] = new int[arr.length];
     for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int idx = map.get(nums[i]);
            ans[i] = idx;
        }
     }
     return ans;
    }
}