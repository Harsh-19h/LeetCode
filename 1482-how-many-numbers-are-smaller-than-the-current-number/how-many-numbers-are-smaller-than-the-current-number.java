class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]= nums[i];
        }
        Arrays.sort(arr);
        int ans[] = new int[arr.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<arr.length;j++){
                if(nums[i]==arr[j]) {
                    ans[i] =j;
                    break;
                }
            }
        }
        return ans;
    }
}