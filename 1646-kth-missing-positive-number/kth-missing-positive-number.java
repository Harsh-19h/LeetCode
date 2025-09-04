class Solution {
    public int findKthPositive(int[] arr, int k) {
      HashSet<Integer> set = new HashSet<>();
      for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
      } 
        int count=0;
        int i =1;
        while(count!=k){
            if(!set.contains(i)) count++;
            if(count==k) return i;
            i++;
        }
        return 0;
    }
}