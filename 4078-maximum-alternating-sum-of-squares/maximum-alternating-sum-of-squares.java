class Solution {
    public long maxAlternatingSum(int[] nums) {
       for(int i=0;i<nums.length;i++){
        nums[i] = Math.abs(nums[i]);
       }
        Arrays.sort(nums);

        Stack<Integer> small = new Stack<>();
        Stack<Integer> large = new Stack<>();
       int i = 0; int j=nums.length-1; int k=0;
       while(i<=j){
        if(i==j)large.push(nums[i]);
        small.push(nums[i]);
        large.push(nums[j]);
        i++; j--; 
       }

       long ans =0;
       while(!large.isEmpty()){
        long curr = large.pop();
        ans += (curr * curr);
       }
       while(!small.isEmpty()){
        long cur = small.pop();
        ans-= (cur*cur);
       }
       return ans;
    }
}