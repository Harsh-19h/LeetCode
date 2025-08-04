class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        int pro = 1;
        int p=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
            if(nums[i]!=0){
                p*=nums[i];
            }else{
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
           if(count>=2){
            answer[i]=0;
           } else if(count==1){
                if(nums[i]==0){
                    answer[i] = p;
                }else{
                    answer[i]=0;
                }
           } else{
            answer[i] = pro/nums[i];
           }
        }
        return answer;
    }
}