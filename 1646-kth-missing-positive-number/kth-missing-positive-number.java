class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int val = 1;
        int count = 0;
        int idx = 0;

        while(idx!= arr.length){

            if(arr[idx]==val){
                idx++;           
            }else{
                count++;
                if(count==k) return val;
            }

            val++;
        }
        
        int diff = k-count-1;
        return val+diff;
    }
}