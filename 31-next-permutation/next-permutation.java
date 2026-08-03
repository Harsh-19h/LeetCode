class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int idx = -1;

        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                idx = i-1;
                break;
            }
        }

        if(idx==-1){
            Arrays.sort(nums);
        } else {
            int min =Integer.MAX_VALUE ;
            int id = -1;
            for(int i=idx+1;i<n;i++){
                if(nums[i]>nums[idx]){
                    if(id==-1){
                        id = i;
                        min = Math.min(nums[i],min);
                    }
                    else {
                        if(nums[i]<min){
                            id = i;
                            min = nums[i];
                        }
                    } 
                }
            }

            int temp = nums[idx];
            nums[idx] = nums[id];
            nums[id] = temp;

            Arrays.sort(nums,idx+1,n);
        }

    }
}