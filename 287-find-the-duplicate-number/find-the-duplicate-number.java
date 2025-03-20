class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
    //     int ans = 0;
    //    for(int i = 0;i<n;i++){
    //     for(int j = i+1;j<n;j++){
    //         if(nums[i]==nums[j]){
    //             ans=nums[i];
    //             break;
    //         }
    //     }
    //    } 
    //    return ans;

    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=nums[i];
    }
    Arrays.sort(arr);
    int ans=0 ;
    for(int i=0;i<n-1;i++){
        if(arr[i]==arr[i+1]){
            ans = arr[i];
            break;
        }
    }
    return ans;
    }
}