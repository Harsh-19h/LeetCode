class Solution {
    public int pivotIndex(int[] nums) {
       int prefixsum[] = new int [nums.length];
       prefixsum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        int leftsum =-1;
        int rightsum =-1;
        for(int i=0;i<prefixsum.length;i++){
            if(i==0){
                leftsum =0;
                rightsum =prefixsum[prefixsum.length-1]-prefixsum[i];
                if(leftsum==rightsum) return i;
            }else if(i==prefixsum.length-1){
                leftsum = prefixsum[prefixsum.length-2];
                rightsum = 0;
                if(leftsum==rightsum) return i;
            }
            else{
                leftsum = prefixsum[i-1];
                rightsum = prefixsum[prefixsum.length-1]-prefixsum[i];
                if(leftsum==rightsum) return i;
            }
        }
        return -1;
    }
}