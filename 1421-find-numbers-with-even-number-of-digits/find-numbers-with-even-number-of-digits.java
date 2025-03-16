class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
           int n = nums[i];
           int count = 0;
           while(n>0){
            int digit = n%10;
            count ++;
            n = n/10;
           } 
           if(count%2==0){
            total++;
           }
        }
        return total;
    }
}