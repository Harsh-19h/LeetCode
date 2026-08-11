class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;

        int product = 1;
        int i=0;
        for(int j=0;j<nums.length;j++){
            product *= nums[j];

            while(i<nums.length && product>=k){
                product/= nums[i];
                i++;
            }

            if(product<k) ans+= j-i+1;
        }
        return ans;
    }
}