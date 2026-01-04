// Optimized without Arraylist
class Solution {
    public int sumFourDivisors(int[] nums) {
       int ans =0;
       for(int i=0;i<nums.length;i++){
        int curr = nums[i];
        int sum =0;
        int count =0;
        for(int j=1;j*j<=curr;j++){
            if(curr%j==0){
                int d1 =j;
                int d2 = curr/j;
                if(d1==d2){
                    count++;
                    sum+=d1;
                } else{
                    count+=2;
                    sum += d1 + d2;
                }
                if(count>4) break;
            }
        }
        if(count==4) ans+=sum;
       } 
       return ans;
    }
}