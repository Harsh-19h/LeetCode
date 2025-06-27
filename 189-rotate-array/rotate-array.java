class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        k=k%n;
        for(int i=n-k;i<n;i++){
            list.add(nums[i]);
        }
        for(int j=n-1;j>=k;j--){
            nums[j]=nums[j-k];
        }
        for(int a=0;a<k;a++ ){
            nums[a]=list.get(a);
        }
    }
}