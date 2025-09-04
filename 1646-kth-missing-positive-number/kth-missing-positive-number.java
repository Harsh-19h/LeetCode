class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count =0;
        int i =1;
        int idx=0;
        while(count!=k){
            if(idx>=arr.length || arr[idx]!=i){
             count++;
             if(count==k) return i;
             i++;
            }else {
                i++;
                idx++;
            }   
        }
        return 0;
    }
}