class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int curr = nums[i];
            for(int j=1;j<=Math.sqrt(curr);j++){
                if(curr%j==0) {
                    temp.add(j);
                        if(j!=curr/j) temp.add(curr/j);
                }
            }
            if(temp.size()==4){
                for(int val: temp) ans+=val;
            }
        }
        return ans;
    }
}