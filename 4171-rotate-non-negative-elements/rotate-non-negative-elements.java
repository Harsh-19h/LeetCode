class Solution {
    ArrayList<Integer> list;
    public void reverse(int start, int end){
        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
    public int[] rotateElements(int[] nums, int k) {
     list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) list.add(nums[i]);
        }
        if(list.size()==0) return nums;
         k = k % list.size();
        reverse(0,k-1);
        reverse(k,list.size()-1);
        reverse(0,list.size()-1);

        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i] = list.get(idx++);
            }
        }
        return nums;
    }
    
}