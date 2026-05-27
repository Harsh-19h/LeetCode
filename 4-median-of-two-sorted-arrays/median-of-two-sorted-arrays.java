class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int [nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        for(int i=nums1.length;i<arr.length;i++){
            arr[i] = nums2[i-nums1.length];
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            int idx = arr.length/2;
            return arr[idx];
        } else{
            int idx1 = arr.length/2;
            int idx2 = (arr.length/2) -1;
            double ans = (arr[idx1] + arr[idx2]) /2.0;
            return ans;
        }
    }
}