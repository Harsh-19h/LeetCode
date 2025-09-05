class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i],freq+1);
            } else map.put(nums[i],1);
        }
        int limit =(int) Math.floor(nums.length/3);
        ArrayList<Integer>ans = new ArrayList<>();
        for(int key: map.keySet()){
            int val = map.get(key);
            if(val>limit) ans.add(key);
        }
        return ans;
    }
}