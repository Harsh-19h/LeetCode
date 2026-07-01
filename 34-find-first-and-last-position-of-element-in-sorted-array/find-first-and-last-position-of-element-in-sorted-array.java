class Solution {
    public static void lower(int nums[], int ans[] ,int l, int r,int target){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                ans[0] = mid;
                r = mid-1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else r = mid-1;
        }
    }
    public static void upper (int nums[], int ans[], int l, int r,int target){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                ans[1] = mid;
                l = mid+1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else r = mid-1;
        }

    }
    public int[] searchRange(int[] nums, int target) {
      int ans[] = {-1,-1};
      int l = 0;
      int r = nums.length-1;

        lower(nums,ans,l,r,target);
        upper(nums,ans,l,r,target);
        
        return ans;
      
    }
}