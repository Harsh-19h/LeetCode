class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum = 0;
        for(int key: map.keySet()){
            int freq = map.get(key);
            if(freq%k==0) sum += (freq*key);
        }
        return sum;
    }
}