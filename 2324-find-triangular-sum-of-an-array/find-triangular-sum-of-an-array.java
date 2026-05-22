class Solution {
    public int triangularSum(int[] nums) {

        if(nums.length==1) return nums[0];

        int n = nums.length;
        int count = n;
        ArrayList<Integer> prev = new ArrayList<>();
        for(int i=0;i<n;i++){
            prev.add(nums[i]);
        }
        while(count>1){
            ArrayList<Integer> curr = new ArrayList<>();
            for(int i=0;i<count-1;i++){
                int val = (prev.get(i) + prev.get(i+1))%10;
                curr.add(val);
            }
            prev = new ArrayList<>(curr);
            count--;
        }
        return prev.get(0);
    }
}